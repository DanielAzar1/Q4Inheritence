public class Developer extends Employee
{
    @Override
    public int calculateSalary(int bonuses, int amla) {
        return super.calculateSalary(bonuses, amla);
    }

    @Override
    public void getDetails(int salary) {
        System.out.printf("Worker x working as a Developer getting %d a month\n", salary);
    }

    public void performTask()
    {
        System.out.println("Develop");
    }
}
