package ie.atu.oop.exam;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static Member readMember(Scanner scanner) {
        System.out.print("Enter member ID: ");
        String id = scanner.nextLine();

        System.out.print("Enter name: ");
        String name = scanner.nextLine();

        System.out.print("Enter age: ");
        int age = Integer.parseInt(scanner.nextLine());

        return new Member(id, name, age);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Member m = readMember(scanner);
        m.displayDetails();

        scanner.close();

    }
}