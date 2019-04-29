package com.example.demo.entity;

import java.sql.Timestamp;

public class FeedBack {
    private int id;
    private String name;
    private String value;
    private String questman;
    private String answerman;
    private String answer;
    private Timestamp answertime;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getQuestman() {
        return questman;
    }

    public void setQuestman(String questman) {
        this.questman = questman;
    }

    public String getAnswerman() {
        return answerman;
    }

    public void setAnswerman(String answerman) {
        this.answerman = answerman;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public Timestamp getAnswertime() {
        return answertime;
    }

    public void setAnswertime(Timestamp answertime) {
        this.answertime = answertime;
    }


}
