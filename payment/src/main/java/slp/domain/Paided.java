package slp.domain;

import java.util.*;
import lombok.*;
import slp.domain.*;
import slp.infra.AbstractEvent;

@Data
@ToString
public class Paided extends AbstractEvent {

    private Long id;

    public Paided(Payment aggregate) {
        super(aggregate);
    }

    public Paided() {
        super();
    }
}
