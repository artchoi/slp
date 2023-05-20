package slp.domain;

import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;
import slp.CertificationApplication;

@Entity
@Table(name = "Certification_table")
@Data
public class Certification {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private Long courseId;

    private Long studentId;

    private String status;

    public static CertificationRepository repository() {
        CertificationRepository certificationRepository = CertificationApplication.applicationContext.getBean(
            CertificationRepository.class
        );
        return certificationRepository;
    }
}
