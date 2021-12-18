package by.byportal.restcontroller;

import by.byportal.model.Employe;
import by.byportal.repository.EmployeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@RestController
public class PortalRestController {

    @Autowired
    EmployeRepository employeRepository;


    //TODO: СаняЛ: очистить Rest - убрать лишнее, оставить только получиние ОДНОГО емплоя, всех емплойв, удаление, обновление и создание
    @GetMapping("/hello")
    public String homePage() {
        System.out.println("hello - проверка вывода в консоль надписи из вкладки /hello");
        String someString = "проверка работоспособности ";
        return someString + " 5";
    }

    // TODO: СаняЛ: Доделать GET эмплоя по id
    @GetMapping("/employe")
    public Employe getEmploye() {
        //Employe employe1 = new Employe("Сергей", "Иванюклвич", 35, "TeamLid");
        Employe exampleEmploye = new Employe("Иванюкович", "Сергей", LocalDate.of(1985,5,25));
        //Employe testEmploye = employeRepository.????
        return exampleEmploye; //employe1;
    }

    @GetMapping("/employes")
    public List<Employe> getEmployes() {
        System.out.println("getEmployes() rest-controller");
        List<Employe> employes = employeRepository.findAll();
        // TODO: СаняЛ: Доделать эмплоёв и тут в соответствии с классом
/*      employes.add(new Employe("Островский", "Руслан", 37, "Developer"));
        employes.add(new Employe("Левченко", "Александр", 36, "Junior"));
        employes.add(new Employe("Рагозинский", "Алексей", 35, "Junior"));
        employes.add(new Employe("Якимчик", "Александр", 34, "Junior"));
        employes.add(new Employe("Савицкий", "Владимир", 38, "Junior"));*/
        return employes;
    }

    // PUT
    @PutMapping(value = "/employes")
    public ResponseEntity<?>  update(@RequestBody Employe updateEmploye) throws Exception {
        Optional<Employe> employe = employeRepository.findById(updateEmploye.getEmployeId());
        if(employe.isPresent()) {
            employeRepository.save(updateEmploye);
            return new ResponseEntity<>(HttpStatus.ACCEPTED);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_ACCEPTABLE);
        }
    }

    // POST
    // POST: http://localhost:/employes   <- Employee { id: 5, firstName: "Serega" , .... }
    @PostMapping(value = "/employes")
    public ResponseEntity<?> save(@RequestBody Employe saveEmploye) {
        Employe temp = employeRepository.save(saveEmploye);
        if (temp.getEmployeId() > 0)
            return new ResponseEntity<>(HttpStatus.CREATED);
        else
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
    }

    // DELETE -> http://localhost:8090/emploees/55
    @DeleteMapping(value = "/employes/{personId:\\d+}")
    public ResponseEntity<?> deleteProfile(@PathVariable Long personId) throws Exception {
        //profileService.deleteProfile(personId);
        Optional<Employe> employe = employeRepository.findById(personId);
        if(employe.isPresent()) {
            employeRepository.deleteEmployeByEmployeId(personId);
            return new ResponseEntity<>(HttpStatus.ACCEPTED);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_ACCEPTABLE);
        }
    }

}