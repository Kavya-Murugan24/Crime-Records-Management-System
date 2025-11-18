package controller;

import model.*;
import service.*;
import java.util.*;

public class OfficerController {

    private Scanner sc = new Scanner(System.in);
    private CrimeService crimeService = new CrimeService();
    private VictimService victimService = new VictimService();
    private CriminalService criminalService = new CriminalService();
    private FIRService firService = new FIRService();

    public void officerMenu() {
        while (true) {
            System.out.println("\n=== Officer Menu ===");
            System.out.println("1. View Crimes");
            System.out.println("2. View Criminals");
            System.out.println("3. View Victims");
            System.out.println("4. File FIR");
            System.out.println("5. View FIRs");
            System.out.println("6. Logout");
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    crimeService.getAllCrimes().forEach(System.out::println);
                    break;
                case 2:
                    criminalService.getAllCriminals().forEach(System.out::println);
                    break;
                case 3:
                    victimService.getAllVictims().forEach(System.out::println);
                    break;
                case 4:
                    fileFIR();
                    break;
                case 5:
                    firService.getAllFIRs().forEach(System.out::println);
                    break;
                case 6:
                    System.out.println(" Logging out...");
                    return;
                default:
                    System.out.println(" Invalid choice!");
            }
        }
    }

    private void fileFIR() {
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
    }
}
