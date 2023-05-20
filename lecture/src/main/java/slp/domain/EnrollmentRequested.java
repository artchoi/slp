package slp.domain;

import java.util.*;
import lombok.*;
import slp.domain.*;
import slp.infra.AbstractEvent;

@Data
@ToString
public class EnrollmentRequested extends AbstractEvent {

    private Long id;
    private Long courseId;
    private String status;
    private Long studentId;

    public EnrollmentRequested(Lecture aggregate) {
        super(aggregate);
    }

    public EnrollmentRequested() {
        super();
    }
}
