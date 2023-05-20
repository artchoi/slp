package slp.domain;

import slp.domain.EnrollmentRequested;
import slp.domain.Enrolled;
import slp.domain.Enrolled;
import slp.domain.EnrollmentRequested;
import slp.domain.EnrollmentCanceled;
import slp.domain.EnrollmentCanceled;
import slp.LectureApplication;
import javax.persistence.*;
import java.util.List;
import lombok.Data;
import java.util.Date;


@Entity
@Table(name="Lecture_table")
@Data

public class Lecture  {


    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    
    
    
    
    
    private Long id;
    
    
    
    
    
    private Long courseId;
    
    
    
    
    
    private String status;
    
    
    
    
    
    private Long studentId;

    @PostPersist
    public void onPostPersist(){

        //Following code causes dependency to external APIs
        // it is NOT A GOOD PRACTICE. instead, Event-Policy mapping is recommended.


        slp.external.  = new slp.external.();
        // mappings goes here
        Application.applicationContext.getBean(slp.external.Service.class)
            .requestPay();


        EnrollmentRequested enrollmentRequested = new EnrollmentRequested(this);
        enrollmentRequested.publishAfterCommit();



        Enrolled enrolled = new Enrolled(this);
        enrolled.publishAfterCommit();



        Enrolled enrolled = new Enrolled(this);
        enrolled.publishAfterCommit();


        //Following code causes dependency to external APIs
        // it is NOT A GOOD PRACTICE. instead, Event-Policy mapping is recommended.


        slp.external.  = new slp.external.();
        // mappings goes here
        LectureApplication.applicationContext.getBean(slp.external.Service.class)
            .requestPay();


        EnrollmentRequested enrollmentRequested = new EnrollmentRequested(this);
        enrollmentRequested.publishAfterCommit();

    }
    @PreRemove
    public void onPreRemove(){


        EnrollmentCanceled enrollmentCanceled = new EnrollmentCanceled(this);
        enrollmentCanceled.publishAfterCommit();



        EnrollmentCanceled enrollmentCanceled = new EnrollmentCanceled(this);
        enrollmentCanceled.publishAfterCommit();

    }

    public static LectureRepository repository(){
        LectureRepository lectureRepository = LectureApplication.applicationContext.getBean(LectureRepository.class);
        return lectureRepository;
    }






}
