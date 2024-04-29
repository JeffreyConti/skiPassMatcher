package org.example.models;

public class SkiResortPass {
    private int pass_id;
    private String pass_name;
    private int ski_resort_id;
    private String name;
    private String state_name;
    private String region;

    public SkiResortPass() {
    }

    public SkiResortPass(int pass_id, String pass_name, int ski_resort_id, String name, String state_name, String region) {
        this.pass_id = pass_id;
        this.pass_name = pass_name;
        this.ski_resort_id = ski_resort_id;
        this.name = name;
        this.state_name = state_name;
        this.region = region;
    }

    public int getPass_id() {
        return pass_id;
    }

    public void setPass_id(int pass_id) {
        this.pass_id = pass_id;
    }

    public String getPass_name() {
        return pass_name;
    }

    public void setPass_name(String pass_name) {
        this.pass_name = pass_name;
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
