package com.blog.dao;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.blog.entity.Category;

@Component
@Mapper
public interface CategoryMapper extends BaseMapper<Category> {

}
