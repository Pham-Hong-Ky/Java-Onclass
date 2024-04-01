import java.util.Scanner;

public class Citizen {
    protected String name;
    protected String birthday;
    protected String address;
    protected String idCardNum;

    public Citizen() {}

    public Citizen(String name, String birthday, String address, String idCardNum) {
        this.name = name;
        this.birthday = birthday;
        this.address = address;
        this.idCardNum = idCardNum;
    }

    public void addInfo() {
        Scanner scanner = new Scanner(System.in);
        this.name = scanner.nextLine();
        this.birthday = scanner.nextLine();
        this.address = scanner.nextLine();
        this.idCardNum = scanner.nextLine();
    }

    public void display() {
        System.out.println(this.name + " " + this.birthday + " " + this.address + " " + this.idCardNum);
    }
}
