package com.extensionista.school.repositories;

import com.extensionista.school.entities.Aluno;
import com.extensionista.school.entities.Professor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProfessorRepository extends JpaRepository<Professor, Long> {}
