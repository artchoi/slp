package slp.domain;

import slp.domain.CourseRegistered;
import slp.domain.CourseRegistered;
import slp.domain.CourseDeleted;
import slp.domain.CourseDeleted;
import slp.CourseApplication;
import javax.persistence.*;
import java.util.List;
import lombok.Data;
import java.util.Date;


@Entity
@Table(name="Course_table")
@Data

public class Course  {


    
    
    
    
    
    private Long id;
    
    
    
    
    
    private String courseName;

    @PostPersist
    public void onPostPersist(){


        CourseRegistered courseRegistered = new CourseRegistered(this);
        courseRegistered.publishAfterCommit();



        CourseRegistered courseRegistered = new CourseRegistered(this);
        courseRegistered.publishAfterCommit();

    }
    @PreRemove
    public void onPreRemove(){

        //Following code causes dependency to external APIs
        // it is NOT A GOOD PRACTICE. instead, Event-Policy mapping is recommended.


        slp.external.  = new slp.external.();
        // mappings goes here
        Application.applicationContext.getBean(slp.external.Service.class)
            .cancel();


        CourseDeleted courseDeleted = new CourseDeleted(this);
        courseDeleted.publishAfterCommit();


        //Following code causes dependency to external APIs
        // it is NOT A GOOD PRACTICE. instead, Event-Policy mapping is recommended.


        slp.external.  = new slp.external.();
        // mappings goes here
        CourseApplication.applicationContext.getBean(slp.external.Service.class)
            .cancel();


        CourseDeleted courseDeleted = new CourseDeleted(this);
        courseDeleted.publishAfterCommit();

    }

    public static CourseRepository repository(){
        CourseRepository courseRepository = CourseApplication.applicationContext.getBean(CourseRepository.class);
        return courseRepository;
    }






}
