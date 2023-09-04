package org.study.entity;

import lombok.Builder;
import lombok.Getter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
public class Member extends BaseEntity {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String memberId;

    private String password;

    private String name;

    @OneToMany(mappedBy = "member")
    private List<Post> postList = new ArrayList<>();

    @OneToMany(mappedBy = "member")
    private List<Comment> commentList = new ArrayList<>();

    public Member() {}

    @Builder
    public Member(String memberId, String password, String name) {
        this.memberId = memberId;
        this.password = password;
        this.name = name;
    }
}
