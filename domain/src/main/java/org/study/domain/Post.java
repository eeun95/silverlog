package org.study.domain;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Entity
public class Post {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

    private String contents;

    @Enumerated(EnumType.STRING)
    private Category category;

    private String memberId;

    private LocalDateTime regDate;

    @OneToMany(mappedBy = "post")
    private List<Comment> commentList;
}
