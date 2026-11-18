package com.pluralsight;

import java.util.ArrayList;
import java.util.List;
import java.math.BigDecimal;

public class Dealership {
    private String name;
    private String address;
    private String phone;
    private ArrayList<Vehicle> inventory;

    public Dealership(String name, String address, String phone) {
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.inventory = new ArrayList<>();
    }

    // Getters
    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getPhone() {
        return phone;
    }

    public ArrayList<Vehicle> getAllVehicles() {
        return inventory;
    }

    // Add Vehicle
    public void addVehicle(Vehicle vehicle) {
        inventory.add(vehicle);
    }

    // Remove Vehicle
    public void removeVehicle(Vehicle vehicle) {
        inventory.remove(vehicle);
    }

    // Search by Price
    public List<Vehicle> getVehiclesByPrice(double min, double max) {

        List<Vehicle> matchingVehicles = new ArrayList<>();

        for (Vehicle vehicle : inventory) {

            double price = vehicle.getPrice().doubleValue();

            if (price >= min && price <= max) {
                matchingVehicles.add(vehicle);
            }
        }

        return matchingVehicles;
    }

    // Search by Make and Model
    public List<Vehicle> getVehiclesByMakeModel(String make, String model) {

        List<Vehicle> matchingVehicles = new ArrayList<>();

        for (Vehicle vehicle : inventory) {

            if (vehicle.getMake().equalsIgnoreCase(make)
                    && vehicle.getModel().equalsIgnoreCase(model)) {

                matchingVehicles.add(vehicle);
            }
        }

        return matchingVehicles;
    }

    // Search by Year
    public List<Vehicle> getVehiclesByYear(int min, int max) {
        List<Vehicle> matchingVehicles = new ArrayList<>();

        for (Vehicle vehicle : inventory) {
            if (vehicle.getYear() >= min && vehicle.getYear() <= max) {
                matchingVehicles.add(vehicle);
            }
        }

        return matchingVehicles;
    }

    // Search by Color
    public List<Vehicle> getVehiclesByColor(String color) {
        List<Vehicle> matchingVehicles = new ArrayList<>();

        for (Vehicle vehicle : inventory) {
            if (vehicle.getColor().equalsIgnoreCase(color)) {
                matchingVehicles.add(vehicle);
            }
        }

        return matchingVehicles;
    }

    // Search by Mileage
    public List<Vehicle> getVehiclesByMileage(int min, int max) {
        List<Vehicle> matchingVehicles = new ArrayList<>();

        for (Vehicle vehicle : inventory) {
            if (vehicle.getOdometer() >= min &&
                    vehicle.getOdometer() <= max) {
                matchingVehicles.add(vehicle);
            }
        }

        return matchingVehicles;
    }

    // Search by Vehicle Type
    public List<Vehicle> getVehiclesByType(String vehicleType) {
        List<Vehicle> matchingVehicles = new ArrayList<>();

        for (Vehicle vehicle : inventory) {
            if (vehicle.getMake().equalsIgnoreCase(vehicleType)) {
                matchingVehicles.add(vehicle);
            }
        }

        return matchingVehicles;
    }
}