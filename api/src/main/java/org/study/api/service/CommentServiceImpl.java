package org.study.api.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.study.api.exception.CommentNotFoundException;
import org.study.domain.Comment;
import org.study.repository.CommentRepository;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class CommentServiceImpl implements CommentService{
    private final CommentRepository commentRepository;

    @Override
    public Comment regist(Comment comment) {
        return null;
    }

    @Override
    public Comment findOne(Long commentId) {
        Comment findComment = commentRepository.findByIdAndDeletedAtIsNull(commentId).orElseThrow(()->new CommentNotFoundException());
        return findComment;
    }

    @Override
    public Comment update(Comment comment) {
        Comment findComment = commentRepository.findByIdAndDeletedAtIsNull(comment.getId()).orElseThrow(() -> new CommentNotFoundException());
        findComment.updateComment(comment.getComment());
        return findComment;
    }

    @Override
    public void delete() {

    }
}
