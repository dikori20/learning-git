package com.example.demo.student;


import java.util.List;
// import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

   @Autowired
    private StudentRepository studentRepository;

    public List<Student> getStudents() {
		return studentRepository.findAll();
	}

    public void addNewStudent(Student student) {

    //    Optional<Student> studentOptional =  studentRepository.findStudentByEmail(student.getEmail());
    //    if(studentOptional.isPresent()) {
    //        throw new IllegalStateException("eamil taken or found");
    //    }
         studentRepository.save(student);
    }

    public void deleteStudent(Long studentId) {

        boolean exists = studentRepository.existsById(studentId);
        if(!exists) {
            throw new IllegalStateException("Student with id" + studentId + "doesn't exist");
        }
        studentRepository.deleteById(studentId);
    }

    public void updateStudent(Student student) {
        studentRepository.save(student);
        
    }
    


    
}
