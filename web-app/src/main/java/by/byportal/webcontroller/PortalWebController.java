package by.byportal.webcontroller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.client.RestTemplate;

@Controller
public class PortalWebController {

    RestTemplate restTemplate;
    final String ROOT_URL_DZ = "http://192.168.3.222:8080/";
    @GetMapping("/dz")
    public String dzGet (Model model){
        restTemplate=new RestTemplate();
        ResponseEntity<Employee[]> person = restTemplate.getForEntity(ROOT_URL_DZ+"employees", Employee[].class);
        Employee[] pageList = person.getBody();
        model.addAttribute("dzperson", pageList);
        return "DZPage";
    }
}
