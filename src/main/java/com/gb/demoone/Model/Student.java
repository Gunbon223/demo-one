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
public class Student {
    private int id;
    private String name;

    public Student() {
        System.out.println("Student.Student was called");
    }


}

