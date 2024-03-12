package com.javatechie.controller;

import com.javatechie.dto.Course;
import com.javatechie.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/course")
public class CourseController {

    private CourseService courseService;
    @Autowired
    public CourseController(CourseService courseService) {
        this.courseService = courseService;
    }
    //@RequestMapping(value  ="/course", method = RequestMethod.POST)
    @PostMapping
    public ResponseEntity<?> addCourse(@RequestBody Course course){
     Course newCourse = courseService.onBoardNewCourse(course);
     return new ResponseEntity<>(newCourse, HttpStatus.CREATED);
    }
    @GetMapping
    public ResponseEntity<?> findAlCourses(){
        return new ResponseEntity<>(courseService.getAllCourse(),HttpStatus.OK);
    }
    @GetMapping("/{courseId}")


    public ResponseEntity<?> findCourse( @PathVariable Integer courseId){
        return new ResponseEntity<>(courseService.findByCourseId(courseId),HttpStatus.OK);
    }

    public ResponseEntity<?> findCourseUsingRequestParam(@RequestParam(required = false) Integer courseId){
        return new ResponseEntity<>(courseService.findByCourseId(courseId),HttpStatus.OK);
    }

    @DeleteMapping("/{courseId}")
    public ResponseEntity<?> deleteCourse(@PathVariable int courseId){
        courseService.deleteCourse(courseId);
        return new ResponseEntity<>("",HttpStatus.NO_CONTENT);
    }

    @PutMapping("/{courseId}")
    public ResponseEntity<?> updateCourse(@PathVariable int courseId,@RequestBody Course course){
        return new ResponseEntity<>(courseService.updateCourse(courseId,course),HttpStatus.OK);
    }

}
