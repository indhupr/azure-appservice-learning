package com.indhu.blogs.indblogs.services;

import java.util.List;

import com.indhu.blogs.indblogs.model.MyPost;

public interface OpenPageServices {

	List<MyPost> getAllMyPosts();

	MyPost getMyPostsById(int id);

}
