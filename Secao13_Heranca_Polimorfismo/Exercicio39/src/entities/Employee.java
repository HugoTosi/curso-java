package entities;

import java.util.Scanner;

public class Employee {
    Scanner sc = new Scanner(System.in);
    protected String name;
    protected Integer hours;
    protected Double valuePerHour;

    public Employee() {
    }

    public Employee(String name, Integer hours, Double valuePerHour) {
        this.name = name;
        this.hours = hours;
        this.valuePerHour = valuePerHour;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getHours() {
        return hours;
    }

    public Double getValuePerHour() {
        return valuePerHour;
    }

    public void setValuePerHour(Double valuePerHour) {
        this.valuePerHour = valuePerHour;
    }

    public double payment(){
        return hours * valuePerHour;
    }

    public Employee createEmployee() {
        System.out.println("Name: ");
        this.name = sc.nextLine();
        System.out.println("Hours: ");
        this.hours = sc.nextInt();
        System.out.println("Value per Hour");
        this.valuePerHour = sc.nextDouble();
        sc.nextLine();
        return new Employee(name, hours, valuePerHour);
    }

    public String toString() {
        return "Name: " + name + "- $" + payment();
    }

}
