package com.extensionista.school.repositories;

import com.extensionista.school.entities.Materia;
import com.extensionista.school.entities.Professor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MateriaRepository extends JpaRepository<Materia, Long> {}
