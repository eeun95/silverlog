package org.study.dto.request;

import lombok.Data;
import org.study.domain.Category;
import org.study.domain.Post;

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
