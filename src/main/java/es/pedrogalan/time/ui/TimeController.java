package es.pedrogalan.time.ui;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;

@Controller
public class TimeController {

    @Autowired
    private RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "getDefaultTime")
    @RequestMapping("/")
    public String getTime(Model model) {
        String time = restTemplate.getForObject("http://time-service/", String.class);
        model.addAttribute("time", time);
        return "timeView";
    }

    private String getDefaultTime(Model model) {
        model.addAttribute("time", "We are not sure at this moment.");
        return "timeView";
    }
}
