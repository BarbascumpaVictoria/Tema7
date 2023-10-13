package Sarcina_1;

public class Main {
    public static void main(String[] args) {

        Employee angajat = new Employee("Maria", 20, "SecuritateCibernetica");
        System.out.println(Employee.getName() +"  "+ Employee.getAge() +"  "+ Employee.getDepartament());
        }
    }

//   Sarcina 1.	Definiți o clasă cu denumirea Employee. Adăugați 3 membri: name, age și
//           department de tip String, int și String. Marcați membrii cu modificatorul de acces
//private. Furnizați un constructor cu 3 parametri și metode getter/setter pentru fiecare membru.
//        Scopul exercițiului este să creați o clasă bine încapsulată.