package employee;

public class EmployeeTest {
    public static void main(String args[]) {
        Date birth = new Date(7, 24, 1949);
        Date hire = new Date(3, 12, 1988);
        Employee employee = new Employee("Bob", "Blue", birth, hire);
        System.out.println("-------------");
        System.out.println("println(employee.toString()): ");
        System.out.println(employee.toString());
        System.out.println("-------------");
        System.out.println("println(employee): ");
        System.out.println(employee);
        System.out.println("-------------");
        System.out.println("print(employee): ");
        System.out.print(employee);        
        System.out.println("-------------");
        System.out.println("printf(\"%s\", employee): ");
        System.out.printf("%s", employee);
        System.out.println("-------------");

        // 結論：
        // 當我們實作 toString 方法時，Java 會自動在我們試途印出物件時呼叫 .toString()
        // 當我們沒有實作 toString 方法時，Java 會在我們試途印出物件時，印出物件的 id
    }
}
