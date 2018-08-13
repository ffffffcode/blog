package com.blog.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.blog.entity.Tag;

@Component
@Mapper
public interface TagMapper extends BaseMapper<Tag> {

	@Select("select id, name from t_tag")
	List<Tag> listTags();
}
