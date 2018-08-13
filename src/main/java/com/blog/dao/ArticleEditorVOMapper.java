package com.blog.dao;

import org.apache.ibatis.annotations.Many;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.blog.vo.ArticleEditerVO;

@Component
@Mapper
public interface ArticleEditorVOMapper extends BaseMapper<ArticleEditerVO> {

	@Select("select a.id, a.title, a.content, a.category_id, c.name as category_name, r.tag_id from t_article a left join t_category c on a.category_id = c.id left join t_article_tag r on a.id = r.tag_id where a.id = #{id}")
	@Results(@Result(column = "tag_id", property = "tags", many = @Many(select = "com.blog.dao.TagMapper.listTags")))
	ArticleEditerVO getArticleEditorVOByIdUsingAnnotation(@Param("id") Integer id);

	ArticleEditerVO getAritcleEditorVOByIdUsingXml(Integer id);
}
