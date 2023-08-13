package org.study.api.service;

import org.study.domain.Comment;

public interface CommentService {

    Comment regist(Comment comment);

    Comment update();

    void delete();
}
