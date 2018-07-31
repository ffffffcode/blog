package com.blog.vo;

import com.baomidou.mybatisplus.annotations.TableName;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@TableName("v_article_info")
public class ArticleInfoVo {

	private Integer id;
	private String title;
	private String username;
	private String categoryName;
}
