package by.byportal;

import by.byportal.model.Employe;
import org.junit.jupiter.api.Test;
import org.springframework.util.Assert;

import java.time.LocalDate;

public class EmployeTest {

    @Test
    public void testSetGetFirstName() {
        Employe testEmploye = new Employe();
        String name = "Alex";
        testEmploye.setFirstName(name);

        Assert.isTrue(testEmploye.getFirstName() == name,
                "Employee firstName setter/getter is not working: Name is not Alex");
    }

    @Test
    public void testSetGetLastName() {
        Employe testEmploye = new Employe();
        String lastName = "Rabinovich";
        testEmploye.setLastName(lastName);

        // Этот тест недостоверно проверяет lastName еттер/геттер
        Assert.notNull(testEmploye.getLastName(),
                "Employee lastName setter/getter is not working: NULL");
    }

    @Test
    public void testEmployeeThreeConstructor() {
        LocalDate insertedDate = LocalDate.now();
        String name = "John";
        String last = "Markovich";
        Employe testEmploye = new Employe(name, last, insertedDate);

        Assert.isTrue(
                testEmploye.getFirstName() == name
                        && testEmploye.getLastName() == last
                        && testEmploye.getBirthDate() == insertedDate
                ,"Employee Employee(String, String, LocalDate) constructor is not properly working"
        );
    }
}
