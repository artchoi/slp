package slp.domain;

import java.util.*;
import lombok.*;
import slp.domain.*;
import slp.infra.AbstractEvent;

@Data
@ToString
public class CourseDeleted extends AbstractEvent {

    private Long id;

    public CourseDeleted(Course aggregate) {
        super(aggregate);
    }

    public CourseDeleted() {
        super();
    }
}
