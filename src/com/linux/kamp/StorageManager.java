package com.linux.kamp;

import java.util.ArrayList;
import java.util.List;

import com.linux.kamp.model.Page;
import com.linux.kamp.model.Post;

public class StorageManager {
	private static List<Page> pages = new ArrayList<Page>();
	private static List<Post> posts = new ArrayList<Post>();

	public static void addPost(Post post) {
		posts.add(post);
	}

	public static  void addPage(Page page) {
		pages.add(page);
	}

	public static List<Page> getPages() {
		return pages;
	}

	public static List<Post> getPosts() {
		return posts;
	}

}
