package com.gb.demoone.Model;

import lombok.*;
import lombok.experimental.FieldDefaults;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Builder
@ToString
@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Classroom {

/*
    //c1 Field based Injection
    @Autowired
    Student student;
    @Autowired
    Teacher teacher;
*/

    //c2 Constructor based Injection

    Student student1;

    Teacher teacher1;

    public Classroom(Student student,@Qualifier("teacher1") Teacher teacher) {
        System.out.println("Classroom was called");
        System.out.println("Student: " + student);
        System.out.println("Teacher: " + teacher);

        this.student1 = student;
        this.teacher1 = teacher;
    }
}
