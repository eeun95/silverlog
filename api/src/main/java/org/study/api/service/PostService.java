package org.study.api.service;

import org.study.domain.Post;

import java.util.List;

public interface PostService {
    List<Post> search();

    Post write(Post post);

    Post update(Post post);

    void delete(Long id);
}
