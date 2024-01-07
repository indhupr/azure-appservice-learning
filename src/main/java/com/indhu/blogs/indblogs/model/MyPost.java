package com.indhu.blogs.indblogs.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class MyPost {
	private int id;
	private String title;
	private String content;
}
