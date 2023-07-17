package org.study.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.study.domain.Member;
import org.study.domain.Post;

@Repository
public interface PostRepository extends JpaRepository<Post, Long> {
}
