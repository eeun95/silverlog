package org.study.dto.request;

import lombok.Data;
import org.study.entity.Comment;

@Data
public class CommentUpdateRequest {

    private Long commentId;
    private String comment;

    public Comment toEntity() {
        return new Comment().builder()
                .id(commentId)
                .comment(comment)
                .build();
    }
}
