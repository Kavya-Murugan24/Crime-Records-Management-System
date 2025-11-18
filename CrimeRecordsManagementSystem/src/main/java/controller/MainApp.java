package controller;

import model.User;
import service.UserService;
import java.util.Scanner;
//import service.*;
//import java.util.Date;

public class MainApp {

    private static Scanner sc = new Scanner(System.in);
    private static UserService userService = new UserService();

    public static void main(String[] args) {
        System.out.println("=== Crime Records Management System ===");
     // === Temporary Sample Data ===
//            CrimeService cs = new CrimeService();
//            VictimService vs = new VictimService();
//            CriminalService crs = new CriminalService();
//            //FIRService fs = new FIRService();
//            UserService us = new UserService();
            
         // Admin and Officer
//            us.registerUser("admin", "admin123", "ADMIN");
//            us.registerUser("officer1", "officer123", "OFFICER");
//
//
//            // Check if already inserted (avoid duplicates)
//            if (cs.getAllCrimes().isEmpty()) {
//                cs.addCrime("Theft", "Mobile phone stolen near market", new Date(), "Chennai");
//                cs.addCrime("Assault", "Fight in public place", new Date(), "Madurai");
//                cs.addCrime("Fraud", "Online money scam", new Date(), "Coimbatore");
//
//                vs.addVictim("Ravi Kumar", 30, "Male", "Chennai");
//                vs.addVictim("Lakshmi Devi", 45, "Female", "Madurai");
//                vs.addVictim("Suresh Babu", 28, "Male", "Coimbatore");
//
//                crs.addCriminal("Arun Raj", 35, "Male", "Salem", "Theft record 2023");
//                crs.addCriminal("Mohan Lal", 40, "Male", "Madurai", "Assault case 2022");
//                crs.addCriminal("Karthika", 32, "Female", "Coimbatore", "Fraud case 2024");
//
//
//                System.out.println(" Sample data inserted successfully.");
//            }
            // === End of sample data ===


        while (true) {
            System.out.println("\n1. Login");
            System.out.println("2. Register Admin");
            System.out.println("3. Exit");
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                	 registerAdmin();
                    break;
                case 2:
                	 loginUser();
                    break;
                case 3:
                    System.out.println(" Exiting System...");
                    System.exit(0);
                default:
                    System.out.println(" Invalid choice!");
            }
        }
    }

    private static void loginUser() {
        System.out.print("Username: ");
        String username = sc.nextLine();
        System.out.print("Password: ");
        String password = sc.nextLine();
       

        User user = userService.login(username, password);
        if (user != null) {
            if (user.getRole().equalsIgnoreCase("ADMIN")) {
                new AdminController().adminMenu();
            } else if (user.getRole().equalsIgnoreCase("OFFICER")) {
                new OfficerController().officerMenu();
            }
        }
    }

    private static void registerAdmin() {
        System.out.print("Enter Admin Username: ");
        String username = sc.nextLine();
        System.out.print("Enter Password: ");
        String password = sc.nextLine();
        System.out.print("Enter Role: ");
        String role = sc.nextLine();
        
        userService.registerUser(username, password, role);
    }
}
