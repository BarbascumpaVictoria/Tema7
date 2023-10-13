package Sarcina_1;

public class Employee {
    private static String Name;

    private static int Age;

    private static String Departament;

    public Employee(String name, int age, String departament){
        this.Name = name;
        this.Age =  age;
        this.Departament = departament;
    }

    public static String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public static int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }

    public static String getDepartament() {
        return Departament;
    }

    public void setDepartament(String departament) {
        Departament = departament;
    }
}
