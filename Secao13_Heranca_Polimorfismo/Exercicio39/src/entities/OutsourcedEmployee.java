package entities;

public class OutsourcedEmployee extends Employee {

    protected Double additionalCharge;

    public OutsourcedEmployee() {
    }

    public OutsourcedEmployee(String name, Integer hours, Double valuePerHour, Double additionalCharge) {
        super(name, hours, valuePerHour);
        this.additionalCharge = additionalCharge;
    }

    @Override
    public double payment(){
        return super.payment() + additionalCharge * 1.1;
    }


    public String toString() {
        return "Name: " + name + "- $" + payment();
    }

    public OutsourcedEmployee createOutsourcedEmployee(){
        System.out.println("Name: ");
        this.name = sc.nextLine();
        System.out.println("Hours: ");
        this.hours = sc.nextInt();
        System.out.println("Value per Hour");
        this.valuePerHour = sc.nextDouble();
        System.out.println("Additional Charge");
        this.additionalCharge = sc.nextDouble();
        sc.nextLine();
        return new OutsourcedEmployee(name, hours, valuePerHour, additionalCharge);
    }
}
