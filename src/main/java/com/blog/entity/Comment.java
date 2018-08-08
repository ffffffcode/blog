package com.blog.entity;

import com.baomidou.mybatisplus.annotations.TableName;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@TableName("t_comment")
public class Comment {

	private Integer id;
	private String content;
	private Integer parent;
	private Integer userId;
	private Integer articleId;
}