package dev.arthurmy.mastersys.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import dev.arthurmy.mastersys.domain.Plano;

public interface PlanoRepository extends JpaRepository<Plano, Long> {
    
}
