package slp.domain;

import java.util.*;
import lombok.*;
import slp.domain.*;
import slp.infra.AbstractEvent;

@Data
@ToString
public class Enrolled extends AbstractEvent {

    private Long id;
    private Long courseId;
    private String status;
    private Long studentId;

    public Enrolled(Lecture aggregate) {
        super(aggregate);
    }

    public Enrolled() {
        super();
    }
}
