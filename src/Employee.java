public class Employee {
    public int calculateSalary(int bonuses, int amla)
    {
        int salary = 12000*amla*bonuses;
        System.out.printf("Base salary is %d a month\n", salary);
        return 12000;
    }

    public void getDetails(int salary)
    {
        System.out.printf("Employee X working as Y getting 12000 Shekels a month.\n");
    }
}
