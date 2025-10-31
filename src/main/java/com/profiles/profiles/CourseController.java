package com.profiles.profiles;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class CourseController {

    @RequestMapping("/courses")
    public List<Course> getAllCustomers(){
        return Arrays.asList(
                new Course(1L, "Learn AWS", "The Banda"),
                new Course(2L, "Learn DevOps", "Adonis"),
                new Course(3L, "Learn AI", "Tapiwa Konga"),
                new Course(4L, "Learn AI", "Mandizvidza Evidence")
        );
    }
}
