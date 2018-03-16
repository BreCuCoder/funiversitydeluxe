package be.cuypersserbruyns.funiversity.domain;

public class Course {
    private int id;
    private String name;
    private double studyPoints;
    private String category;
    private Professor professor;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getStudyPoints() {
        return studyPoints;
    }

    public String getCategory() {
        return category;
    }

    public Professor getProfessor() {
        return professor;
    }
}
