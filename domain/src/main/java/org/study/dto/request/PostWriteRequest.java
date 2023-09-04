package org.study.dto.request;

import lombok.Data;
import org.study.entity.Category;
import org.study.entity.Post;

@Data
public class PostWriteRequest {
    private Long postId;

    private String title;

    private String contents;

    private Category category;

    private String memberId;

    public Post toEntity() {
        return Post.builder()
                .id(postId)
                .title(title)
                .contents(contents)
                .category(category)
                .build();
    }
}
