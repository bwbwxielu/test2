package com.br.xx.service;

import com.br.xx.bean.Role;
import com.br.xx.page.Pager;

public interface IRoleService {

	Pager<Role> list(String lname);

	int del(int id);

	int update(int id);

	int adds(Role role);

	Role updateById(int id);

}
