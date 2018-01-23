package com.br.xx.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.br.xx.bean.Role;
import com.br.xx.mapper.RoleMapper;
import com.br.xx.page.Pager;
import com.br.xx.page.SystemContext;
@Service
public class RoleService implements IRoleService {
	@Resource
	private RoleMapper mapper;
	@Override
	public Pager<Role> list(String lname) {
		// TODO Auto-generated method stub
		Pager<Role> pager=new Pager<Role>();
		int offset=SystemContext.getOffset();
		int pagesize=SystemContext.getPagesize();
		List<Role> datas=this.mapper.list(offset,pagesize,lname);
		long total=this.mapper.getTotal(lname);
		pager.setDatas(datas);
		pager.setTotal(total);
		return pager;
	}
	@Override
	public int del(int id) {
		// TODO Auto-generated method stub
		return mapper.del(id);
	}	
	@Override
	public int update(int id) {
		// TODO Auto-generated method stub
		return mapper.update(id);
	}
	@Override
	public int adds(Role role) {
		// TODO Auto-generated method stub
		return mapper.adds(role);
	}
	@Override
	public Role updateById(int id) {
		// TODO Auto-generated method stub
		return mapper.updateById(id);
	}

}
