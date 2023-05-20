package slp.domain;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import slp.domain.*;

@RepositoryRestResource(collectionResourceRel = "lectures", path = "lectures")
public interface LectureRepository
    extends PagingAndSortingRepository<Lecture, Long> {}
