package com.markany.jblog.vo;

public class PostVo {
	private Long postNo;
	private String postTitle;
	private String contents;
	private String regDate;
	private Long categoryNo;
	
	public Long getPostNo() {
		return postNo;
	}
	public void setPostNo(Long postNo) {
		this.postNo = postNo;
	}
	public String getPostTitle() {
		return postTitle;
	}
	public void setPostTitle(String postTitle) {
		this.postTitle = postTitle;
	}
	public String getContents() {
		return contents;
	}
	public void setContents(String contents) {
		this.contents = contents;
	}
	public String getRegDate() {
		return regDate;
	}
	public void setRegDate(String regDate) {
		this.regDate = regDate;
	}
	public Long getCategoryNo() {
		return categoryNo;
	}
	public void setCategoryNo(Long categoryNo) {
		this.categoryNo = categoryNo;
	}
	@Override
	public String toString() {
		return "PostVo [postNo=" + postNo + ", postTitle=" + postTitle + ", contents=" + contents + ", regDate="
				+ regDate + ", categoryNo=" + categoryNo + "]";
	}
}
