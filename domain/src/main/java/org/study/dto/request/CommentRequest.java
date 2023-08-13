package org.study.dto.request;

import lombok.Data;

@Data
public class CommentRequest {
    private Long postId;
    private String writer;
    private String comment;
}
