import java.util.ArrayList;
import java.util.Collections;

public class App {
    public static void main(String[] args) throws Exception {

        ArrayList<Employee> emplist = new ArrayList<>();

        emplist.add(new Employee(1, "Andrew", 70000, new Address(31, "JV Lane", "Memari", "Haryana", 764233) ));
        emplist.add(new Employee(2, "Zack", 12000, new Address(87, "FG Street", "Noida", "Mumbai", 546632) ));
        emplist.add(new Employee(3, "Kate", 98000, new Address(32, "JV Lane", "Kolkata", "Amsterdam", 651120) ));
        emplist.add(new Employee(4, "Francis", 69000, new Address(99, "JV Lane", "Nakamura", "Kyoto", 112345) ));

        System.out.println("Employee List before sorting");
        System.out.println();

        for(Employee e : emplist){
            System.out.println(e);
        }

        System.out.println();
        System.out.println("Employee List after sorting based on employee salary");
        System.out.println();
        Collections.sort(emplist);

        for(Employee e : emplist){
            System.out.println(e);
        }
        System.out.println();
        NameSort namesort = new NameSort();

        System.out.println("Employee List after sorting based on employee name");
        System.out.println();
        Collections.sort(emplist, namesort);

        for(Employee e : emplist){
            System.out.println(e);
        }
        System.out.println();
        IdSort idsort = new IdSort();

        System.out.println("Employee List after sorting based on employee ID");
        System.out.println();
        Collections.sort(emplist, idsort);

        for(Employee e : emplist){
            System.out.println(e);
        }
        System.out.println();


    }
}
