package org.study.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.study.domain.Member;
import org.study.domain.Post;

import java.util.List;
import java.util.Optional;

@Repository
public interface PostRepository extends JpaRepository<Post, Long>, PostRepositoryCustom {
    Optional<Post> findByIdAndDeleteAtIsNull(Long id);

    List<Post> findAllByDeleteAtIsNull();
}
