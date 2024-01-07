package com.indhu.blogs.indblogs.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.indhu.blogs.indblogs.services.OpenPageServices;

@Controller
public class OpenPageController {
	@Autowired
	OpenPageServices openPageServices;

	@GetMapping("/posts")
	public String getAllPosts(Model model) {
		model.addAttribute("posts", openPageServices.getAllMyPosts());
		return "posts";
	}

	@GetMapping("/posts/{id}")
	public String getPostById(@PathVariable Integer id, Model model) {
		model.addAttribute("post", openPageServices.getMyPostsById(id));
		return "post";
	}

}
