package be.cuypersserbruyns.funiversity.api;

import be.cuypersserbruyns.funiversity.domain.Professor;

public class ProfessorDto {
    private int id;
    private String firstName;
    private String lastName;

    public ProfessorDto(int id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    static ProfessorDto toProfessorDto(Professor professor){
        return new ProfessorDto(
                professor.getId(),
                professor.getFirstName(),
                professor.getLastName());

    }

    public int getId() {
        return id;
    }
}
