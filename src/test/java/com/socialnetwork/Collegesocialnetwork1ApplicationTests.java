package com.socialnetwork;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.socialnetwork.entity.Student;
import com.socialnetwork.entity.StudentDTO;
import com.socialnetwork.exception.StudentNotFoundException;
import com.socialnetwork.service.StudentService;

@SpringBootTest
class Collegesocialnetwork1ApplicationTests {

	@Autowired
	private StudentService studentService;
	
	@Test
	void addStudentTest() {
		Student student = new Student(105, "Amruta", 2022, null, "mech", null, null, null, null);
		Student testStudent = this.studentService.addStudent(student);
		assertNotNull(testStudent);
		
	}
	
	@Test
	void updateStudentTest() {
		StudentDTO studentDTO = new StudentDTO(105, "TestName", null, null, null);

		assertThrows(StudentNotFoundException.class, () -> this.studentService.updateStudent(studentDTO));

	}

	@Test
	void updateStudentTest2() {
		

		StudentDTO studentDTO = new StudentDTO(24, "TestName", null, null, null);

		try {
			Student updatedStudent = this.studentService.updateStudent(studentDTO);

			assertEquals("TestName", updatedStudent.getStudentName());
		} catch (StudentNotFoundException e) {
			
			e.printStackTrace();
		}
	}
}
	