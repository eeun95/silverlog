package org.study.dto.response;

import lombok.Data;
import org.study.domain.Comment;

@Data
public class CommentResponse {

    private Long postId;

    private Long commentId;

    private String comment;

    private String memberId;

    public CommentResponse(Long postId, Long commentId, String comment, String memberId) {
        this.postId = postId;
        this.commentId = commentId;
        this.comment = comment;
        this.memberId = memberId;
    }

    public static CommentResponse toResponse(Comment comment) {
        return new CommentResponse(comment.getPost().getId(), comment.getId(), comment.getComment(), comment.getMember().getMemberId());
    }
}
