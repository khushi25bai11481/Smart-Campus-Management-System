package service;

import model.Facility;
import java.util.ArrayList;

public class FacilityService {

    private ArrayList<Facility> facilities = new ArrayList<>();

    // Add a new facility
    public void addFacility(Facility facility) {

        for (Facility f : facilities) {

            if (f.getFacilityId() == facility.getFacilityId()) {
                System.out.println("Facility ID already exists.");
                return;
            }
        }

        facilities.add(facility);
        System.out.println("Facility added successfully.");
    }

    // Display all facilities
    public void displayAllFacilities() {

        if (facilities.isEmpty()) {
            System.out.println("No facilities found.");
            return;
        }

        System.out.println("\n===== FACILITY DETAILS =====");

        for (Facility facility : facilities) {
            facility.displayFacility();
        }
    }

    // Search facility by ID
    public void searchFacility(int facilityId) {

        for (Facility facility : facilities) {

            if (facility.getFacilityId() == facilityId) {
                facility.displayFacility();
                return;
            }
        }

        System.out.println("Facility not found.");
    }

    // Update facility status
    public void updateFacilityStatus(int facilityId, String status) {

        for (Facility facility : facilities) {

            if (facility.getFacilityId() == facilityId) {
                facility.updateStatus(status);
                System.out.println("Facility status updated successfully.");
                return;
            }
        }

        System.out.println("Facility not found.");
    }
}