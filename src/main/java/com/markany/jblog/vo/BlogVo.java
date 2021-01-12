package com.markany.jblog.vo;

public class BlogVo {
	private String blogId;
	private String blogTitle;
	private String logo;
	
	public String getBlogId() {
		return blogId;
	}
	public void setBlogId(String blogId) {
		this.blogId = blogId;
	}
	public String getBlogTitle() {
		return blogTitle;
	}
	public void setBlogTitle(String blogTitle) {
		this.blogTitle = blogTitle;
	}
	public String getLogo() {
		return logo;
	}
	public void setLogo(String logo) {
		this.logo = logo;
	}
	@Override
	public String toString() {
		return "BlogVo [blogId=" + blogId + ", blogTitle=" + blogTitle + ", logo=" + logo + "]";
	}
	
}
