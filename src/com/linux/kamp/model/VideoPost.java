package com.linux.kamp.model;

public class VideoPost extends Post {

	private String videoId;

	public VideoPost(String title, String content) {
		super(title, content);
	}

	public VideoPost(String title, String content, String videoId) {
		super(title, content);
		this.videoId = videoId;
	}

	public String getVideoId() {
		return videoId;
	}

	public void setVideoId(String videoId) {
		this.videoId = videoId;
	}

}
