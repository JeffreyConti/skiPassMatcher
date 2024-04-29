package org.example.models;

public class SkiPass {

    private int pass_id;
    private String pass_name;

    public SkiPass() {
    }

    public SkiPass(int pass_id, String pass_name) {
        this.pass_id = pass_id;
        this.pass_name = pass_name;
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
}
