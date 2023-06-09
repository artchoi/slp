package slp.external;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Date;


@FeignClient(name = "payment", url = "${api.url.payment}")
public interface Service {
    @RequestMapping(method= RequestMethod.GET, path="/")
    public void requestPay(@RequestBody  );
}
