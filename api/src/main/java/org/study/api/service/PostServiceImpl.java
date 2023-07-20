package org.study.api.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.study.api.exception.PostNotFoundException;
import org.study.domain.Post;
import org.study.dto.request.PostWriteRequest;
import org.study.repository.PostRepository;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class PostServiceImpl implements PostService{

    private final PostRepository postRepository;
    @Override
    public Post write(Post post) {
        Post savePost = postRepository.save(post);
        return savePost;
    }

    @Override
    public Post update(Post post) {
        Post findPost = postRepository.findByIdAndDeleteAtIsNull(post.getId()).orElseThrow(()-> new PostNotFoundException());
        findPost.updatePost(post.getTitle(), post.getContents(), post.getCategory());
        return findPost;
    }

    @Override
    public void delete(Long id) {
        Post findPost = postRepository.findByIdAndDeleteAtIsNull(id).orElseThrow(()-> new PostNotFoundException());
        postRepository.delete(findPost);
    }
}
