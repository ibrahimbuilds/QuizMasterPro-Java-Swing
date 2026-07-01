/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.quiz.logic;

/**
 *
 * @author ibrah
 */
public class UserSession {

    private String name;
    private String rollNo;
    private int score;
    private int currentQuestionIndex; // Architect's tip: helps track progress

    // Constructor to initialize the session
    public UserSession(String name, String rollNo) {
        this.name = name;
        this.rollNo = rollNo;
        this.score = 0;
        this.currentQuestionIndex = 0;
    }

    // Operation: + addScore()
    public void addScore() {
        this.score++;
    }

    // Operation: + getFinalResult()
    public String getFinalResult() {
        return "Student: " + name + " (Roll No: " + rollNo + ")\n"
                + "Final Score: " + score;
    }

    // Getters and Setters (Use Alt+Insert in NetBeans to generate these)
    public int getScore() {
        return score;
    }

    public String getName() {
        return name;
    }

    public String getRollNo() {
        return rollNo;
    }

    public int getCurrentQuestionIndex() {
        return currentQuestionIndex;
    }

    public void nextQuestion() {
        this.currentQuestionIndex++;
    }
}
