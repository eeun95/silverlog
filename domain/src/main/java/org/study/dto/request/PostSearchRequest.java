package org.study.dto.request;

import lombok.Data;

@Data
public class PostSearchRequest {
    private String searchCategory;

    private String searchContent;
}
