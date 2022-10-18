package com.example.demo.closet.vo;

public class ConnectClosetImgVo {
	// foreign key
	private String cloth_img_name;
	private String cloth_id;
	private String username;
	private String user_nickname;
	private String user_id;
	private String create_at;
	private String update_at;
	
	public String getCreate_at() {
		return create_at;
	}
	public void setCreate_at(String create_at) {
		this.create_at = create_at;
	}
	public String getUpdate_at() {
		return update_at;
	}
	public void setUpdate_at(String update_at) {
		this.update_at = update_at;
	}
	// getter and setter
	public String getCloth_img_name() {
		return cloth_img_name;
	}
	public void setCloth_img_name(String cloth_img_name) {
		this.cloth_img_name = cloth_img_name;
	}
	public String getCloth_id() {
		return cloth_id;
	}
	public void setCloth_id(String cloth_id) {
		this.cloth_id = cloth_id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getUser_nickname() {
		return user_nickname;
	}
	public void setUser_nickname(String user_nickname) {
		this.user_nickname = user_nickname;
	}
	public String getUser_id() {
		return user_id;
	}
	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}
}
