package slp.domain;

import java.util.*;
import lombok.*;
import slp.domain.*;
import slp.infra.AbstractEvent;

@Data
@ToString
public class CourseRegistered extends AbstractEvent {

    private Long id;
    private String courseName;

    public CourseRegistered(Course aggregate) {
        super(aggregate);
    }

    public CourseRegistered() {
        super();
    }
}
