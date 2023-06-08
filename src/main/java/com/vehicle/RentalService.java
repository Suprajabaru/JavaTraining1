package com.vehicle;

import java.math.BigDecimal;
import java.time.Duration;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public  class RentalService implements Rentalcostcal {
	
	    private List<Vehicle> vehicles;
	    private List<Rental> rentals;

	 
	    public List<Vehicle> getAvailableVehicles() {
			List<Vehicle> availableVehicles = new ArrayList<>();
			for (Vehicle vehicle : vehicles) {
				if (vehicle.isAvailable()) {
					availableVehicles.add(vehicle);
				}
			}
			return availableVehicles;
		}

		public Rental rentVehicle(Customer customer, Vehicle vehicle, LocalDateTime startTime, LocalDateTime endTime) {
			if (vehicle.isAvailable()) {
				Rental rental = new Rental(vehicle, customer, startTime, endTime);
				rentals.add(rental);
				vehicle.setAvailable(false);
				return rental;
			} else {
				return null;
			}
		}

		@Override
		public BigDecimal calculateRentalCost(Rental rental) {
			Duration duration = Duration.between(rental.getStartTime(), rental.getEndTime());
			long hours = duration.toHours();
			BigDecimal hourlyRate = BigDecimal.valueOf(10);
			return hourlyRate.multiply(BigDecimal.valueOf(hours));
		}

		public RentalService() {
			vehicles = new ArrayList<>();
			rentals = new ArrayList<>();
		}

		public void addVehicle(Vehicle vehicle) {
			vehicles.add(vehicle);
		}

		public void removeVehicle(Vehicle vehicle) {
			vehicles.remove(vehicle);
		}

		

		public Rental getRentalById(String rentalId) {
			for (Rental rental : rentals) {
				if (rental.getId().equals(rentalId)) {
					return rental;
				}
			}
			return null;
		}

		public boolean returnVehicle(Rental rental) {
			if (rentals.contains(rental)) {
				rentals.remove(rental);
				rental.getRentedVehicle().setAvailable(true);
				return true;
			} else {
				return false;
			}
		}

	    

	
	    public  BigDecimal calculateRentalCost1(Rental rental) {
			return null;
	        
	    }

	 
	    

		public Vehicle getVehicleByLicensePlate(String licensePlate) {
			// TODO Auto-generated method stub
			for (Vehicle vehicle : vehicles) {
				if (vehicle.getLicensePlate().equals(licensePlate)) {
					return vehicle;
				}
			}
			return null;
		}
	}

