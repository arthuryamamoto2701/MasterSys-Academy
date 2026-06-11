package dev.arthurmy.mastersys.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import dev.arthurmy.mastersys.domain.Graduacao;

public interface GraduacaoRepository extends JpaRepository<Graduacao, Long> {
    
}
