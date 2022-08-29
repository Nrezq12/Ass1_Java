package question4;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class ItStudent extends Student {

    private double mid;
    private double project;
    private double finalGrade;

    public ItStudent(int id, String name, String major, double mid, double project, double finalGrade) {
        super(id, name, major);
        this.mid = mid;
        this.project = project;
        this.finalGrade = finalGrade;
    }

    @Override
    public void calculateGrade() {
        this.setGrade((this.mid * 0.30) + (this.project * 0.30) + (this.finalGrade * 0.40));
    }

    @Override
    public void display() {
        System.out.println("IT Student : \n"
                + "ID : " + super.getId()
                + "\nName : " + super.getName()
                + "\nMajor : " + super.getMajor()
                + "\nGrade : " + super.getGrade()
                + "\n-----------------------");
    }

    @Override
    public void saveDataToFile() throws IOException {
        String workingDirectory = System.getProperty("user.dir"); // Save The txt File on Path Of Project
        File file = new File(workingDirectory + "\\Students.txt");

        FileWriter fr = new FileWriter(file, true); // append
        PrintWriter pw = new PrintWriter(fr);

        pw.print("\nIT Student >> ");
        pw.print("ID : " + super.getId() + ",");
        pw.print(" Name : " + super.getName() + ",");
        pw.print(" Major : " + super.getMajor() + ",");
        pw.print(" Grade : " + super.getGrade() + "\n");
        pw.close();
        fr.close();
    }
}
