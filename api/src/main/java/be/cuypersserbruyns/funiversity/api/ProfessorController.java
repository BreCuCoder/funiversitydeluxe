
package be.cuypersserbruyns.funiversity.api;

import be.cuypersserbruyns.funiversity.domain.Professor;
import be.cuypersserbruyns.funiversity.service.ProfessorService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.inject.Inject;
import java.util.List;

@RestController
@RequestMapping(path = "/professors")

public class ProfessorController {

    private ProfessorService professorService;

    @Inject
    public ProfessorController(ProfessorService professorService) {
        this.professorService = professorService;
    }

    @GetMapping(produces = "application/json")
    @ResponseStatus(HttpStatus.OK)
    public List<Professor> getProfessors() {
        return professorService.getProfessors();
    }

    @GetMapping(path = "/{id}", produces = "application/json")
    @ResponseStatus(HttpStatus.OK)
    public Professor getProfessorById(Integer professorId) {
        return professorService.getProfessorById(professorId);
    }

    @PostMapping(consumes = "application/json", produces = "application/json")
    @ResponseStatus(HttpStatus.CREATED)
    public Professor createProfessor(Professor professor) {
        return professorService.createProfessor(professor);
    }

    @DeleteMapping(consumes = "application/json")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteProfessor(Integer professorId) {
        professorService.deleteProfessor(professorId);
    }

    @PutMapping(consumes = "application/json", produces = "application/json")
    @ResponseStatus(HttpStatus.OK)
    public Professor updateProfessor(Professor professor) {
        return professorService.updateProfessor(professor);
    }

    @GetMapping("/{professorId}")
    public ProfessorDto getProfessor( Integer professorId){
        Professor findProfessor = professorService.getProfessorById(professorId);
        return ProfessorDto.toProfessorDto(findProfessor);
    }

}
