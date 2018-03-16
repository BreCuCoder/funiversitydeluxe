package be.cuypersserbruyns.funiversity.api;

import be.cuypersserbruyns.funiversity.domain.Course;
import be.cuypersserbruyns.funiversity.service.CourseService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.inject.Inject;
import java.util.List;
@RestController
@RequestMapping(path = "/courses")

public class CourseController {


    private CourseService courseService;

    @Inject
    public CourseController(CourseService courseService) {
        this.courseService = courseService;
    }

    @GetMapping(produces = "application/json")
    @ResponseStatus(HttpStatus.OK)
    public List<Course> getCourses() {
        return courseService.getCourses();
    }

    @GetMapping(path = "/{studyPoints}", produces = "application/json")
    @ResponseStatus(HttpStatus.OK)
    public List<Course> getCoursesByStudyPoints(Double studyPoints) {
        return courseService.getCoursesByStudyPoints(studyPoints);
    }
//
//    @GetMapping(path = "/{}", produces = "application/json")
//    @ResponseStatus(HttpStatus.OK)
//    public List<Course> getCoursesByStudyPoints(Double studyPoints) {
//        return courseService.getCoursesByStudyPoints(studyPoints);
//    }

    @GetMapping(path = "/{id}", produces = "application/json")
    @ResponseStatus(HttpStatus.OK)
    public Course getCourse(Integer courseId) {
        return courseService.getCourse(courseId);
    }

    @PostMapping(consumes = "application/json", produces = "application/json")
    @ResponseStatus(HttpStatus.CREATED)
    public Course createCourse(Course course) {
        return courseService.createCourse(course);
    }

    @DeleteMapping(consumes = "application/json")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteCourse(Integer courseId) {
        courseService.deleteCourse(courseId);
    }

    @PutMapping(consumes = "application/json", produces = "application/json")
    @ResponseStatus(HttpStatus.OK)
    public Course updateCourse(Course course) {
        return courseService.updateCourse(course);
    }
}
