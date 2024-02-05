import model.Staff;

public class Main1 {
    public static void main(String[] args) {
        Staff s1 = new Staff("ram", 18, "98100000000", "chabahil", 100000);
        System.out.println("Staff Salary:" + s1.calculateSalary(3));
    }

}
