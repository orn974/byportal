package by.byportal.model;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDate;

@Entity
public class Employe {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    Long employeId;
    private String firstName;
    private String lastName;
    @DateTimeFormat(pattern = "yyyy-MM-dd'T'HH:mm") //'T'HH:mm
    private LocalDate birthDate;
    //private int portalId = 0;
    //private String middleName;
    //private String jobPosition;
    //private String workingAddress;
    //private Integer age;
    //private String phoneNumber;
    //private int availibility;

    public Employe() {
        System.out.println();
    }

    public Employe(String firstName, String lastName, LocalDate birthDate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
    }

    public Long getEmployeId() {
        return employeId;
    }

/*    public void setEmployeeId(Long employeeId) {
        this.employeeId = employeeId;
    }*/

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    @Override
    public String toString() {
        return "Employe{" +
                "employeId=" + employeId +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", birthDate=" + birthDate +
                '}';
    }
}