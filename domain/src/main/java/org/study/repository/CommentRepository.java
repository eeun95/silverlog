package org.study.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.study.domain.Comment;
import org.study.domain.Post;

@Repository
public interface CommentRepository extends JpaRepository<Comment, Long> {
}
