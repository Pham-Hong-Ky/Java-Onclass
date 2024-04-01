import java.util.Scanner;

public class Officer extends Citizen {
    protected String department;
    protected String position;

    public Officer() {};

    public Officer(String name, String birthday, String address, String idCardNum, String department, String position) {
        super(name, birthday, address, idCardNum);
        this.department = department;
        this.position = position;
    }


    @Override
    public void addInfo() {
        super.addInfo();
        Scanner scanner = new Scanner(System.in);
        this.department = scanner.nextLine();
        this.position = scanner.nextLine();
    }

    @Override
    public void display() {
        super.display();
        System.out.print(" " + this.department + " " + this.position);
    }
}
