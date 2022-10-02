/// ten klas ma pola, uzywa konstruktor i metody

public class Employee {
    // klasa modelowa-
    //skladniki klasy: pola, konstruktory, metody
    //1 pola
    private String firstName;
    private String lastName;
    private int age;
    private String sex;
    private String role;
    private boolean isManager;
    private double salary;

    //2 konstruktory
    // wykona sie gdy tworzymy obiekt klasy-new
    // konstruktor domyslny juz jest


    public Employee(String firstName, String lastName) {

        this.firstName = firstName;
        this.lastName = lastName;

    }
//    public Employee(String firstName, String lastName, int age, String sex, String role, boolean isManager,double salary){
//        this.firstName = firstName;
//        this.lastName = lastName;
//        this.age = age;
//        this.sex = sex;
//        this.role = role;
//        this.isManager = isManager;
//        this.salary = salary;

    // dodałem Alt+insert i wybrać wszystko w konstruktorze
    public Employee(String firstName, String lastName, int age, String sex, String role, boolean isManager, double salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.sex = sex;
        this.role = role;
        this.isManager = isManager;
        this.salary = salary;
    }

    public Employee(boolean isManager, double salary) {
        this.isManager = isManager;
        this.salary = salary;
    }

    // konstruktor domyslny, bezparametrowy
    public Employee() {

    }
    //3 metody - wita pracownika w firmie WelcomePack

    public String getWelcomePack() {
        String welcomeText = "Witamy w firmie, oto, Twój welcome pack " + this.firstName;
        return welcomeText;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public boolean isManager() {
        return isManager;
    }

    public void setManager(boolean manager) {
        isManager = manager;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public static void reduceSalary(Employee employee) {
        double currentSalary = employee.getSalary();
        double newSalary = currentSalary / 2;
        if((employee.getFirstName().equals("Salma"))||(employee.getFirstName().equals("Matt"))||(employee.getFirstName().equals("Tom"))){
//
        }
        else {
            employee.setSalary(newSalary);
        }
    }
public static void safeTofile(String exampleText){
        //kod java odpowiedzilny za stworzenie pliku
    System.out.println("Zapisałam do pliku");
}

}
