package ie.atu.oop.exam;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter workshop name: ");
        String name = scanner.nextLine();

        System.out.print("Enter capacity: ");
        int capacity = Integer.parseInt(scanner.nextLine());

        Workshop workshop = new Workshop(name, capacity);
        System.out.println("Workshop name: " + workshop.getWorkshopName()
                + "   Capacity: " + workshop.getCapacity());

        scanner.close();
    }
}