package org.study.api.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.study.domain.Comment;
import org.study.repository.CommentRepository;

@Service
@RequiredArgsConstructor
public class CommentServiceImpl implements CommentService{
    private final CommentRepository commentRepository;

    @Override
    public Comment regist() {
        return null;
    }

    @Override
    public Comment update() {
        return null;
    }

    @Override
    public void delete() {

    }
}
