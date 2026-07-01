/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.quiz.logic;

/**
 *
 * @author ibrah
 */
public class Student extends User {

    private int score;
    private String rollno;

    public Student(String rollno, String username, String password) {
        super(username, password);
        this.rollno = rollno;
    }

    public String getRollno() {
        return rollno;
    }

    public void setScore(int score) {
        this.score = score;
    }

   public void openDashboard(){
       UserSession session = new UserSession(this.getUsername(), this.rollno);
        
        // This will launch your Quiz Frame and hand over the session tracking
        new com.quiz.gui.QuizFrame(session).setVisible(true);
   }

}
