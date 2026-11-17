package com.pluralsight;

import java.io.BufferedReader;
import java.io.FileReader;
import java.math.BigDecimal;

public class DealershipFileManager {

    public Dealership getDealership() {
        Dealership dealership = null;


        try {
        BufferedReader reader =
                new BufferedReader(new FileReader(FILE_NAME));

        // Read dealership information
        String dealershipLine = reader.readLine();

        if (dealershipLine != null) {
            String[] dealershipData = dealershipLine.split("\\|");

            dealership = new Dealership(
                    dealershipData[0],
                    dealershipData[1],
                    dealershipData[2]
            );

            // Read vehicles
            String line;
            while ((line = reader.readLine()) != null) {

                String[] vehicleData = line.split("\\|");

                Vehicle vehicle = new Vehicle(
                        Integer.parseInt(vehicleData[0]),
                        Integer.parseInt(vehicleData[1]),
                        vehicleData[2],
                        vehicleData[3],
                        vehicleData[4],
                        vehicleData[5],
                        Integer.parseInt(vehicleData[6]),
                        Double.parseDouble(vehicleData[7])
                );

                dealership.addVehicle(vehicle);
            }
        }

        reader.close();

    } catch (IOException e) {
        e.printStackTrace();
    }

    return dealership;
}

                // Read vehicles
                while ((line = reader.readLine()) != null) {

        String[] vehicleData = line.split("\\|");

        if (vehicleData.length < 8) {
            continue;
        }

        int vin = Integer.parseInt(vehicleData[0]);
        int year = Integer.parseInt(vehicleData[1]);
        String make = vehicleData[2];
        String model = vehicleData[3];
        String vehicleType = vehicleData[4];
        String color = vehicleData[5];
        int odometer = Integer.parseInt(vehicleData[6]);
        BigDecimal price = new BigDecimal(vehicleData[7]);

        Vehicle vehicle = new Vehicle(
                vin,
                year,
                make,
                model,
                vehicleType,
                color,
                odometer,
                price
        );

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

        try {

            BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_NAME));

            // Write dealership information
            writer.write(

                        dealership.getName() + "|" +

                            dealership.getAddress() + "|" +

                            dealership.getPhone()

            );

            writer.newLine();

            // Write vehicles
            for (Vehicle vehicle : dealership.getAllVehicles()) {

                writer.write(

                            vehicle.getVin() + "|" +

                                vehicle.getYear() + "|" +

                                vehicle.getMake() + "|" +

                                vehicle.getModel() + "|" +

                                vehicle.getVehicleType() + "|" +

                                vehicle.getColor() + "|" +

                                vehicle.getOdometer() + "|" +

                                vehicle.getPrice()

                );

                writer.newLine();

            }

            writer.close();

            System.out.println("Inventory saved successfully!");

        } catch (IOException e) {

            System.out.println("Error saving inventory file.");

            e.printStackTrace();
        }
    }
}
