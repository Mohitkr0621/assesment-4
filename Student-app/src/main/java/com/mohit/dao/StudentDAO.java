package com.mohit.dao;

import java.time.LocalDate;
import java.util.HashMap;

import org.springframework.stereotype.Component;

import com.mohit.beans.Student;

@Component
public class StudentDAO {

    public HashMap<Integer, Student>  getStudents(){
    	HashMap<Integer, Student> hm = new HashMap<Integer, Student>();	
    	hm.put(1, new Student(1,"rohit",LocalDate.of(2000,4, 30)));
    	hm.put(2, new Student(2,"kohli",LocalDate.of(2000,5, 02)));
    	hm.put(3, new Student(3,"mohit",LocalDate.of(2001,2, 14)));
    	hm.put(4, new Student(4,"aman",LocalDate.of(2001,9, 24)));
    	
    	return hm;
    }
}