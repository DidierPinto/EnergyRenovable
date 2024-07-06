package com.example.energyrenovable;
import java.util.ArrayList;

public class SunnyPowerTracker {
    private ArrayList<User> users;
    public SunnyPowerTracker() {
        this.users = new ArrayList<User>();
    }
    public void addUser(User user) {
        this.users.add(user);
    }
    public void displayPowerOutput(String username) {
        for(User user : users) {
            if(user.username.equals(username)) {
                System.out.println("Current power output for " + username + ": " +
                        user.getSolarPanelSystem().getCurrentPowerOutput());
                return;
            }
        }
        System.out.println("User not found.");
    }
}

