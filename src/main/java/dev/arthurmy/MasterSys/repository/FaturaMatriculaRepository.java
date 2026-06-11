package dev.arthurmy.mastersys.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import dev.arthurmy.mastersys.domain.FaturaMatricula;

public interface FaturaMatriculaRepository extends JpaRepository<FaturaMatricula, Long> {
    
}
