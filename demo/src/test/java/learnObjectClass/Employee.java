package learnObjectClass;

public class Employee {
  private String name;
  private int age;
  private String designation;
  private double salary;

  public Employee(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public String getDesignation() {
    return designation;
  }

  public void setDesignation(String designation) {
    this.designation = designation;
  }

  public double getSalary() {
    return salary;
  }

  public void setSalary(double salary) {
    this.salary = salary;
  }

  public void print() {
    System.out.println("名字：" + this.name);
    System.out.println("年龄：" + this.age);
    System.out.println("职位：" + this.designation);
    System.out.println("薪水：" + this.salary);
  }

  public static void main(String[] args) {
    Employee employee1 = new Employee("员工一");
    Employee employee2 = new Employee("员工二");

    employee1.setAge(18);
    employee1.setDesignation("菜鸟程序员");
    employee1.setSalary(2500.01);
    employee1.print();

    employee2.setAge(25);
    employee2.setDesignation("高级序员");
    employee2.setSalary(12500.01);
    employee2.print();
  }
}
