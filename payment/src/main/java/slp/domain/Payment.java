package slp.domain;

import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;
import slp.PaymentApplication;
import slp.domain.Paided;
import slp.domain.PayCanceled;

@Entity
@Table(name = "Payment_table")
@Data
public class Payment {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private Long courseId;

    private Long studentId;

    private String status;

    private String paymentType;

    @PrePersist
    public void onPrePersist() {
        Paided paided = new Paided(this);
        paided.publishAfterCommit();

        PayCanceled payCanceled = new PayCanceled(this);
        payCanceled.publishAfterCommit();
    }

    public static PaymentRepository repository() {
        PaymentRepository paymentRepository = PaymentApplication.applicationContext.getBean(
            PaymentRepository.class
        );
        return paymentRepository;
    }
}
