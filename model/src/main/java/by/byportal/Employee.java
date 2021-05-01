package by.byportal;

public class Employee {

        static int portal_id = 0;
        private String name;
        private String surname;
        private String patronymic;
        private String afterbirth;
        private String position;
        private String adress_work;
        private Integer age;
        // private String grade;
        private String telephone_stack;
        private boolean at_work = true;

    public Employee(String surname, String name, Integer age, String position) {
        this.name = name;
        this.surname = surname;
        this.position = position;
        this.age = age;
    }

    public Employee() {
            System.out.println();
        }

        public Employee(String name, String surname, String patronymic, String afterbirth, String position, String adress_work, String telephone_stack, boolean at_work/*, String grade*/) {
            this.name = name;
            this.surname = surname;
            this.patronymic = patronymic;
            this.afterbirth = afterbirth;
            this.position = position;
            this.adress_work = adress_work;
            this.telephone_stack = telephone_stack;
            this.at_work = at_work;
            //this.grade = grade;
        }

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

        //public String getGrade() {
        //  return grade();}

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

        //public String getGrade() {
        //  return grade();}

        public void setTelephone_stack (String telephone_stask) {
            this.telephone_stack = telephone_stask;
        }

        public void setAt_work (boolean at_work) {
            this.at_work = at_work;
        }


    }

