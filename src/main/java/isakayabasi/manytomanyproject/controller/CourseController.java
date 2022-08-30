package isakayabasi.manytomanyproject.controller;

import isakayabasi.manytomanyproject.entity.Course;
import isakayabasi.manytomanyproject.pojos.CourseRequest;
import isakayabasi.manytomanyproject.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController {

    @Autowired
    CourseService courseService;

    @PostMapping("/addcourse")
    public Course addcourse(@RequestBody CourseRequest courseRequest){
        return courseService.addCourseWithContents(courseRequest);
    }
}
