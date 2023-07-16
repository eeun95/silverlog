package org.study.domain;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;
import java.time.LocalDateTime;

@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
public abstract class BaseEntity {
    private LocalDateTime createdAt;

    private LocalDateTime modifideAt;

    private LocalDateTime deletedAt;

    private String createdBy;

    private String modifiedBy;

    private String deletedBy;
}
