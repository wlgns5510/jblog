package com.javaex.vo;

public class BlogVo {

	//필드
	private String userName;
	private String id;
	private String blogTitle;
	private String logoFile;
	
	
	//생성자
	public BlogVo() {}
	
	public BlogVo(String userName, String id, String blogTitle, String logoFile) {
		super();
		this.userName = userName;
		this.id = id;
		this.blogTitle = blogTitle;
		this.logoFile = logoFile;
	}

	//메소드gs
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getBlogTitle() {
		return blogTitle;
	}

	public void setBlogTitle(String blogTitle) {
		this.blogTitle = blogTitle;
	}

	public String getLogoFile() {
		return logoFile;
	}

	public void setLogoFile(String logoFile) {
		this.logoFile = logoFile;
	}

	//메소드일반
	@Override
	public String toString() {
		return "BlogVo [userName=" + userName + " id=" + id + ", blogTitle=" + blogTitle + ", logoFile=" + logoFile + "]";
	}
}
