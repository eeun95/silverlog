package org.study.domain;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public enum Category {
    STUDY("공부"),
    ANY("잡담");

    private String value;
}
