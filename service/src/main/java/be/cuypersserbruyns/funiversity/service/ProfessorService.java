package be.cuypersserbruyns.funiversity.service;

import be.cuypersserbruyns.funiversity.domain.Professor;

import java.util.Collections;
import java.util.List;

public class ProfessorService {

    private List<Professor> professors;

    public List<Professor> getProfessors() {
        return Collections.unmodifiableList(this.professors);
    }

    public Professor getProfessorById(Integer professorId) {
        return professors.get(professorId);
    }

    public Professor createProfessor(Professor professor) {
        professors.add(professor);
        return professor;
    }

    public void deleteProfessor(Integer professorId) {
        professors.remove(professorId);
    }

    public Professor updateProfessor(Professor professor) {
        professors.set(professor.getId(),professor);
        return professor;
    }
}
