package slp.domain;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import slp.domain.*;

@RepositoryRestResource(collectionResourceRel = "payments", path = "payments")
public interface PaymentRepository
    extends PagingAndSortingRepository<Payment, Long> {}
