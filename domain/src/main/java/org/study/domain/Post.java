package org.study.domain;

import lombok.Builder;
import lombok.Getter;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Getter
public class Post extends BaseEntity{
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

    private String contents;

    @Enumerated(EnumType.STRING)
    private Category category;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "member_id")
    private Member member;

    @OneToMany(mappedBy = "post")
    private List<Comment> commentList;

    public Post() {}

    @Builder
    public Post(String title, String contents, Category category, Member member) {
        this.title = title;
        this.contents = contents;
        this.category = category;
    }

    public void updatePost(String title, String contents, Category category) {
        this.title = title;
        this.contents = contents;
        this.category = category;
    }
}
