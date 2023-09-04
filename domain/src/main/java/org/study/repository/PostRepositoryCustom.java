package org.study.repository;

import org.study.entity.Post;

import java.util.Optional;

public interface PostRepositoryCustom {
    Optional<Post> findPostBySearchText(String search);
}
