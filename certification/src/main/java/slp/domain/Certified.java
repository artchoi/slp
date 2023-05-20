package slp.domain;

import java.util.*;
import lombok.*;
import slp.domain.*;
import slp.infra.AbstractEvent;

@Data
@ToString
public class Certified extends AbstractEvent {

    private Long id;

    public Certified() {
        super();
    }
}
