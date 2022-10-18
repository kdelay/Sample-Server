package com.example.demo.closet.vo;

public class ClosetImgInfoVo {
	private String cloth_img_name; // primary key
	private String cloth_img_real_name;
	private String cloth_img_file_size;
	private String cloth_img_extension;
	private String cloth_img_folder;
	private String cloth_img_time;
	
	// foreign key
	private String username;
	private String user_nickname;
	private int user_id;
	
	// getter and setter
	public String getCloth_img_name() {
		return cloth_img_name;
	}
	public void setCloth_img_name(String cloth_img_name) {
		this.cloth_img_name = cloth_img_name;
	}
	public String getCloth_img_real_name() {
		return cloth_img_real_name;
	}
	public void setCloth_img_real_name(String cloth_img_real_name) {
		this.cloth_img_real_name = cloth_img_real_name;
	}
	public String getCloth_img_file_size() {
		return cloth_img_file_size;
	}
	public void setCloth_img_file_size(String cloth_img_file_size) {
		this.cloth_img_file_size = cloth_img_file_size;
	}
	public String getCloth_img_extension() {
		return cloth_img_extension;
	}
	public void setCloth_img_extension(String cloth_img_extension) {
		this.cloth_img_extension = cloth_img_extension;
	}
	public String getCloth_img_folder() {
		return cloth_img_folder;
	}
	public void setCloth_img_folder(String cloth_img_folder) {
		this.cloth_img_folder = cloth_img_folder;
	}
	public String getCloth_img_time() {
		return cloth_img_time;
	}
	public void setCloth_img_time(String cloth_img_time) {
		this.cloth_img_time = cloth_img_time;
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
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	
	// getter and setter
	
}
