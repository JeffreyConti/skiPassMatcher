package org.example.models;

public class CustomerPass {
    private int customerPassId;
    private String firstName;
    private String lastName;
    private String email;
    private String phoneNumber;

    public CustomerPass() {
    }

    public CustomerPass(int customerPassId, String firstName, String lastName, String email, String phoneNumber) {
        this.customerPassId = customerPassId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public int getCustomerPassId() {
        return customerPassId;
    }

    public void setCustomerPassId(int customerPassId) {
        this.customerPassId = customerPassId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
