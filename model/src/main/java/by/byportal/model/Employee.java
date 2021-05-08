package by.byportal.model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;
import java.util.Locale;

public class Employee {

        static int portalId = 0;
        private String firstName;        // First Name
        private String lastName;
        private String middleName;
        private String birthDate;
        private String jobPosition;
        private String workingAddress;
        //private Integer age;          // TODO: Нужен ли здесь age ?
        private List<String> phoneNumbers;
        private byte availibility;      // is at work? available? busy?


    // CONSTRUCTORS
    public Employee() {
            System.out.println();
        }

    public Employee(String firstName, String lastName, String birthDate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
    }

    // METHODS
    public Integer getAge() throws ParseException {
        Date birthDateParsed = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH).parse(birthDate);
        System.out.println("birthDateParsed = " + birthDateParsed);
        return 0;
    }

    /*  GETTERS  AND  SETTERS*/
    public static int getPortalId() {
        return portalId;
    }

    public static void setPortalId(int portalId) {
        Employee.portalId = portalId;
    }

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

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getJobPosition() {
        return jobPosition;
    }

    public void setJobPosition(String jobPosition) {
        this.jobPosition = jobPosition;
    }

    public String getWorkingAddress() {
        return workingAddress;
    }

    public void setWorkingAddress(String workingAddress) {
        this.workingAddress = workingAddress;
    }

    public List<String> getPhoneNumbers() {
        return phoneNumbers;
    }

    public void setPhoneNumbers(List<String> phoneNumbers) {
        this.phoneNumbers = phoneNumbers;
    }

    public byte getAvailibility() {
        return availibility;
    }

    public void setAvailibility(byte availibility) {
        this.availibility = availibility;
    }
}

