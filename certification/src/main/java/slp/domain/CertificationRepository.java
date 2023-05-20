package slp.domain;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import slp.domain.*;

@RepositoryRestResource(
    collectionResourceRel = "certifications",
    path = "certifications"
)
public interface CertificationRepository
    extends PagingAndSortingRepository<Certification, Long> {}
