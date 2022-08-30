package isakayabasi.manytomanyproject.service;

import isakayabasi.manytomanyproject.entity.Course;
import isakayabasi.manytomanyproject.entity.CourseContents;
import isakayabasi.manytomanyproject.pojos.CourseRequest;
import isakayabasi.manytomanyproject.repository.CourseContentRepository;
import isakayabasi.manytomanyproject.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.stream.Collectors;

@Service
public class CourseService {

    @Autowired
    CourseRepository courseRepository;

    @Autowired
    CourseContentRepository courseContentRepository;

    public CourseService(){

    }
    public Course addCourseWithContents(CourseRequest courseRequest){
        Course course = new Course();
        course.setId(courseRequest.id);
        course.setCoursename(courseRequest.coursename);
        course.setCourseContents(courseRequest.courseContents
                .stream()
                .map(courseContents -> {
                    CourseContents ccontents = courseContents;
                    if (ccontents.getId() > 0) {
                        ccontents = courseContentRepository.findById(ccontents.getId());
                    }
                    ccontents.addCourse(course);
                    return ccontents;
                })
                .collect(Collectors.toSet()));
        return courseRepository.save(course);
    }
}
