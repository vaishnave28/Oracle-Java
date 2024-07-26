abstract class Bank {
    abstract double getRateOfInterest();
}
class SBI extends Bank {
    double getRateOfInterest() { return 8.4; }
}
class ICICI extends Bank {
    double getRateOfInterest() { return 7.3; }
}
class AXIS extends Bank {
    double getRateOfInterest() { return 9.7; }
}
public class Main {
    public static void main(String[] args) {
        Bank[] banks = { new SBI(), new ICICI(), new AXIS() };
        System.out.println("SBI: " + banks[0].getRateOfInterest());
        System.out.println("ICICI: " + banks[1].getRateOfInterest());
        System.out.println("AXIS: " + banks[2].getRateOfInterest());
        System.out.println("Test case 1: SBI, " + new SBI() { double getRateOfInterest() { return 8.3; }}.getRateOfInterest());
        System.out.println("Test case 2: ICICI, " + banks[1].getRateOfInterest());
        System.out.println("Test case 3: AXIS, " + banks[2].getRateOfInterest());
        System.out.println("Test case 4: SBI, " + new SBI() { double getRateOfInterest() { return 8.6; }}.getRateOfInterest());
        System.out.println("Test case 5: AXIS, " + new AXIS() { double getRateOfInterest() { return 7.6; }}.getRateOfInterest());
    }
}
