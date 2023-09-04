package org.study.entity;

import lombok.Builder;
import lombok.Getter;

import javax.persistence.*;

@Entity
@Getter
public class Comment extends BaseEntity{
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name="comment_id")
    private Post post;

    private String comment;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "member_id")
    private Member member;

    public Comment() {
    }

    @Builder
    public Comment(Long id, Post post, String comment, Member member) {
        this.id = id;
        this.post = post;
        this.comment = comment;
        this.member = member;
    }

    public void updateComment(String comment) {
        this.comment = comment;
    }
}
