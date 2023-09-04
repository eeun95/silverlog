package org.study.dto.response;

import lombok.Data;
import org.study.entity.Category;
import org.study.entity.Post;

@Data
public class PostResponse {

    private Long postId;

    private String title;

    private String contents;

    private Category category;

    private String memberName;

    public PostResponse(Long postId, String title, String contents, Category category, String memberName) {
        this.postId = postId;
        this.title = title;
        this.contents = contents;
        this.category = category;
        this.memberName = memberName;
    }

    public static PostResponse toResponse(Post post) {
        return new PostResponse(post.getId(), post.getTitle(), post.getContents(), post.getCategory(), post.getMember().getMemberId());
    }
}
