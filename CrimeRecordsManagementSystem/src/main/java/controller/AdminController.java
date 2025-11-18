package controller;

import model.*;
import service.*;
import java.util.*;

public class AdminController {

    private Scanner sc = new Scanner(System.in);
    private CrimeService crimeService = new CrimeService();
    private VictimService victimService = new VictimService();
    private CriminalService criminalService = new CriminalService();
    private FIRService firService = new FIRService();
    private UserService userService = new UserService();

    public void adminMenu() {
        while (true) {
            System.out.println("\n=== Admin Menu ===");
            System.out.println("1. Manage Crimes");
            System.out.println("2. Manage Victims");
            System.out.println("3. Manage Criminals");
            System.out.println("4. Manage FIRs");
            System.out.println("5. View All Users");
            System.out.println("6. Logout");
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    manageCrimes();
                    break;
                case 2:
                    manageVictims();
                    break;
                case 3:
                    manageCriminals();
                    break;
                case 4:
                    manageFIRs();
                    break;
                case 5:
                    viewAllUsers();
                    break;
                case 6:
                    System.out.println(" Logging out...");
                    return;
                default:
                    System.out.println(" Invalid choice!");
            }
        }
    }

    private void viewAllUsers() {
        System.out.println("\n=== Registered Users ===");
        List<User> users = userService.getAllUsers();
        for (User u : users) {
            System.out.println(u);
        }
    }

    // ----- Manage Crimes -----
    private void manageCrimes() {
        while (true) {
            System.out.println("\n--- Crime Management ---");
            System.out.println("1. Add Crime");
            System.out.println("2. View Crimes");
            System.out.println("3. Delete Crime");
            System.out.println("4. Back");
            System.out.print("Choice: ");
            int c = sc.nextInt();
            sc.nextLine();

            if (c == 1) {
                System.out.print("Crime Type: ");
                String type = sc.nextLine();
                System.out.print("Description: ");
                String desc = sc.nextLine();
                System.out.print("Location: ");
                String loc = sc.nextLine();
                crimeService.addCrime(type, desc, new Date(), loc);
            } else if (c == 2) {
                List<Crime> list = crimeService.getAllCrimes();
                list.forEach(System.out::println);
            } else if (c == 3) {
                System.out.print("Enter Crime ID to delete: ");
                int id = sc.nextInt();
                Crime crime = crimeService.getCrimeById(id);
                if (crime != null) crimeService.deleteCrime(crime);
            } else return;
        }
    }

    // ----- Manage Victims -----
    private void manageVictims() {
        while (true) {
            System.out.println("\n--- Victim Management ---");
            System.out.println("1. Add Victim");
            System.out.println("2. View Victims");
            System.out.println("3. Delete Victim");
            System.out.println("4. Back");
            int c = sc.nextInt(); sc.nextLine();

            if (c == 1) {
                System.out.print("Name: ");
                String name = sc.nextLine();
                System.out.print("Age: ");
                int age = sc.nextInt(); sc.nextLine();
                System.out.print("Gender: ");
                String gender = sc.nextLine();
                System.out.print("Address: ");
                String addr = sc.nextLine();
                victimService.addVictim(name, age, gender, addr);
            } else if (c == 2) {
                victimService.getAllVictims().forEach(System.out::println);
            } else if (c == 3) {
                System.out.print("Victim ID: ");
                int id = sc.nextInt();
                Victim v = victimService.getVictimById(id);
                if (v != null) victimService.deleteVictim(v);
            } else return;
        }
    }

    // ----- Manage Criminals -----
    private void manageCriminals() {
        while (true) {
            System.out.println("\n--- Criminal Management ---");
            System.out.println("1. Add Criminal");
            System.out.println("2. View Criminals");
            System.out.println("3. Delete Criminal");
            System.out.println("4. Back");
            int c = sc.nextInt(); sc.nextLine();

            if (c == 1) {
                System.out.print("Name: ");
                String name = sc.nextLine();
                System.out.print("Age: ");
                int age = sc.nextInt(); sc.nextLine();
                System.out.print("Gender: ");
                String gender = sc.nextLine();
                System.out.print("Address: ");
                String addr = sc.nextLine();
                System.out.print("History: ");
                String hist = sc.nextLine();
                criminalService.addCriminal(name, age, gender, addr, hist);
            } else if (c == 2) {
                criminalService.getAllCriminals().forEach(System.out::println);
            } else if (c == 3) {
                System.out.print("Criminal ID: ");
                int id = sc.nextInt();
                Criminal cr = criminalService.getCriminalById(id);
                if (cr != null) criminalService.deleteCriminal(cr);
            } else return;
        }
    }

    // ----- Manage FIRs -----
    private void manageFIRs() {
        while (true) {
            System.out.println("\n--- FIR Management ---");
            System.out.println("1. File FIR");
            System.out.println("2. View FIRs");
            System.out.println("3. Delete FIR");
            System.out.println("4. Back");
            int c = sc.nextInt(); sc.nextLine();

            if (c == 1) {
                System.out.print("Crime ID: ");
                int cid = sc.nextInt(); sc.nextLine();
                Crime crime = crimeService.getCrimeById(cid);

                System.out.print("Victim ID: ");
                int vid = sc.nextInt(); sc.nextLine();
                Victim victim = victimService.getVictimById(vid);

                System.out.print("Criminal ID: ");
                int crid = sc.nextInt(); sc.nextLine();
                Criminal criminal = criminalService.getCriminalById(crid);

                System.out.print("FIR Details: ");
                String details = sc.nextLine();

                firService.fileFIR(new Date(), details, crime, victim, criminal);
            } else if (c == 2) {
                firService.getAllFIRs().forEach(System.out::println);
            } else if (c == 3) {
                System.out.print("FIR ID: ");
                int id = sc.nextInt();
                FIR f = firService.getFIRById(id);
                if (f != null) firService.deleteFIR(f);
            } else return;
        }
    }
}
