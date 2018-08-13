package com.blog.controller.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.blog.entity.Category;
import com.blog.service.CategoryService;

@RestController
@RequestMapping(value = "/api/category")
public class CategoryApiController {

	@Autowired
	private CategoryService categoryService;

	@RequestMapping(value = "/{id}")
	public List<Category> listCategories(@PathVariable Integer id) {
		return categoryService.listCategories();
	}
}
