package com.br.xx.bean;

public class Role {
	private Integer id;
	private String kid;
	private String name;
	private String fenlei;
	private String tel;
	private String address;
	private String yinhang;
	private String zhanghao;
	private String beizhu;
	private String jname;
	public Role() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Role(Integer id, String kid, String name, String fenlei, String tel, String address, String yinhang,
			String zhanghao, String beizhu, String jname) {
		super();
		this.id = id;
		this.kid = kid;
		this.name = name;
		this.fenlei = fenlei;
		this.tel = tel;
		this.address = address;
		this.yinhang = yinhang;
		this.zhanghao = zhanghao;
		this.beizhu = beizhu;
		this.jname = jname;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getKid() {
		return kid;
	}
	public void setKid(String kid) {
		this.kid = kid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getFenlei() {
		return fenlei;
	}
	public void setFenlei(String fenlei) {
		this.fenlei = fenlei;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getYinhang() {
		return yinhang;
	}
	public void setYinhang(String yinhang) {
		this.yinhang = yinhang;
	}
	public String getZhanghao() {
		return zhanghao;
	}
	public void setZhanghao(String zhanghao) {
		this.zhanghao = zhanghao;
	}
	public String getBeizhu() {
		return beizhu;
	}
	public void setBeizhu(String beizhu) {
		this.beizhu = beizhu;
	}
	public String getJname() {
		return jname;
	}
	public void setJname(String jname) {
		this.jname = jname;
	}		
}
