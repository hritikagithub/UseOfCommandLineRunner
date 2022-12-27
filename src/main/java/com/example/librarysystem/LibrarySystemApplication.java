package com.example.librarysystem;

import com.example.librarysystem.Repository.LibCard;
import com.example.librarysystem.Repository.LibCardRepository;
import com.example.librarysystem.Repository.Student;
import com.example.librarysystem.Repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LibrarySystemApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(LibrarySystemApplication.class, args);
	}

	@Autowired
	LibCardRepository libCardRepository;

	@Autowired
	StudentRepository studentRepository;
	@Override
	public void run(String... args) throws Exception {
		Student s = new Student(1,"Hritika",22);
		LibCard card = new LibCard();

		s.setCard(card);

		libCardRepository.save(card);
		studentRepository.save(s);


	}
}
