package com.linux.kamp.model;

public class PhotoPost extends Post{

	private String photoUrl;
	
	public PhotoPost(String title, String content) {
		super(title, content);
	}

	public PhotoPost(String title, String content, String photoUrl) {
		super(title, content);
		this.photoUrl = photoUrl;
	}

	public String getPhotoUrl() {
		return photoUrl;
	}

	public void setPhotoUrl(String photoUrl) {
		this.photoUrl = photoUrl;
	}
}
