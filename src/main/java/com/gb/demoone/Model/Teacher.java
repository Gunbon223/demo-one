package com.gb.demoone.Model;

import lombok.*;
import lombok.experimental.FieldDefaults;
import org.springframework.stereotype.Component;
@Component
@Builder
@ToString
@Getter
@Setter
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Teacher {
    private int id;
    private String name;

    public Teacher() {
        System.out.println("Teacher was called");
    }


}

