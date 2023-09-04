package org.study.api.service;

import org.study.entity.Comment;

public interface CommentService {

    Comment regist(Comment comment);

    Comment findOne(Long commentId);

    Comment update(Comment comment);

    void delete(Long commentId);
}
