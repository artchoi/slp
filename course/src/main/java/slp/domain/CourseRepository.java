package slp.domain;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import slp.domain.*;

@RepositoryRestResource(collectionResourceRel = "courses", path = "courses")
public interface CourseRepository
    extends PagingAndSortingRepository<Course, Long> {}
