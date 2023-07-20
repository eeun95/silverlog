package org.study.api.service;

import org.study.domain.Post;

public interface PostService {
    Post write(Post post);

    Post update(Post post);

    void delete(Long id);
}
