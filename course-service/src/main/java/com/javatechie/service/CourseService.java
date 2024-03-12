package com.javatechie.service;


import com.javatechie.dto.Course;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Service
public class CourseService {


    private List<Course> coursesDatabase = new ArrayList<>();

    //create course Object in DB
    public Course onBoardNewCourse(Course course){
        course.setCourseId(new Random().nextInt(3756));
        coursesDatabase.add(course);
        return course;
    }

    //load all course from Database

    public List<Course> getAllCourse(){
        return coursesDatabase;
    }


    //filter course by course id
    public Course findByCourseId(Integer courseId){
        return coursesDatabase.stream()
                .filter(course ->course.getCourseId()==courseId)
                .findFirst().orElse(null);

    }

    //delete course
    public void deleteCourse(Integer courseId){
        Course course = findByCourseId(courseId);
        coursesDatabase.remove(course);

    }

    //update the course

    public Course updateCourse(int courseId, Course course){
        Course existingCourse = findByCourseId(courseId);
        existingCourse.setTrainerName(course.getTrainerName());
        coursesDatabase.set(coursesDatabase.indexOf(existingCourse),course);
        return course;
    }



}
