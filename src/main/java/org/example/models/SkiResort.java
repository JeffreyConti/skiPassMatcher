package org.example.models;

public class SkiResort {
    private int ski_resort_id;
    private String name;
    private String state_name;
    private String region;

    public SkiResort() {
    }

    public SkiResort(int ski_resort_id, String name, String state_name, String region) {
        this.ski_resort_id = ski_resort_id;
        this.name = name;
        this.state_name = state_name;
        this.region = region;
    }

    public int getSki_resort_id() {
        return ski_resort_id;
    }

    public void setSki_resort_id(int ski_resort_id) {
        this.ski_resort_id = ski_resort_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getState_name() {
        return state_name;
    }

    public void setState_name(String state_name) {
        this.state_name = state_name;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }
}
