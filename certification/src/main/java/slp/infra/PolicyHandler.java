package slp.infra;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import javax.naming.NameParser;
import javax.naming.NameParser;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;
import slp.config.kafka.KafkaProcessor;
import slp.domain.*;

@Service
@Transactional
public class PolicyHandler {

    @Autowired
    CertificationRepository certificationRepository;

    @Autowired
    CertificationRepository certificationRepository;

    @StreamListener(KafkaProcessor.INPUT)
    public void whatever(@Payload String eventString) {}

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='LectureCompleted'"
    )
    public void wheneverLectureCompleted_CertifyPolicy(
        @Payload LectureCompleted lectureCompleted
    ) {
        LectureCompleted event = lectureCompleted;
        System.out.println(
            "\n\n##### listener CertifyPolicy : " + lectureCompleted + "\n\n"
        );
        // Sample Logic //

    }

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='LectureCompleted'"
    )
    public void wheneverLectureCompleted_CertifyPolicy(
        @Payload LectureCompleted lectureCompleted
    ) {
        LectureCompleted event = lectureCompleted;
        System.out.println(
            "\n\n##### listener CertifyPolicy : " + lectureCompleted + "\n\n"
        );
        // Sample Logic //

    }
}
