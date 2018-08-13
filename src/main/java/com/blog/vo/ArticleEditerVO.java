package com.blog.vo;

import java.util.List;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.blog.entity.Tag;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@TableName("v_article_editor")
public class ArticleEditerVO {

	private Integer id;
	private String title;
	private String content;
	private Integer categoryId;
	private String categoryName;
	@TableField(exist = false)
	private List<Tag> tags;
}
