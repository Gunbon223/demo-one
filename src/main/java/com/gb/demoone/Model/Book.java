package com.gb.demoone.Model;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Book {
    private String id;
    private String title;
    private String author;
    private int year;
}