package com.pluralsight;

import java.io.BufferedReader;
import java.io.FileReader;
import java.math.BigDecimal;

public class DealershipFileManager {

    public Dealership getDealership() {
        Dealership dealership = null;

        try {
            BufferedReader reader = new BufferedReader(new FileReader(FILE_NAME));

            // Read dealership information
            String dealershipLine = reader.readLine();

            if (dealershipLine != null) {
                String[] dealershipData = dealershipLine.split("\\|");

                dealership = new Dealership(
                        dealershipData[0],
                        dealershipData[1],
                        dealershipData[2]
                );
            }

            String line;

            // Read vehicles
            while ((line = reader.readLine()) != null) {
                String[] vehicleData = line.split("\\|");

                Vehicle vehicle = new Vehicle(
                        Integer.parseInt(vehicleData[0]), // vin
                        Integer.parseInt(vehicleData[1]), // year
                        vehicleData[2],                   // make
                        vehicleData[3],                   // model
                        vehicleData[4],                   // vehicleType
                        vehicleData[5],                   // color
                        Integer.parseInt(vehicleData[6]), // odometer
                        Double.parseDouble(vehicleData[7]), // price
                        vehicleData[8]                    // sold status
                );

                dealership.addVehicle(vehicle);
            }

            reader.close();

        } catch (IOException e) {
            System.out.println("Error reading inventory file.");
            e.printStackTrace();
        }

        return dealership;
    }   // <-- getDealership ends here

    public void saveDealership(Dealership dealership) {
        try {
            // write dealership and vehicles to file
        } catch (IOException e) {
            System.out.println("Error saving dealership file.");
            e.printStackTrace();
        }
    }
}