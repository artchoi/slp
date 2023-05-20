package slp.infra;

import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;
import slp.domain.*;

@Component
public class CertificationHateoasProcessor
    implements RepresentationModelProcessor<EntityModel<Certification>> {

    @Override
    public EntityModel<Certification> process(
        EntityModel<Certification> model
    ) {
        return model;
    }
}
