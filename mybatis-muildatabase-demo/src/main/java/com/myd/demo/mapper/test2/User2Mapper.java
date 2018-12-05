package com.myd.demo.mapper.test2;


import com.myd.demo.entity.UserEntity;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;


public interface User2Mapper {


	@Select("SELECT * FROM users")
	/*@Results({
			@Result(property = "userSex",  column = "user_sex", javaType = UserSexEnum.class),
			@Result(property = "nickName", column = "nick_name")
	})*/
	List<UserEntity> getAll();

	@Select("SELECT * FROM users WHERE id = #{id}")
	/*@Results({
			@Result(property = "userSex",  column = "user_sex", javaType = UserSexEnum.class),
			@Result(property = "nickName", column = "nick_name")
	})*/
	UserEntity getOne(Long id);

	@Insert("INSERT INTO users(userName,passWord) VALUES(#{userName}, #{passWord})")
	void insert(UserEntity user);

	@Update("UPDATE users SET userName=#{userName} WHERE id =#{id}")
	void update(UserEntity user);

	@Delete("DELETE FROM users WHERE id =#{id}")
	void delete(Long id);

}