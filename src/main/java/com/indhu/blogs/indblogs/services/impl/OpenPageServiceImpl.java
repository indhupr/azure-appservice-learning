package com.indhu.blogs.indblogs.services.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.indhu.blogs.indblogs.model.MyPost;
import com.indhu.blogs.indblogs.services.OpenPageServices;

@Service
public class OpenPageServiceImpl implements OpenPageServices {

	@Override
	public List<MyPost> getAllMyPosts() {
		List<MyPost> myposts = new ArrayList<>();
		myposts.add(new MyPost(1, "My first blog", "This is my first blog"));
		myposts.add(new MyPost(2, "My second blog", "This is my second blog"));
		return myposts;

	}

	@Override
	public MyPost getMyPostsById(int id) {
		Map<Integer, MyPost> postById = getAllMyPosts().stream().collect(Collectors.toMap(MyPost::getId, x -> x));

		return postById.containsKey(id) ? postById.get(id) : new MyPost();

	}
}
