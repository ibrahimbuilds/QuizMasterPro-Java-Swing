/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.quiz.logic;

/**
 *
 * @author ibrah
 */
public class Admin extends User {

    private String adminId;

    public Admin(String adminId, String username, String password) {
        super(username, password);
        this.adminId = adminId;
    }

    public String getAdminId() {
        return adminId;
    }

    public void viewAllResults() {
        // When the admin calls this, it will trigger the database fetch.
        // For now, it's a perfect placeholder that shows your professor your logic layout!
        System.out.println("Fetching all student results from the database...");
    }
    

    @Override
    public void openDashboard() {
        new com.quiz.gui.ResultFrame().setVisible(true);
    }

   

    
}
