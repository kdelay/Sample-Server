package com.example.demo.closet.vo;

public class ClosetInfoVo {
		private String cloth_id; // primary key
		private String cloth_type;
		private String cloth_detail;
		private String cloth_color;
		private String cloth_pattern;
		private String cloth_texture;
		private String cloth_style;
		private String cloth_keyword;
		private String cloth_pref;
		
		// foreign key
		private String username;
		private String user_nickname;
		private String user_id;
		
		// getter and setter
		public String getCloth_id() {
			return cloth_id;
		}
		public void setCloth_id(String cloth_id) {
			this.cloth_id = cloth_id;
		}
		public String getCloth_type() {
			return cloth_type;
		}
		public void setCloth_type(String cloth_type) {
			this.cloth_type = cloth_type;
		}
		public String getCloth_detail() {
			return cloth_detail;
		}
		public void setCloth_detail(String cloth_detail) {
			this.cloth_detail = cloth_detail;
		}
		public String getCloth_color() {
			return cloth_color;
		}
		public void setCloth_color(String cloth_color) {
			this.cloth_color = cloth_color;
		}
		public String getCloth_pattern() {
			return cloth_pattern;
		}
		public void setCloth_pattern(String cloth_pattern) {
			this.cloth_pattern = cloth_pattern;
		}
		public String getCloth_texture() {
			return cloth_texture;
		}
		public void setCloth_texture(String cloth_texture) {
			this.cloth_texture = cloth_texture;
		}
		public String getCloth_style() {
			return cloth_style;
		}
		public void setCloth_style(String cloth_style) {
			this.cloth_style = cloth_style;
		}
		public String getCloth_keyword() {
			return cloth_keyword;
		}
		public void setCloth_keyword(String cloth_keyword) {
			this.cloth_keyword = cloth_keyword;
		}
		public String getCloth_pref() {
			return cloth_pref;
		}
		public void setCloth_pref(String cloth_pref) {
			this.cloth_pref = cloth_pref;
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