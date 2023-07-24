package org.study.api.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import org.study.api.service.PostService;
import org.study.domain.Post;
import org.study.domain.common.CommonResponse;
import org.study.domain.common.ResultCode;
import org.study.dto.request.PostWriteRequest;
import org.study.dto.response.PostResponse;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@RestController
@RequiredArgsConstructor
@RequestMapping("/post")
public class PostController {

    private final PostService postService;

    @GetMapping("")
    public CommonResponse search() {
        List<Post> search = postService.search();
        List<PostResponse> response = search.stream().map(p -> PostResponse.toResponse(p)).collect(Collectors.toList());
        return new CommonResponse(ResultCode.SUCCESS, response);
    }

    @PostMapping("write")
    public CommonResponse write(PostWriteRequest request) {
        Post post = request.toEntity();
        Post savePost = postService.write(post);
        PostResponse response = PostResponse.toResponse(savePost);
        return new CommonResponse(ResultCode.SUCCESS, response);
    }

    @PostMapping("update")
    public CommonResponse update(PostWriteRequest request) {
        Post post = request.toEntity();
        Post updatePost = postService.update(post);
        PostResponse response = PostResponse.toResponse(updatePost);
        return new CommonResponse(ResultCode.SUCCESS, response);
    }

    @DeleteMapping("{id}")
    public CommonResponse delete(@PathVariable("id") Long id) {
        postService.delete(id);
        return new CommonResponse(ResultCode.SUCCESS);
    }
}
