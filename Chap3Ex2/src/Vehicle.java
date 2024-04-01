import java.util.Scanner;

public class Vehicle {
    protected String brand;
    protected int speed;
    protected int weight;
    protected String color;

    public Vehicle() {}

    public Vehicle(String brand, int speed, int weight, String color) {
        this.brand = brand;
        this.speed = speed;
        this.weight = weight;
        this.color = color;
    }

    public void init() {
        Scanner scanner = new Scanner(System.in);
        this.brand = scanner.nextLine();
        this.speed = scanner.nextInt();
        this.weight = scanner.nextInt();
        this.color = scanner.nextLine();
    }

    public void display() {
        System.out.println(this.brand  + " " + this.speed + " " + this.weight + " " + this.color);
    }
}
