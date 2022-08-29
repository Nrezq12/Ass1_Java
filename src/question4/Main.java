package question4;

import java.io.IOException;

public class Main {

    // static methods
    public static void sortingAndPrint(Student students[]) { // this method is for sorting and print students data ..
        for (int i = 0; i < students.length; i++) {
            for (int j = i + 1; j < students.length; j++) {
                if (students[i].getGrade() < students[j].getGrade()) { // descending by grade (تنازليا)
                    Student temp;
                    temp = students[i];
                    students[i] = students[j];
                    students[j] = temp;
                }
            }
        }
        // after sorting >> Print Data
        for (Student student : students) {
            student.display(); // for each student
        }
    }

    public static void saveDataToFile(Student students[]) throws IOException {
        for (int i = 0; i < students.length; i++) {
            students[i].saveDataToFile(); // to save details for every student ..
        }
        System.out.println("Data Saved Successfully !");
    }

    public static void calculateGrade(Student students[]) { // this method is to calculate the final grade for every student we have ..
        for (Student student : students) {
            student.calculateGrade();
        }
    }

    public static void main(String[] args) throws IOException {
        // ItStudent Constructor >> id, name,major,mid(100),project(100),finalGrade(100)
        // ArtStudent Constructor >> id, name,major,mid(100),report(100),finalGrade(100)
        Student[] students = { // polymorphism
            new ItStudent(220182145, "noor rezq", "Software Development", 95, 90, 98),
            new ItStudent(8989898, "zaher ahmed", "Software Develnopment", 93, 97, 100),
            new ArtStudent(7877868, "alaa emad", "Painting", 92, 94, 95),
            new ItStudent(678787989, "amal ali", "Software Development", 100, 100, 98),
            new ArtStudent(66676575, "ameera ameera", "Drawing", 90, 99, 98),
        };
        calculateGrade(students);
        sortingAndPrint(students);
        // after calculate the grades and sorting and print we have to save the data (sorted objects by grade ) into the file on the same path of the project ..
        Student.deletePreviousFile();  // (this method is just to avoid repeating saved information in the file when every time we run the programm) , because Students.txt file is the same for all objects :D (At least there is one student)
        saveDataToFile(students); // now save
    }
}
