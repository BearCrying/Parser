package com.line.domain;

public class Hospital {
    private String id;
    private String address;
    private String district;
    private String category;
    private String emergencyRoom;
    private String name;
    private String subdivision;z

    public Hospital(String id, String address, String district, String category, String emergencyRoom,
                    String name, String subdivision) {
        this.id = id;
        this.address = address;
        this.category = category;
        this.emergencyRoom = emergencyRoom;
        this.name = name;
        this.subdivision = subdivision;
        setDistrict();
    }

    public void setDistrict(){
        String[] str = address.split(" ");
        this.district = String.format("%s %s", str[0], str[1]);
    }

    public String getId() {
        return id;
    }

    public String getAddress() {
        return address;
    }

    public String getDistrict() {
        return district;
    }

    public String getCategory() { return category; }

    public String getEmergencyRoom() {
        return emergencyRoom;
    }

    public String getName() {
        return name;
    }

    public String getSubdivision() {
        return subdivision;
    }

    @Override
    public String toString() {
        return "(" + "\"" + id + "\"," + "\"" + address + "\"," + "\"" + district + "\"," + "\"" + category + "\"," +
                "\"" + emergencyRoom + "\"," + "\"" + name + "\"," + "\"" + subdivision + "\"" + ")";
    }
}