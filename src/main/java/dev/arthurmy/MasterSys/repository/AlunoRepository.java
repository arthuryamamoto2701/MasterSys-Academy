package dev.arthurmy.mastersys.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import dev.arthurmy.mastersys.domain.Aluno;

public interface AlunoRepository extends JpaRepository<Aluno, Long> {
    
}
