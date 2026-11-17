package com.pluralsight;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.math.BigDecimal

public class DealershipFileManager {

    public Dealership getDealership() {
        return null;

        try {
            BufferedReader reader = new BufferedReader(new FileReader("inventory.csv"));

            String dealershipLine = reader.readLine();

            String[] dealershipData = dealershipLine.split("\\|");

            String name = dealershipData[0];

            String address = dealershipData[1];

            String phone = dealershipData[2];

            dealership = new Dealership(name, address, phone);

            String line;

            while ((line = reader.readLine()) != null) {

                String[] vehicleData = line.split("\\|");

                int vin = Integer.parseInt(vehicleData[1]);

                String make = vehicleData[2];

                String model = vehicleData[3];

                String vehicleType = vehicleData[4];

                String color = vehicleType[5];

                int odometer = Integer.parseInt(vehicleData[6]);

                BigDecimal price = new BigDecimal(vehicleData[7]);

                Vehicle vehicle = new Vehicle(vin, year, make, model, vehicleType, color, odometer, price);

                dealership.addVehicle(vehicle);
            }

            reader.close();

        } catch (IOException e) {

            System.out.println("Error reading inventory file.");

            e.printStackTrace();
        }

        return dealership;
    }

    public void saveDealership(Dealership dealership) {
    }
}
