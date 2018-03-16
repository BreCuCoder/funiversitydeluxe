package be.cuypersserbruyns.funiversity.service;

import be.cuypersserbruyns.funiversity.domain.Course;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CourseService {
    private List<Course> courses;

    public List<Course> getCourses() {
        return Collections.unmodifiableList(this.courses);
    }

    public Course getCourse(Integer courseId) {
        return courses.get(courseId);
    }

    public Course createCourse(Course course) {
        courses.add(course);
        return course;
    }

    public void deleteCourse(Integer courseId) {
        courses.remove(courseId);
    }

    public Course updateCourse(Course course) {
        courses.set(course.getId(),course);
        return course;
    }

    public List<Course> getCoursesByStudyPoints(Double studyPoints) {
        List<Course> resultList = new ArrayList<>();
        for (Course course : courses) {
            if (course.getStudyPoints()==studyPoints) {
                resultList.add(course);
            }
        }
        return resultList;
    }
}
