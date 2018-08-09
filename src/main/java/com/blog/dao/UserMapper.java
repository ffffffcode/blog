package com.blog.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.blog.entity.User;

@Component
@Mapper
public interface UserMapper extends BaseMapper<User> {

	@Select("select id, username from t_user where id = #{id}")
	User getUserByIdWithoutPassword(Integer id);
}
