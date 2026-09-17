package model;

public class Facility {

    private int facilityId;
    private String facilityName;
    private String location;
    private String status;

    public Facility(int facilityId, String facilityName,
                    String location, String status) {

        this.facilityId = facilityId;
        this.facilityName = facilityName;
        this.location = location;
        this.status = status;
    }

    public int getFacilityId() {
        return facilityId;
    }

    public String getFacilityName() {
        return facilityName;
    }

    public String getLocation() {
        return location;
    }

    public String getStatus() {
        return status;
    }

    public void updateStatus(String status) {
        this.status = status;
    }

    public void displayFacility() {

        System.out.println("-----------------------------------");
        System.out.println("Facility ID   : " + facilityId);
        System.out.println("Facility Name : " + facilityName);
        System.out.println("Location      : " + location);
        System.out.println("Status        : " + status);
        System.out.println("-----------------------------------");
    }
}