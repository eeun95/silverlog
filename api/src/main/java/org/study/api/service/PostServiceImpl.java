package org.study.api.service;

import org.springframework.stereotype.Service;
import org.study.domain.Post;
import org.study.dto.request.PostWriteRequest;

import java.util.Optional;

@Service
public class PostServiceImpl implements PostService{

    @Override
    public Post write(PostWriteRequest request) {
        return null;
    }
}
