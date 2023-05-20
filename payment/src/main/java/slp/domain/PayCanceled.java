package slp.domain;

import java.util.*;
import lombok.*;
import slp.domain.*;
import slp.infra.AbstractEvent;

@Data
@ToString
public class PayCanceled extends AbstractEvent {

    private Long id;

    public PayCanceled(Payment aggregate) {
        super(aggregate);
    }

    public PayCanceled() {
        super();
    }
}
