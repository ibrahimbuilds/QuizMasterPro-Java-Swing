/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.quiz.main;
import com.quiz.database.DataBaseHandler;
import com.quiz.gui.MainPortalFrame;
/**
 *
 * @author ibrah
 */    

public class Main {
    public static void main(String[] args) {
        // 1. Establish the database connection immediately at startup
        DataBaseHandler.connect(); 

        // 2. Open up your clean, visual Main Portal window
        java.awt.EventQueue.invokeLater(() -> {
            new MainPortalFrame().setVisible(true); 
        });
    }
}

    

