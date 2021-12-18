package by.byportal.webcontroller;

import by.byportal.model.Employe;
import by.byportal.webcontroller.filessaweready.ReadFileExcel;
import by.byportal.webcontroller.filessaweready.SaveFileExcel;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Controller
public class PortalWebController {

    RestTemplate restTemplate;
    final String ROOT_URL = "http://localhost:8090/";

    @GetMapping("/web/get")
    public String employeeGet (Model model){
        restTemplate=new RestTemplate();
        ResponseEntity<Employe[]> person = restTemplate.getForEntity(ROOT_URL+"employees", Employe[].class);
        Employe[] pageList = person.getBody();
        model.addAttribute("pagelistweb", pageList);
        Employe newEmploye = new Employe();
        model.addAttribute("newemployee", newEmploye);
        Employe putEmplpoyee = new Employe();
        model.addAttribute("putemployee", putEmplpoyee);
        return "HomePage";
    }
   /* @GetMapping("/")
    public String startPage (Model model){
        return "StartPage";
    }*/

    @GetMapping("/web/post")
    public String addEmployeeGet(Model model){

        return "HomePage";
    }

    @PostMapping("/web/post")
    public String addEmployee(Employe newemployee) throws Exception {
        restTemplate = new RestTemplate();
        restTemplate.postForObject(ROOT_URL + "emploees", newemployee, Employe.class);
        return "redirect:/web/get";
    }

    @PutMapping("/web/put}")
    public String putEmployeeOne (@RequestBody Employe putemployee) throws Exception {
        restTemplate = new RestTemplate();
        restTemplate.put(ROOT_URL + "employees/{id}", putemployee, Employe.class);
        return "redirect:/web/get";
    }

    @DeleteMapping("/web/{id}")
    public String delEmploeeOne (@PathVariable(value = "id") long id, Model model){
        restTemplate = new RestTemplate();
        restTemplate.delete(ROOT_URL + "employees/{id}", Employe.class);
        // TO REST: DELETE -> http://localhost:8090/emploees/55
        return "redirect:/web/get";
    }
    @GetMapping("/save")
    public String saveMyFile (Model model) {
        restTemplate=new RestTemplate();
        ResponseEntity<Employe[]> person = restTemplate.getForEntity(ROOT_URL+"employees", Employe[].class);
        Employe[] pageList = person.getBody();
        SaveFileExcel.saveFile(pageList);
    return "HomePage";
    }
    @GetMapping("/read")
    public String readMyFile(Model model){
        List readlist = ReadFileExcel.readFile();
        model.addAttribute("readlist", readlist);
        return "HomePage";
    }
}
