package by.brest.mts.myapp;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/*Есть какие-то поля
Есть конструктор для создания с какими-то параметрами
Есть геттерсы-сеттеры*/

public class Employee {

    static int portal_id = 0;           // ? - для чего, STATIC

    private long id;                    // ID                               // long/Long
    private String name;                // Имя              name
    private String surname;             // Фамилия          surName
    private String patronymic;          // Отчество         middleName
    private String afterbirth;          // Дата рожждения   birthDay        // Date?
    private String position;            // Должность                        // int/Integer -> хранить в БД
    private String adress_work;         // Рабочий адрес    workAddress
    private String grade;               // -
    private String telephone_stack;     // -
    private boolean at_work = true;     // -


    public Employee() {             // Для наследования, но public нужен ли?
        System.out.println();
    }

    public Employee(String name, String surname, String patronymic, String afterbirth, String position, String adress_work, String telephone_stack, boolean at_work, String grade) {
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
        this.afterbirth = afterbirth;
        this.position = position;
        this.adress_work = adress_work;
        this.telephone_stack = telephone_stack;
        this.at_work = at_work;
        this.grade = grade;
    }

    // Подумать может добавить конструктор с МИНИМАЛЬНЫМ, но необходимым количеством параметров

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public String getDatebirth() {
        return afterbirth;
    }

    public String getPosition() {
        return position;
    }

    public String getAdress_work() {
        return adress_work;
    }

    public String getGrade() {
        return grade;
    }

    public String getTelephone_stask() {
        return telephone_stack;
    }

    public boolean getAt_work() {
        return at_work;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname (String surname) {
        this.surname = surname;
    }

    public void setPatronymic (String patronymic) {
        this.patronymic = patronymic;
    }

    public void setDatebirth (String datebirth) {
        this.afterbirth = afterbirth;
    }

    public void setPosition (String position) {
        this.position = position;
    }

    public void setAdress_work (String adress_work) {
        this.adress_work = adress_work;
    }

    public String setGrade() {
        return grade;
    }

    public void setTelephone_stack (String telephone_stask) {
        this.telephone_stack = telephone_stask;
    }

    public void setAt_work (boolean at_work) {
        this.at_work = at_work;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", patronymic='" + patronymic + '\'' +
                ", afterbirth='" + afterbirth + '\'' +
                ", position='" + position + '\'' +
                ", adress_work='" + adress_work + '\'' +
                ", telephone_stack='" + telephone_stack + '\'' +
                ", at_work=" + at_work +
                '}';
    }

/*
    if(myHuman.humanAge == 7 && humanWeight >= basic.getWeight()) {
        myHuman.humanAge++;
        System.out.println("portal_id = " + portal_id);
    } else {
        System.out.println("Erorr there");
    }

    (myHuman.humanAge == 7 &&humanWeight>=basic.getWeight()) ? {myHuman.humanAge++; System.out.println("portal_id = " + portal_id);} : System.out.println("Erorr there");
*/

}


/*class Employeemain {
    public static void main(String[] args) throws IOException {
        // Здесь создаём несколько сотрудников

        Employee Andrey = new Employee("Андрей", "Шмаровоз", "Васильевич", "14.03.1980", "Директор по развитию шляпного цеха",
                "224022, Брест, ул.Суворова, д.116, стр.1, 3 этаж, каб.1", "+375297568956", true, "g");

        String human = "C:\\my\\Employee.txt";
        new File(human).getParentFile().mkdirs();
        FileWriter writer = new FileWriter(human);
        writer.write(Andrey.toString());
        writer.write("\r\n");

        Employee Boris = new Employee("Борис", "Ельцин", "Дормидонтович", "14.03.1960", "Уборщик",
                "224022, Брест, ул.Московская, д.116, стр.1, 1 этаж, каб.1", "+375292356888", true, "c");
        writer.write(Boris.toString());
        writer.write("\r\n");

        Employee Maksim = new Employee("Максим", "Стрельцов", "Сигизмундович", "14.03.1978", "Долбоёб, помощник уборщика",
                "224022, Брест, ул.Московская, д.116, стр.1, 1 этаж, каб.2", "+375293568974", true, "d");
        writer.write(Maksim.toString());
        writer.write("\r\n");
        writer.close();
    }
}*/

