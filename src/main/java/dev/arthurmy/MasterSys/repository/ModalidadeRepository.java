package dev.arthurmy.mastersys.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import dev.arthurmy.mastersys.domain.Modalidade;

public interface ModalidadeRepository extends JpaRepository<Modalidade, Long> {
    
}
