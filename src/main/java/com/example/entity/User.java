package com.example.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@TableName("user") //表名
@Setter
@Getter
@ToString
public class User {

	@TableId(value = "id",type = IdType.AUTO) //指定用户表id，自增类型
	private Integer id;
	@TableField("username")
	private String username;
	@TableField("email")
	private String email;
}
