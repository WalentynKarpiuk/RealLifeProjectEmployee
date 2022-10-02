public class Run {
    //uruchomieniowa, employee -klasa pomocnicza;
    public static void main(String[] args) {
        Employee salmaHayek=new Employee("Salma", "Hayek", 50, "woman", "manager", true, 10500);
        Employee valentynValenty=new Employee("Valentyn", "Valenty", 25, "man", "director", true, 120000);
        Employee georgeBobo=new Employee("George", "Bobo", 40, "man", "dev", false, 15000);
        Employee luisaFlint=new Employee("Luisa", "Flint", 25, "voman", "product owner", true, 15000);
        Employee garryRussell=new Employee("Garry", "Russell", 18, "man", "scrum master", false, 10000);
        Employee alexConaghay=new Employee("Alex", "Conaghay", 26, "man", "project manager", true, 30000);
        Employee jimmyBrown=new Employee("Jimmy", "Brown", 33, "man", "CEO", true, 15000);
        Employee druMetthew=new Employee("Dru", "Metthew", 19, "man", "dev", false, 70000);
        Employee terryMac=new Employee("Terry", "Mac", 27, "voman", "dev", false, 60000);
        Employee mojoKlark=new Employee("Mojo", "Klark", 39, "man", "QA", false, 50000);
        Employee karlMarks=new Employee("Karl", "Marks", 99, "man", "QC", false, 40000);
        Employee cateBlanchett=new Employee("Cate", "Blanchett", 25, "man", "director", true, 120000);
        Employee bruceWillis=new Employee("Bruce", "Willis", 40, "man", "dev", false, 15000);
        Employee deNiro=new Employee("De", "Niro", 25, "voman", "product owner", true, 15000);
        Employee tomKim=new Employee("Tom", "Kim", 18, "man", "scrum master", false, 10000);
        Employee sashaWhite=new Employee("Sasha", "White", 26, "man", "project manager", true, 30000);
        Employee mattDemon=new Employee("Matt", "Demon", 33, "man", "CEO", true, 15000);
        Employee markWahlberg=new Employee("Mark", "Wahlberg", 19, "man", "dev", false, 70000);
        Employee chrisHemsworth=new Employee("Chris", "Hemsworth", 27, "voman", "dev", false, 60000);
        Employee chrisEvans=new Employee("Chris", "Evans", 49, "man", "QA", false, 50000);
        Employee scarlettJohansson=new Employee("Scarlet", "Johanssson", 39, "voman", "QC", false, 40000);

//        System.out.println("Zarobki Salmy: " + salmaHayek.getSalary());
//        salmaHayek.setSalary(12500);
//        System.out.println("Nowe zarobki Salmy: " + salmaHayek.getSalary());
//        System.out.println("Role Salmy: " + salmaHayek.getRole());
//        salmaHayek.setRole("Wiceprezes");
//        System.out.println("Aktualna rola Salmy: " + salmaHayek.getRole());
//        System.out.println("Karl Marks pełni role:" + karlMarks.getRole());
//
//        System.out.println("Zarobki Luisa:" + luisaFlint.getSalary());
//        luisaFlint.setSalary(100000);
//        System.out.println("Nowa kwota w zarobkach Luisa: "+ luisaFlint.getSalary());
//
//        System.out.println("nazwisko Jimmi jest: " + jimmyBroun.getLastName());
//        jimmyBroun.setLastName("Juzik");
//        System.out.println("Nowe nazwisko Jimmy jest: " + jimmyBroun.getLastName());
//
        //  System.out.println(salmaHayek.getWelcomePack()); //metoda objektowa
//        System.out.println(valentynValenty.getWelcomePack());
//        System.out.println(alecConachy.getWelcomePack());
        // metoda statyczna - wystarczy nazwy klasy
//        System.out.println("Obecna pensja Karla: " + karlMarks.getSalary());
//        Employee.reduceSalary(karlMarks);
//        System.out.println("Pensja po obniżce Karla: " + karlMarks.getSalary());
//
//        System.out.println("Obecna pensja Bobo: " + georgeBobo.getSalary());
//        Employee.reduceSalary(georgeBobo);
//        System.out.println("Pensja po obniżce Bobo: " + georgeBobo.getSalary());
//
        System.out.println("Obecna pensja Salmy: " + salmaHayek.getSalary());
        Employee.reduceSalary(salmaHayek);
        System.out.println("Pensja po obniżce Salmy: " + salmaHayek.getSalary());
        System.out.println("Obecna pensja Salmy: " + tomKim.getSalary());
        Employee.reduceSalary(tomKim);
        System.out.println("Obecna pensja Salmy: " + tomKim.getSalary());
        System.out.println("Obecna pensja Salmy: " + chrisEvans.getSalary());
        Employee.reduceSalary(chrisEvans);
        System.out.println("Obecna pensja Salmy: " + chrisEvans.getSalary());

        //Employee.safeTofile(salmaHayek.getWelcomePack());
//        System.out.println(scarlettJohansson.getSex());
//        chrisHemsworth.setSex("man");
//        System.out.println("plec Krisa teraz poprawna -" + chrisHemsworth.getSex());
    }
}
