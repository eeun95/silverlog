package org.study.domain;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
public class Comment extends BaseEntity{
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name="comment_id")
    private Post post;

    private String comment;

    private String memberId;

}
