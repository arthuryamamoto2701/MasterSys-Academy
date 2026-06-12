package dev.arthurmy.mastersys.dto;

import java.time.LocalDate;
import java.time.LocalDateTime;

import dev.arthurmy.mastersys.domain.Aluno;

public record AlunoResponse(
    Long id,
    String nome,
    LocalDate dataNascimento,
    String sexo,
    String celular,
    String email,
    String cidade,
    String estado,
    LocalDateTime criadoEm
) {
    public static AlunoResponse fromEntity(Aluno aluno){
        return new AlunoResponse(
            aluno.getId(),
            aluno.getNome(),
            aluno.getDataNascimento(),
            aluno.getSexo(),
            aluno.getCelular(),
            aluno.getEmail(),
            aluno.getCidade(),
            aluno.getEstado(),
            aluno.getCriadoEm()
        );
    }
}
