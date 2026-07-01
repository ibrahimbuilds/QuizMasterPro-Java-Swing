/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.quiz.logic;

/**
 *
 * @author ibrah
 */
public class Question {

    private int id;
    private String text;
    private String options[];
    private int correctAns;

    public Question(int id, String text, String[] options, int correctAns) {
        this.id = id;
        this.text = text;
        this.options = options;
        this.correctAns = correctAns;
    }

    public boolean checkAnswer(int choice) {
        return choice == correctAns;
    }

    public String getText() {
        return text;
    }

    public String[] getOptions() {
        return options;
    }

}
