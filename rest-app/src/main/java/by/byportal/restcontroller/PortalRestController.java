package by.byportal.restcontroller;

import by.byportal.repository.EmployeeRepository;
import by.byportal.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.*;

@RestController
public class PortalRestController {

    @Autowired
    EmployeeRepository employeeRepository;

    @GetMapping("/hello")
    public String homePage() {
        System.out.println("hello - проверка вывода в консоль надписи из вкладки /hello");
        String someString = "проверка работоспособности ";
        return someString + " 5";
    }
    @GetMapping("/employee")
    public Employee getEmployee() {
        Employee employee1 = new Employee("Островский", "Руслан", LocalDate.of(55,55,55));
        Employee exampleEmployee = new Employee("Иванюкович", "Сергей", LocalDate.of(1985,5,25));
        //Employee testEmployee = employeeRepository.save(employee1);
        return exampleEmployee; //employee1;
    }
    @GetMapping("/employees")
    public List<Employee> getEmployees() {
        System.out.println("getEmployees() rest-controller");
        List<Employee> employees = employeeRepository.findAll();
         //TODO: Доделать эмплоёв и тут в соответствии с классом
        /*employees.add(new Employee("Островский", "Руслан", LocalDate.of(55,4,77)));
        employees.add(new Employee("Левченко", "Александр", LocalDate.of(55,4,77)));
        employees.add(new Employee("Рагозинский", "Алексей", LocalDate.of(55,44,77)));
        employees.add(new Employee("Якимчик", "Александр", LocalDate.of(55,44,77)));
        employees.add(new Employee("Савицкий", "Владимир", LocalDate.of(55,44,77)));*/
        //employeeRepository.save(employees);
        return employees;
    }
}
   //ORN


