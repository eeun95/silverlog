package org.study.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.study.domain.Member;
import org.study.domain.Post;

public interface PostRepository extends JpaRepository<Post, Long> {
}
