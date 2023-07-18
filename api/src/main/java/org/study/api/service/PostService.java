package org.study.api.service;

import org.study.domain.Post;
import org.study.dto.request.PostWriteRequest;

import java.util.Optional;

public interface PostService {
    Post write(Post post);

    Post update(Post post);

    Long delete(Long id);
}
