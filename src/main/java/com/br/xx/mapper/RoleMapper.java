package com.br.xx.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.br.xx.bean.Role;

public interface RoleMapper {
		
	List<Role> list(@Param("offset")int offset,@Param("pagesize")int pagesize,@Param("lname")String lanme);
	
	long getTotal(@Param("lname")String lname);
	
	@Insert("insert into t_role(kid,name,fenlei,tel,address,yinhang,zhanghao,beizhu,jname) values(#{kid},#{name},#{fenlei},#{tel},#{address},#{yinhang},#{zhanghao},#{beizhu},#{jname})")
	int adds(Role role);
	
	@Delete("delete from t_role where id=#{id}")
	int del(@Param("id")int id);

	@Select("select * from t_role where id=#{id}")
	Role updateById(@Param("id")int id);
	
	@Update("update t_role set kid=#{kid},name=#{name},fenlei=#{fenlei},tel=#{tel},address=#{address},yinhang=#{yinhang},zhanghao=#{zhanghao},beizhu=#{beizhu},janme=#{jname} where id=#{id}")
	int update(@Param("id")int id);
		
}
