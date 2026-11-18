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
        ArrayList<Member> members = new ArrayList<>();
        int choice = 0;

        while (choice != 5) {
            System.out.println("\n1. Add Member   2. Display All Members   3. Search by ID");
            System.out.println("4. Remove Member   5. Exit");
            System.out.print("Choose an option: ");
            choice = Integer.parseInt(scanner.nextLine());

            if (choice == 1) {
                members.add(readMember(scanner));
                System.out.println("Member added.");

            } else if (choice == 2) {
                if (members.isEmpty()) {
                    System.out.println("No members stored.");
                } else {
                    for (Member m : members) {
                        m.displayDetails();
                    }
                }

            } else if (choice == 3) {
                System.out.print("Enter member ID to search: ");
                String id = scanner.nextLine();
                boolean found = false;
                for (Member m : members) {
                    if (m.getMemberId().equals(id)) {
                        m.displayDetails();
                        found = true;
                        break;
                    }
                }
                if (!found) {
                    System.out.println("Member not found.");
                }

            } else if (choice == 4) {
                System.out.println("Remove Member will be implemented in Task 3.");

            } else if (choice == 5) {
                System.out.println("Goodbye!");

            } else {
                System.out.println("Invalid option.");
            }
        }
        scanner.close();
    }

}