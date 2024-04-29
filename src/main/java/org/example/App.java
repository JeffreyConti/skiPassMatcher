package org.example;

import org.example.DAOS.CustomerPassDAO;
import org.example.DAOS.SkiPassDAO;
import org.example.DAOS.SkiResortPassDAO;
import org.example.DAOS.skiResortDAO;
import org.apache.commons.dbcp2.BasicDataSource;
import org.example.models.CustomerPass;
import org.example.models.SkiPass;
import org.example.models.SkiResort;
import org.example.models.SkiResortPass;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;

import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class App {
    private skiResortDAO skiResortDAO;
    private SkiPassDAO SkiPassDAO;
    private CustomerPassDAO CustomerPassDAO;
    private SkiResortPassDAO SkiResortPassDAO;
    private Scanner scanner;
    public static BasicDataSource basicDataSource;

    public static void main(String[] args) {
        App app = new App();
        app.run();
    }

    public void run() {
        basicDataSource = new BasicDataSource();
        basicDataSource.setUrl("jdbc:postgresql://localhost:5432/SkiResort");
        basicDataSource.setUsername("postgres");
        basicDataSource.setPassword("postgres1");

        skiResortDAO = new skiResortDAO(basicDataSource);
        SkiPassDAO = new SkiPassDAO(basicDataSource);
        CustomerPassDAO = new CustomerPassDAO(basicDataSource);
        SkiResortPassDAO = new SkiResortPassDAO(basicDataSource);
        scanner = new Scanner(System.in);

        mainMenu();
    }

    public void mainMenu() {
        while (true) {
            //Opening remarks
            System.out.println("Ski resort view finder. Pick your selection below:");
            System.out.println("1: View all ski resorts"); //need to join with to add SkiPass DAO
            System.out.println("2: View ski resorts by state"); //how could I combine duplicates?
            System.out.println("3: View resorts by region"); //add pass name
            System.out.println("4: View resorts by ski pass"); //need to join tables
            System.out.println("5: Reserve ski pass"); //how do I add customer_pass table?
            System.out.println("6: Update ski pass reservation"); // **later -- need customer_pass table
            //Update or delete reservation
            System.out.println("7: Cancel ski pass"); //** Later -- need customer_pass table
            System.out.println("8: Return to Main Menu"); //how to loop back to main menu?
            //Scanner scanner = new Scanner(System.in);
            String userChoice = scanner.nextLine();

            // #1 All Ski Resorts, State
            if (userChoice.equals("1")) {
                List<SkiResort> resorts = skiResortDAO.getAllSkiResorts();
                for (SkiResort resort : resorts) {
                    System.out.println(resort.getName() + ", " + resort.getState_name());
                }
                System.out.println(" ");
                System.out.println("1: Return to Main Menu");
                String userInput = scanner.nextLine();

                if (userInput.equalsIgnoreCase("1")) {
                    mainMenu();
                } else {
                    break;
                }

            }
            // #2 Ski resort by state
            if (userChoice.equals("2")) {
                System.out.println("Which state are you planning to ski/snowboard for Winter 2024/2025?");
                String userState = scanner.nextLine();

                if (userState.equalsIgnoreCase("Alaska")) {
                    List<SkiResort> resorts = skiResortDAO.getSkiResortsByStateName("Alaska");
                    for (SkiResort resort : resorts) {
                        System.out.println(resort.getName() + ", " + resort.getState_name());
                    }
                    System.out.println(" ");
                    System.out.println("1: Return to Main Menu");
                    String userInput = scanner.nextLine();

                    if (userInput.equalsIgnoreCase("1")) {
                        mainMenu();
                    } else {
                        break;
                    }
                } else if (userState.equalsIgnoreCase("California")) {
                    List<SkiResort> resorts = skiResortDAO.getSkiResortsByStateName("California");
                    for (SkiResort resort : resorts) {
                        System.out.println(resort.getName() + ", " + resort.getState_name());
                    }
                    System.out.println(" ");
                    System.out.println("1: Return to Main Menu");
                    String userInput = scanner.nextLine();

                    if (userInput.equalsIgnoreCase("1")) {
                        mainMenu();
                    } else {
                        break;
                    }
                } else if (userState.equalsIgnoreCase("Colorado")) {
                    List<SkiResort> resorts = skiResortDAO.getSkiResortsByStateName("Colorado");
                    for (SkiResort resort : resorts) {
                        System.out.println(resort.getName() + ", " + resort.getState_name());
                    }
                    System.out.println(" ");
                    System.out.println("1: Return to Main Menu");
                    String userInput = scanner.nextLine();

                    if (userInput.equalsIgnoreCase("1")) {
                        mainMenu();
                    } else {
                        break;
                    }
                } else if (userState.equalsIgnoreCase("Idaho")) {
                    List<SkiResort> resorts = skiResortDAO.getSkiResortsByStateName("Idaho");
                    for (SkiResort resort : resorts) {
                        System.out.println(resort.getName() + ", " + resort.getState_name());
                    }
                    System.out.println(" ");
                    System.out.println("1: Return to Main Menu");
                    String userInput = scanner.nextLine();

                    if (userInput.equalsIgnoreCase("1")) {
                        mainMenu();
                    } else {
                        break;
                    }
                } else if (userState.equalsIgnoreCase("Indiana")) {
                    List<SkiResort> resorts = skiResortDAO.getSkiResortsByStateName("Indiana");
                    for (SkiResort resort : resorts) {
                        System.out.println(resort.getName() + ", " + resort.getState_name());
                    }
                    System.out.println(" ");
                    System.out.println("1: Return to Main Menu");
                    String userInput = scanner.nextLine();

                    if (userInput.equalsIgnoreCase("1")) {
                        mainMenu();
                    } else {
                        break;
                    }
                } else if (userState.equalsIgnoreCase("Maine")) {
                    List<SkiResort> resorts = skiResortDAO.getSkiResortsByStateName("Maine");
                    for (SkiResort resort : resorts) {
                        System.out.println(resort.getName() + ", " + resort.getState_name());
                    }
                    System.out.println(" ");
                    System.out.println("1: Return to Main Menu");
                    String userInput = scanner.nextLine();

                    if (userInput.equalsIgnoreCase("1")) {
                        mainMenu();
                    } else {
                        break;
                    }
                } else if (userState.equalsIgnoreCase("Michigan")) {
                    List<SkiResort> resorts = skiResortDAO.getSkiResortsByStateName("Michigan");
                    for (SkiResort resort : resorts) {
                        System.out.println(resort.getName() + ", " + resort.getState_name());
                    }
                    System.out.println(" ");
                    System.out.println("1: Return to Main Menu");
                    String userInput = scanner.nextLine();

                    if (userInput.equalsIgnoreCase("1")) {
                        mainMenu();
                    } else {
                        break;
                    }
                } else if (userState.equalsIgnoreCase("Minnesota")) {
                    List<SkiResort> resorts = skiResortDAO.getSkiResortsByStateName("Minnesota");
                    for (SkiResort resort : resorts) {
                        System.out.println(resort.getName() + ", " + resort.getState_name());
                    }
                    System.out.println(" ");
                    System.out.println("1: Return to Main Menu");
                    String userInput = scanner.nextLine();

                    if (userInput.equalsIgnoreCase("1")) {
                        mainMenu();
                    } else {
                        break;
                    }
                } else if (userState.equalsIgnoreCase("Missouri")) {
                    List<SkiResort> resorts = skiResortDAO.getSkiResortsByStateName("Missouri");
                    for (SkiResort resort : resorts) {
                        System.out.println(resort.getName() + ", " + resort.getState_name());
                    }
                    System.out.println(" ");
                    System.out.println("1: Return to Main Menu");
                    String userInput = scanner.nextLine();

                    if (userInput.equalsIgnoreCase("1")) {
                        mainMenu();
                    } else {
                        break;
                    }
                } else if (userState.equalsIgnoreCase("Montana")) {
                    List<SkiResort> resorts = skiResortDAO.getSkiResortsByStateName("Montana");
                    for (SkiResort resort : resorts) {
                        System.out.println(resort.getName() + ", " + resort.getState_name());
                    }
                    System.out.println(" ");
                    System.out.println("1: Return to Main Menu");
                    String userInput = scanner.nextLine();

                    if (userInput.equalsIgnoreCase("1")) {
                        mainMenu();
                    } else {
                        break;
                    }
                } else if (userState.equalsIgnoreCase("New Hampshire")) {
                    List<SkiResort> resorts = skiResortDAO.getSkiResortsByStateName("New Hampshire");
                    for (SkiResort resort : resorts) {
                        System.out.println(resort.getName() + ", " + resort.getState_name());
                    }
                    System.out.println(" ");
                    System.out.println("1: Return to Main Menu");
                    String userInput = scanner.nextLine();

                    if (userInput.equalsIgnoreCase("1")) {
                        mainMenu();
                    } else {
                        break;
                    }
                } else if (userState.equalsIgnoreCase("New Mexico")) {
                    List<SkiResort> resorts = skiResortDAO.getSkiResortsByStateName("New Mexico");
                    for (SkiResort resort : resorts) {
                        System.out.println(resort.getName() + ", " + resort.getState_name());
                    }
                    System.out.println(" ");
                    System.out.println("1: Return to Main Menu");
                    String userInput = scanner.nextLine();

                    if (userInput.equalsIgnoreCase("1")) {
                        mainMenu();
                    } else {
                        break;
                    }
                } else if (userState.equalsIgnoreCase("New York")) {
                    List<SkiResort> resorts = skiResortDAO.getSkiResortsByStateName("New York");
                    for (SkiResort resort : resorts) {
                        System.out.println(resort.getName() + ", " + resort.getState_name());
                    }
                    System.out.println(" ");
                    System.out.println("1: Return to Main Menu");
                    String userInput = scanner.nextLine();

                    if (userInput.equalsIgnoreCase("1")) {
                        mainMenu();
                    } else {
                        break;
                    }
                } else if (userState.equalsIgnoreCase("Ohio")) {
                    List<SkiResort> resorts = skiResortDAO.getSkiResortsByStateName("Ohio");
                    for (SkiResort resort : resorts) {
                        System.out.println(resort.getName() + ", " + resort.getState_name());
                    }
                    System.out.println(" ");
                    System.out.println("1: Return to Main Menu");
                    String userInput = scanner.nextLine();

                    if (userInput.equalsIgnoreCase("1")) {
                        mainMenu();
                    } else {
                        break;
                    }
                } else if (userState.equalsIgnoreCase("Oregon")) {
                    List<SkiResort> resorts = skiResortDAO.getSkiResortsByStateName("Oregon");
                    for (SkiResort resort : resorts) {
                        System.out.println(resort.getName() + ", " + resort.getState_name());
                    }
                    System.out.println(" ");
                    System.out.println("1: Return to Main Menu");
                    String userInput = scanner.nextLine();

                    if (userInput.equalsIgnoreCase("1")) {
                        mainMenu();
                    } else {
                        break;
                    }
                } else if (userState.equalsIgnoreCase("Pennsylvania")) {
                    List<SkiResort> resorts = skiResortDAO.getSkiResortsByStateName("Pennsylvania");
                    for (SkiResort resort : resorts) {
                        System.out.println(resort.getName() + ", " + resort.getState_name());
                    }
                    System.out.println(" ");
                    System.out.println("1: Return to Main Menu");
                    String userInput = scanner.nextLine();

                    if (userInput.equalsIgnoreCase("1")) {
                        mainMenu();
                    } else {
                        break;
                    }
                } else if (userState.equalsIgnoreCase("Utah")) {
                    List<SkiResort> resorts = skiResortDAO.getSkiResortsByStateName("Utah");
                    for (SkiResort resort : resorts) {
                        System.out.println(resort.getName() + ", " + resort.getState_name());
                    }
                    System.out.println(" ");
                    System.out.println("1: Return to Main Menu");
                    String userInput = scanner.nextLine();

                    if (userInput.equalsIgnoreCase("1")) {
                        mainMenu();
                    } else {
                        break;
                    }
                } else if (userState.equalsIgnoreCase("Vermont")) {
                    List<SkiResort> resorts = skiResortDAO.getSkiResortsByStateName("Vermont");
                    for (SkiResort resort : resorts) {
                        System.out.println(resort.getName() + ", " + resort.getState_name());
                    }
                    System.out.println(" ");
                    System.out.println("1: Return to Main Menu");
                    String userInput = scanner.nextLine();

                    if (userInput.equalsIgnoreCase("1")) {
                        mainMenu();
                    } else {
                        break;
                    }
                } else if (userState.equalsIgnoreCase("Washington")) {
                    List<SkiResort> resorts = skiResortDAO.getSkiResortsByStateName("Washington");
                    for (SkiResort resort : resorts) {
                        System.out.println(resort.getName() + ", " + resort.getState_name());
                    }
                    System.out.println(" ");
                    System.out.println("1: Return to Main Menu");
                    String userInput = scanner.nextLine();

                    if (userInput.equalsIgnoreCase("1")) {
                        mainMenu();
                    } else {
                        break;
                    }
                } else if (userState.equalsIgnoreCase("Wisconsin")) {
                    List<SkiResort> resorts = skiResortDAO.getSkiResortsByStateName("Wisconsin");
                    for (SkiResort resort : resorts) {
                        System.out.println(resort.getName() + ", " + resort.getState_name());
                    }
                    System.out.println(" ");
                    System.out.println("1: Return to Main Menu");
                    String userInput = scanner.nextLine();

                    if (userInput.equalsIgnoreCase("1")) {
                        mainMenu();
                    } else {
                        break;
                    }
                } else if (userState.equalsIgnoreCase("Wyoming")) {
                    List<SkiResort> resorts = skiResortDAO.getSkiResortsByStateName("Wyoming");
                    for (SkiResort resort : resorts) {
                        System.out.println(resort.getName() + ", " + resort.getState_name());
                    }
                    System.out.println(" ");
                    System.out.println("1: Return to Main Menu");
                    String userInput = scanner.nextLine();

                    if (userInput.equalsIgnoreCase("1")) {
                        mainMenu();
                    } else {
                        break;
                    }
                } else {
                    System.out.println("This state is not on any of our passes.");
                }
                System.out.println(" ");
                System.out.println("1: Return to Main Menu");
                String userInput = scanner.nextLine();

                if (userInput.equalsIgnoreCase("1")) {
                    mainMenu();
                } else {
                    break;
                }
            }
            // #3 Ski resort by Region
            if (userChoice.equals("3")) {
                System.out.println("Which region are you wanting to view?");
                System.out.println(" 1: West \n 2: Rockies \n 3: Pacific Northwest \n 4: Northeast \n 5: MidAtlantic \n 6: Midwest");
                String userRegion = scanner.nextLine();

                if (userRegion.equalsIgnoreCase("West") || (userRegion.equalsIgnoreCase("1"))) {
                    List<SkiResort> resorts = skiResortDAO.getSkiResortByRegion("West");
                    for (SkiResort resort : resorts) {
                        System.out.println(resort.getName() + ", " + resort.getState_name());
                    }
                    System.out.println(" ");
                    System.out.println("1: Return to Main Menu");
                    String userInput = scanner.nextLine();

                    if (userInput.equalsIgnoreCase("1")) {
                        mainMenu();
                    } else {
                        break;
                    }
                } else if (userRegion.equalsIgnoreCase("Rockies") || (userRegion.equalsIgnoreCase("2"))) {
                    List<SkiResort> resorts = skiResortDAO.getSkiResortByRegion("Rockies");
                    for (SkiResort resort : resorts) {
                        System.out.println(resort.getName() + ", " + resort.getState_name());
                    }
                    System.out.println(" ");
                    System.out.println("1: Return to Main Menu");
                    String userInput = scanner.nextLine();

                    if (userInput.equalsIgnoreCase("1")) {
                        mainMenu();
                    } else {
                        break;
                    }
                } else if (userRegion.equalsIgnoreCase("Pacific Northwest") || (userRegion.equalsIgnoreCase("3"))) {
                    List<SkiResort> resorts = skiResortDAO.getSkiResortByRegion("Pacific Northwest");
                    for (SkiResort resort : resorts) {
                        System.out.println(resort.getName() + ", " + resort.getState_name());
                    }
                    System.out.println(" ");
                    System.out.println("1: Return to Main Menu");
                    String userInput = scanner.nextLine();

                    if (userInput.equalsIgnoreCase("1")) {
                        mainMenu();
                    } else {
                        break;
                    }
                } else if (userRegion.equalsIgnoreCase("Northeast") || (userRegion.equalsIgnoreCase("4"))) {
                    List<SkiResort> resorts = skiResortDAO.getSkiResortByRegion("Northeast");
                    for (SkiResort resort : resorts) {
                        System.out.println(resort.getName() + ", " + resort.getState_name());
                    }
                    System.out.println(" ");
                    System.out.println("1: Return to Main Menu");
                    String userInput = scanner.nextLine();

                    if (userInput.equalsIgnoreCase("1")) {
                        mainMenu();
                    } else {
                        break;
                    }
                } else if (userRegion.equalsIgnoreCase("MidAtlantic") || (userRegion.equalsIgnoreCase("5"))) {
                    List<SkiResort> resorts = skiResortDAO.getSkiResortByRegion("MidAtlantic");
                    for (SkiResort resort : resorts) {
                        System.out.println(resort.getName() + ", " + resort.getState_name());
                    }
                    System.out.println(" ");
                    System.out.println("1: Return to Main Menu");
                    String userInput = scanner.nextLine();

                    if (userInput.equalsIgnoreCase("1")) {
                        mainMenu();
                    } else {
                        break;
                    }
                } else if (userRegion.equalsIgnoreCase("Midwest") || (userRegion.equalsIgnoreCase("6"))) {
                    List<SkiResort> resorts = skiResortDAO.getSkiResortByRegion("Midwest");
                    for (SkiResort resort : resorts) {
                        System.out.println(resort.getName() + ", " + resort.getState_name());
                    }
                    System.out.println(" ");
                    System.out.println("1: Return to Main Menu");
                    String userInput = scanner.nextLine();

                    if (userInput.equalsIgnoreCase("1")) {
                        mainMenu();
                    } else {
                        break;
                    }
                } else {
                    System.out.println("There are not any ski resorts in that region - try another region. ");
                }
                break;
            }
            // #4 View ski resort by ski pass
            if (userChoice.equals("4")) {
                System.out.println("View ski resorts by ski pass");
                System.out.println(" 1: EPIC \n 2: IKON \n 3: Mountain Collective");
                String passPickedByUser = scanner.nextLine();

                if (passPickedByUser.equalsIgnoreCase("Epic") || (passPickedByUser.equalsIgnoreCase("1"))) {
                    List<SkiResortPass> pass = SkiResortPassDAO.getSkiResortsByPassName("Epic");
                    for (SkiResortPass passes : pass) {
                        System.out.println(passes.getName() + ", " + passes.getState_name() + " | " + passes.getPass_name());
                    }
                    System.out.println(" ");
                    System.out.println("1: Return to Main Menu");
                    String userInput = scanner.nextLine();

                    if (userInput.equalsIgnoreCase("1")) {
                        mainMenu();
                    }

                } else if (passPickedByUser.equalsIgnoreCase("Ikon") || (passPickedByUser.equalsIgnoreCase("2"))) {
                    List<SkiResortPass> pass = SkiResortPassDAO.getSkiResortsByPassName("Ikon");
                    for (SkiResortPass passes : pass) {
                        System.out.println(passes.getName() + ", " + passes.getState_name() + " | " + passes.getPass_name());
                    }
                    System.out.println(" ");
                    System.out.println("1: Return to Main Menu");
                    String userInput = scanner.nextLine();

                    if (userInput.equalsIgnoreCase("1")) {
                        mainMenu();
                    }
                } else if (passPickedByUser.equalsIgnoreCase("Mountain Collective") || (passPickedByUser.equalsIgnoreCase("3"))) {
                    List<SkiResortPass> pass = SkiResortPassDAO.getSkiResortsByPassName("Mountain Collective");
                    for (SkiResortPass passes : pass) {
                        System.out.println(passes.getName() + ", " + passes.getState_name() + " | " + passes.getPass_name());
                    }
                    System.out.println(" ");
                    System.out.println("1: Return to Main Menu");
                    String userInput = scanner.nextLine();
                    if (userInput.equalsIgnoreCase("1")) {
                        mainMenu();
                    } else {
                        System.out.println("Invalid pass");
                        System.out.println(" ");
                        System.out.println("1: Return to Main Menu");
                        String user = scanner.nextLine();

                        if (user.equalsIgnoreCase("1")) {
                            mainMenu();
                        }
                        break;
                    }
                }
            }
            // #5 Reserve a pass
            if (userChoice.equals("5")) {
                System.out.println("Enter First Name: ");
                String firstName = scanner.nextLine();
                System.out.println("Enter Last Name: ");
                String lastName = scanner.nextLine();
                System.out.println("Enter email address: ");
                String email = scanner.nextLine();
                System.out.println("Enter phone number: ");
                String phoneNumber = scanner.nextLine();
                System.out.println("Which pass would you like to purchase?");
                System.out.println(" 1: EPIC \n 2: IKON \n 3: Mountain Collective");
                String userPass = scanner.nextLine();

                CustomerPass customer = new CustomerPass();
                customer.setFirstName(firstName);
                customer.setLastName(lastName);
                customer.setEmail(email);
                customer.setPhoneNumber(phoneNumber);

                CustomerPass updatedCustomer = CustomerPassDAO.createCustomer(customer);

                if (userPass.equalsIgnoreCase("EPIC") || (userPass.equalsIgnoreCase("1"))) {
                    System.out.println("Thank you " + firstName + " for reserving an EPIC pass. You will receive a confirmation email shortly at " + email + ".");
                    System.out.println("Your confirmation number is " + updatedCustomer.getCustomerPassId() + ".");

                    System.out.println(" ");
                    System.out.println("1: Return to Main Menu");
                    String userInput = scanner.nextLine();

                    if (userInput.equalsIgnoreCase("1")) {
                        mainMenu();
                    }
                } else if (userPass.equalsIgnoreCase("IKON") || (userPass.equalsIgnoreCase("2"))) {
                    System.out.println("Thank you " + firstName + " for reserving an IKON pass. You will receive a confirmation email shortly at " + email + ".");
                    System.out.println("Your confirmation number is " + updatedCustomer.getCustomerPassId() + ".");

                    System.out.println(" ");
                    System.out.println("1: Return to Main Menu");
                    String userInput = scanner.nextLine();

                    if (userInput.equalsIgnoreCase("1")) {
                        mainMenu();
                    }
                } else if (userPass.equalsIgnoreCase("Mountain Collective") || (userPass.equalsIgnoreCase("3"))) {
                    System.out.println("Thank you " + firstName + " for reserving a Mountain Collective pass. You will receive a confirmation email shortly at " + email + ".");
                    System.out.println("Your confirmation number is " + updatedCustomer.getCustomerPassId() + ".");

                    System.out.println(" ");
                    System.out.println("1: Return to Main Menu");
                    String userInput = scanner.nextLine();

                    if (userInput.equalsIgnoreCase("1")) {
                        mainMenu();
                    }
                } else {
                    System.out.println("Invalid ski pass entry.");

                    System.out.println(" ");
                    System.out.println("1: Return to Main Menu");
                    String userInput = scanner.nextLine();

                    if (userInput.equalsIgnoreCase("1")) {
                        mainMenu();
                    }
                    break;
                }
            }
            // #6: Update ski pass reservation -- change name / email / phoneNumber / pass
            if (userChoice.equals("6")) {
                System.out.println("What would you like to update on your pass reservation?");
                System.out.println(" 1: First Name \n 2: Last Name \n 3: Email \n 4: Phone Number \n 5: Type of pass ");
                String passReservation = scanner.nextLine();

                if (passReservation.equalsIgnoreCase("1") || passReservation.equalsIgnoreCase("First name")) {
                    System.out.println("What is your confirmation number?");
                    int confirmationNumber = Integer.parseInt(scanner.nextLine());

                    CustomerPass customer = CustomerPassDAO.getCustomerById(confirmationNumber);
                    CustomerPass updatedCustomer = CustomerPassDAO.updateCustomerPassById(customer);

                    System.out.println("What would you like to update your first name to?");
                    String updatedFirstName = scanner.nextLine();

                    updatedCustomer.setFirstName(updatedFirstName);

                    CustomerPassDAO.updateCustomerPassById(updatedCustomer);

                } else if (passReservation.equalsIgnoreCase("2") || passReservation.equalsIgnoreCase("Last name")) {
                    System.out.println("What is your confirmation number?");
                    int confirmationNumber = Integer.parseInt(scanner.nextLine());

                    CustomerPass customer = CustomerPassDAO.getCustomerById(confirmationNumber);
                    CustomerPass updatedCustomer = CustomerPassDAO.updateCustomerPassById(customer);

                    System.out.println("What would you like to update your last name to?");
                    String updatedLastName = scanner.nextLine();

                    updatedCustomer.setLastName(updatedLastName);

                    CustomerPassDAO.updateCustomerPassById(updatedCustomer);

                } else if (passReservation.equalsIgnoreCase("3") || passReservation.equalsIgnoreCase("Email")) {
                    System.out.println("What is your confirmation number?");
                    int confirmationNumber = Integer.parseInt(scanner.nextLine());

                    CustomerPass customer = CustomerPassDAO.getCustomerById(confirmationNumber);
                    CustomerPass updatedCustomer = CustomerPassDAO.updateCustomerPassById(customer);

                    System.out.println("What would you like to update your email to?");
                    String updatedEmail = scanner.nextLine();

                    updatedCustomer.setEmail(updatedEmail);

                    CustomerPassDAO.updateCustomerPassById(updatedCustomer);

                } else if (passReservation.equalsIgnoreCase("4") || passReservation.equalsIgnoreCase("Phone Number")) {
                    System.out.println("What is your confirmation number?");
                    int confirmationNumber = Integer.parseInt(scanner.nextLine());

                    CustomerPass customer = CustomerPassDAO.getCustomerById(confirmationNumber);
                    CustomerPass updatedCustomer = CustomerPassDAO.updateCustomerPassById(customer);

                    System.out.println("What would you like to update your phone number to?");
                    String updatedPhoneNumber = scanner.nextLine();

                    updatedCustomer.setPhoneNumber(updatedPhoneNumber);

                    CustomerPassDAO.updateCustomerPassById(updatedCustomer);

                } else if (passReservation.equalsIgnoreCase("5") ||
                        passReservation.equalsIgnoreCase("Type of pass") ||
                        passReservation.equalsIgnoreCase("pass")) {

                    System.out.println("What is your confirmation number?");
                    int confirmationNumber = Integer.parseInt(scanner.nextLine());

                    CustomerPass customer = CustomerPassDAO.getCustomerById(confirmationNumber);
                    CustomerPass updatedCustomer = CustomerPassDAO.updateCustomerPassById(customer);

                    System.out.println("What would you like to update your pass to?");
                    System.out.println(" 1:EPIC \n 2:IKON \n 3:Mountain Collective");
                    String updatedPass = scanner.nextLine();

                    if (updatedPass.equalsIgnoreCase("1") || (updatedPass.equalsIgnoreCase("EPIC"))) {
                        updatedCustomer.setPhoneNumber(updatedPass);
                        CustomerPassDAO.updateCustomerPassById(updatedCustomer);
                    } else if (updatedPass.equalsIgnoreCase("2") || (updatedPass.equalsIgnoreCase("Ikon"))) {
                        updatedCustomer.setPhoneNumber(updatedPass);
                        CustomerPassDAO.updateCustomerPassById(updatedCustomer);
                    } else if ((updatedPass.equalsIgnoreCase("3")) || (updatedPass.equalsIgnoreCase("Mountain Collective"))) {
                        updatedCustomer.setPhoneNumber(updatedPass);
                        CustomerPassDAO.updateCustomerPassById(updatedCustomer);
                    } else {
                        System.out.println("Invalid selection.");
                    }
                } else {
                    System.out.println("Invalid number selected.");
                }
                break;
            }
            if (userChoice.equals("7")) {
                System.out.println("What is your confirmation number?");
                int confirmationNumber = Integer.parseInt(scanner.nextLine());

                System.out.println("Please confirm that you would like to proceed with cancelling your ski reservation");
                System.out.println(" 1: Yes, cancel ski reservation \n 2: No, keep ski reservation");
                String usersSelection = scanner.nextLine();
                if (usersSelection.equalsIgnoreCase("1")) {
                    int deletedCustomer = CustomerPassDAO.deleteCustomerPass(confirmationNumber);
                    mainMenu();
                } else {
                    System.out.println("Your reservation is still confirmed");
                    System.out.println(" ");
                    System.out.println("1: Return to Main Menu");
                    String userInput = scanner.nextLine();

                    if (userInput.equalsIgnoreCase("1")) {
                        mainMenu();
                    }
                }
                if (userChoice.equals("8")) {
                    mainMenu();
                }
            }
        }
    }
}


