package question4;

import java.io.File;
import java.io.IOException;

public abstract class Student {

    // Hidden Attributes
    private int id;
    private String name;
    private String major;
    private double grade;

    public Student() {
        // no argument Constructor
    }

    public Student(int id, String name, String major) {
        this.id = id;
        this.name = name;
        this.major = major;
    }

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

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    public abstract void calculateGrade();

    public void display() {
        System.out.println("ID : " + this.id
                + "\nName : " + this.name
                + "\nMajor : " + this.major
                + "\nGrade : " + this.grade
                + "\n-----------------------");
    }

    // this method is just to update (to avoid Repeating information)
    public static void deletePreviousFile() { // this method is to Update Data on The File Which We Have To Update The Data on it Every time a new Product is added or deleted , and this is By deleted the previous txt file .
        String workingDirectory = System.getProperty("user.dir"); // Save The txt File on Path Of Project
        File file = new File(workingDirectory + "\\Students.txt");
        if (file.exists()) {
            file.delete();
        }
    }

    public abstract void saveDataToFile() throws IOException;
}
