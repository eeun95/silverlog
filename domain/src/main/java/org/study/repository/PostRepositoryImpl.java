package org.study.repository;

import org.study.domain.Post;

import java.util.Optional;

public class PostRepositoryImpl implements PostRepositoryCustom {

    @Override
    public Optional<Post> findPostBySearchText(String search) {
        return Optional.empty();
    }
}
