package org.youcode.repository;

import org.youcode.domain.Membre;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;


public interface MembreRepository extends JpaRepository<Membre , UUID> {

}
