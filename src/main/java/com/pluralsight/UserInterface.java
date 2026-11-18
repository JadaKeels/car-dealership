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

        private void processGetAllVehiclesRequest() {

            List<Vehicle> vehicles =
                    dealership.getAllVehicles();

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

