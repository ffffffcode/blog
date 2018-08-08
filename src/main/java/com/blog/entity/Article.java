package com.blog.entity;

import com.baomidou.mybatisplus.annotations.TableName;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@TableName("t_article")
public class Article {

	private Integer id;
	private String title;
	private String content;
	private Integer userId;
	private Integer categoryId;
}
