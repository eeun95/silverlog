package org.study.api.service;

import org.study.entity.Post;

import java.util.List;

public interface PostService {
    List<Post> list();

    Post findOne(Long id);

    Post search(String search);

    Post write(Post post);

    Post update(Post post);

    void delete(Long id);
}
