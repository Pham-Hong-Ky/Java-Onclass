import java.util.Scanner;

public class Car extends Vehicle{
    protected int seatNum;

    public Car() {}

    public Car(String brand, int speed, int weight, String color, int seatNum) {
        super(brand, speed, weight, color);
        this.seatNum = seatNum;
    }

    @Override
    public void init() {
        super.init();
        Scanner scanner = new Scanner(System.in);
        this.seatNum = scanner.nextInt();
    }

    @Override
    public void display() {
        super.display();
        System.out.println(this.seatNum);
    }
}
