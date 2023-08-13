package org.study.dto.request;

import lombok.Data;
import org.study.domain.Comment;

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
