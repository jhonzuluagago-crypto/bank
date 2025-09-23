package com.appbank.bank.model;

public class Customer {
 
    private String id;
    private String name;
    private string email;

    public Customer() {
    }


    public Customer(String id, String name, string email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public string getEmail() {
        return email;
    }
    public void setEmail(string email) {
        this.email = email;
    }

}
