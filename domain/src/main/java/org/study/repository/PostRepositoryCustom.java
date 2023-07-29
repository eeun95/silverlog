package org.study.repository;

import org.study.domain.Post;

import java.util.Optional;

public interface PostRepositoryCustom {
    Optional<Post> findPostBySearchText(String search);
}
