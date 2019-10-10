package com.codegym.service;

import com.codegym.model.Blog;
import com.codegym.model.BlogForm;
import org.springframework.validation.BindingResult;

public interface BlogService extends GeneralService<Blog> {
    String uploadFile(BlogForm blogForm, BindingResult result);
}
