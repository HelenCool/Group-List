package com.example.helencool.grouplist.Entities;



public class Student {
    private String name;
    private String git;
    private String googlePlus;


    public Student(String name, String git, String googlePlus) {
        this.name = name;
        this.git = git;
        this.googlePlus = googlePlus;
    }

    public String getName() {
        return name;
    }

    public String getGit() {
        return git;
    }

    public String getGooglePlus() {
        return googlePlus;
    }
}
