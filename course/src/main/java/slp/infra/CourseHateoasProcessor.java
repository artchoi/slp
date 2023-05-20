package slp.infra;

import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;
import slp.domain.*;

@Component
public class CourseHateoasProcessor
    implements RepresentationModelProcessor<EntityModel<Course>> {

    @Override
    public EntityModel<Course> process(EntityModel<Course> model) {
        return model;
    }
}
