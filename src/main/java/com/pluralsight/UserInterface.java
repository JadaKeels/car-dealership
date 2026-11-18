package com.pluralsight;

import java.util.List;
import java.util.Scanner;

public class UserInterface {

    private Dealership dealership;
    private Scanner scanner;

    public UserInterface() {
        scanner = new Scanner(System.in);
    }

private void init() {
    DealershipFileManager fileManager =
            new DealershipFileManager();

    dealership = fileManager.getDealership();
}

    private void displayVehicles(List<Vehicle> vehicles) {

        if (vehicles.isEmpty()) {
            System.out.println("No vehicles found.");
            return;
        }

        for (Vehicle vehicle : vehicles) {
            System.out.println(vehicle);
        }
    }

    private void processSearchByPriceRequest() {
        System.out.println("Searching...");
    }

    private void processGetAllVehiclesRequest() {
        List<Vehicle> vehicles = dealership.getAllVehicles();
        displayVehicles(vehicles);
    }

    private void processGetByPriceRequest() {

    }

    private void processGetByMakeModelRequest() {

    }

    private void processGetByYearRequest() {

    }

    private void processGetByColorRequest() {

    }

    private void processGetByMileageRequest() {

    }

    private void processGetByVehicleTypeRequest() {

    }

    private void processAddVehicleRequest() {

    }

    private void processRemoveVehicleRequest() {

    }

    public void display () {

            init();

            int choice;

            do {

                System.out.println();
                System.out.println("========== Car Dealership ==========");
                System.out.println("1 - Find vehicles by price");
                System.out.println("2 - Find vehicles by make/model");
                System.out.println("3 - Find vehicles by year");
                System.out.println("4 - Find vehicles by color");
                System.out.println("5 - Find vehicles by mileage");
                System.out.println("6 - Find vehicles by vehicle type");
                System.out.println("7 - List ALL vehicles");
                System.out.println("8 - Add a vehicle");
                System.out.println("9 - Remove a vehicle");
                System.out.println("99 - Quit");
                System.out.print("Enter choice: ");

                choice = scanner.nextInt();
                scanner.nextLine();

                switch (choice) {

                    case 1:
                        processGetByPriceRequest();
                        break;

                    case 2:
                        processGetByMakeModelRequest();
                        break;

                    case 3:
                        processGetByYearRequest();
                        break;

                    case 4:
                        processGetByColorRequest();
                        break;

                    case 5:
                        processGetByMileageRequest();
                        break;

                    case 6:
                        processGetByVehicleTypeRequest();
                        break;

                    case 7:
                        processGetAllVehiclesRequest();
                        break;

                    case 8:
                        processAddVehicleRequest();
                        break;

                    case 9:
                        processRemoveVehicleRequest();
                        break;

                    case 99:
                        System.out.println("Goodbye!");
                        break;

                    default:
                        System.out.println("Invalid selection.");
                }

            } while (choice != 99);
        }
    }



