package org.study.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.study.domain.Comment;
import org.study.domain.Post;

public interface CommentRepository extends JpaRepository<Comment, Long> {
}
