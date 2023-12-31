package org.study.entity;

import lombok.Builder;
import lombok.Getter;

import javax.persistence.*;
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
    public Post(Long id, String title, String contents, Category category, Member member) {
        this.id = id;
        this.title = title;
        this.contents = contents;
        this.category = category;
    }

    public void updatePost(String title, String contents, Category category) {
        if(title!=null) {
            this.title = title;
        }
        if(contents!=null) {
            this.contents = contents;
        }
        if(category!=null) {
            this.category = category;
        }
    }
}
