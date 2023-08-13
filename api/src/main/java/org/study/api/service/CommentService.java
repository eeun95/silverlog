package org.study.api.service;

import org.study.domain.Comment;

public interface CommentService {

    Comment regist(Comment comment);

    Comment findOne(Long commentId);

    Comment update(Comment comment);

    void delete();
}
