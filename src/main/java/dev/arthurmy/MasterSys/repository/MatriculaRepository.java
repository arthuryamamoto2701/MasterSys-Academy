package dev.arthurmy.mastersys.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import dev.arthurmy.mastersys.domain.Matricula;

public interface MatriculaRepository extends JpaRepository<Matricula, Long> {
    
}
