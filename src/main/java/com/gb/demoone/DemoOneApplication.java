package com.gb.demoone;

import com.gb.demoone.Controller.ProductController;
import com.gb.demoone.Model.Products;
import com.gb.demoone.Model.Student;
import com.gb.demoone.Model.Teacher;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import java.util.ArrayList;
import java.util.List;

//Bean phải được định nghĩa trong class chú thích bởi @Configuration hoặc @SpringBootApplication
@SpringBootApplication
public class DemoOneApplication {

	public static void main(String[] args) {
 	ApplicationContext context = SpringApplication.run(DemoOneApplication.class, args);
		// Ví dụ về 1 sản phẩm khi tạo
		List<Products> products = new ArrayList<>();
		Student student = context.getBean(Student.class);
//		Teacher teacher = context.getBean(Teacher.class);
//		System.out.println("Student: " + student + " Teacher: " + teacher);
	}


	@Bean
	public List<Products> products() {
		List<Products> products = new ArrayList<>();
		products.add(new Products("1", "Iphone 1213", "New", 1000, "Apple"));
		products.add(new Products("2", "Iphone 13", "New", 1200, "Apple"));
		products.add(new Products("3", "Iphone 14", "New", 1500, "Apple"));
		products.add(new Products("4", "Iphone 15", "New", 2000, "Apple"));
		products.add(new Products("5", "Samsung S24", "New", 2500, "Apple"));
		products.add(new Products("11", "Samsung S25", "New", 3000, "Apple"));
		return products;
	}

	@Bean
	public Student student() {
		return new Student(1, "Hoang");
	}

	@Bean(name ="teacher1")
	public Teacher teacher() {
		return new Teacher(1, "Cuong");
	}
	@Bean(name ="teacher2")
	public Teacher teacher1() {
		return new Teacher(2, "Dat");
	}
}
