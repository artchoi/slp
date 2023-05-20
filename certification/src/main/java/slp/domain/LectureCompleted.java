package slp.domain;

import java.util.*;
import lombok.*;
import slp.domain.*;
import slp.infra.AbstractEvent;

@Data
@ToString
public class LectureCompleted extends AbstractEvent {

    private Long id;
}
