package org.study.domain;

import javax.persistence.Entity;
import java.time.LocalDateTime;

@Entity
public class BaseEntity{

    private LocalDateTime createDate;

    private LocalDateTime modifyDate;

    private LocalDateTime deleteDate;

    private String createdBy;

    private String modifyBy;

    private String deleteBy;

}
