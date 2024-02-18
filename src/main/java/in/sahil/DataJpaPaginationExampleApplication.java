package in.sahil;

import java.util.Arrays;

//import in.sahil.Repository.StudentRepository;
import in.sahil.binding.Student;

import java.util.List;
import java.util.Scanner;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Repository;
import in.sahil.repository.StudentRepository;


@SpringBootApplication
public class DataJpaPaginationExampleApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(DataJpaPaginationExampleApplication.class, args);
		StudentRepository repo=context.getBean(StudentRepository.class);
		
		Student s2=new Student(3,"Orlen",11,"FeMale");
		Student s3=new Student(4,"Cathy",5,"FeMale");
		Student s4=new Student(5,"Azhar",6,"Male");
		Student s5=new Student(6,"Buttler",7,"Male");
		Student s6=new Student(7,"Smith",8,"Male");
		Student s7=new Student(8,"James",10,"Male");
		Student s8=new Student(9,"Durga",11,"FeMale");
		Student s9=new Student(10,"Praveen",9,"Male");
		Student s10=new Student(11,"Puja",13,"FeMale");
		Student s11=new Student(12,"Priya",15,"FeMale");
		

		
		

		
		List<Student> s=Arrays.asList(s2,s3,s4,s5,s6,s7,s8,s9,s10,s11);
		
		repo.saveAll(s);
		
//		System.out.println(repo.save(s2));
//		System.out.println("Records Inserted");
		
		/* Below Code represents Pagination
		 * Scanner sc=new Scanner(System.in); System.out.println("Enter Page Number");
		 * 
		 * int pageNo=sc.nextInt(); int pageSize=4;
		 * 
		 * PageRequest pageReq=PageRequest.of(pageNo-1, pageSize);// here pageNo will
		 * start from 0 // If we remove Minus 1 from the pageNo then it will skip the
		 * page size=4 and show the remaining records Page<Student>
		 * page=repo.findAll(pageReq);
		 * 
		 * List<Student> students=page.getContent();
		 * students.forEach(System.out::println);
		 */
		
		// Below code represents Sorting
		
//		List<Student> students=repo.findAll(Sort.by("id"));
//		students.forEach(System.out::println);
		
		// Below code represents Query By Example
		
//		Student student= new Student();
//		
//		student.setGender("Female");// if both condition match then only it will provide output
//		student.setRanks(11);// Geneder should be female and rank should be 11 then only it will provide output
//		
//		Example<Student> example=Example.of(student);
//		List<Student> st=repo.findAll(example);
//		st.forEach(System.out::println);
//
		
		// Below code represents @Modifying and @Transactional
		//repo.deleteStudent(3);
		
		//repo.updateStudent(20L,18);
		//repo.insertStudent(14, "Male", "Ashok", 15L);
		
		
		
		// Below code represents Timestamping in JPA
		
		//repo.insertStudent(19,"Male", "Ravi", 18L);
		//repo.insertStudent(18,"Male", "Sham", 19L);

		//Student st=new Student(20, "Sohel", 20L, "Male","Y");
		
		//repo.save(st);
		
		Student student=repo.findById(20).get();
		student.setActiveSw("N");
		
		repo.save(student);
//	
		
		
		
	}

}
