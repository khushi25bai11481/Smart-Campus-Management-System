package service;

import model.Complaint;
import java.util.ArrayList;

public class ComplaintService {

    private ArrayList<Complaint> complaints = new ArrayList<>();

    // Add a new complaint
    public void addComplaint(Complaint complaint) {

        for (Complaint c : complaints) {

            if (c.getComplaintId() == complaint.getComplaintId()) {
                System.out.println("Complaint ID already exists.");
                return;
            }
        }

        complaints.add(complaint);

        System.out.println("Complaint registered successfully.");
    }

    // Display all complaints
    public void displayAllComplaints() {

        if (complaints.isEmpty()) {
            System.out.println("No complaints found.");
            return;
        }

        System.out.println("\n===== ALL COMPLAINTS =====");

        for (Complaint complaint : complaints) {
            complaint.displayComplaint();
        }
    }

    // Search complaint by ID
    public void searchComplaint(int complaintId) {

        for (Complaint complaint : complaints) {

            if (complaint.getComplaintId() == complaintId) {

                System.out.println("\nComplaint found:");
                complaint.displayComplaint();

                return;
            }
        }

        System.out.println("Complaint not found.");
    }

    // Update complaint status
    public void updateComplaintStatus(
            int complaintId, String newStatus) {

        for (Complaint complaint : complaints) {

            if (complaint.getComplaintId() == complaintId) {

                complaint.updateStatus(newStatus);

                System.out.println(
                    "Complaint status updated successfully."
                );

                return;
            }
        }

        System.out.println("Complaint not found.");
    }
}