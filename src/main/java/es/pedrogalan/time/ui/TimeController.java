package es.pedrogalan.time.ui;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;

@Controller
public class TimeController {

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("/")
    public String getTime(Model model) {

        String time = restTemplate.getForObject("http://time-service/", String.class);

        model.addAttribute("time", time);

        return "timeView";
    }
}
