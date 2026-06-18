import java.io.*;
import java.util.*;
class Employee implements Serializable {
    int id; String name, department; double salary;
    Employee(int id,String name,String department,double salary){
        this.id=id; this.name=name; this.department=department; this.salary=salary;
    }
}
class EmployeeSerialization {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Employee e = new Employee(sc.nextInt(), sc.next(), sc.next(), sc.nextDouble());
        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("employee.txt"));
        out.writeObject(e);
        out.close();

        ObjectInputStream in = new ObjectInputStream(new FileInputStream("employee.txt"));
        Employee emp = (Employee) in.readObject();
        in.close();

        System.out.println(emp.id + " " + emp.name + " " + emp.department + " " + emp.salary);
    }
}