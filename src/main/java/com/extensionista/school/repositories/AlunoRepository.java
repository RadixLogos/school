package com.extensionista.school.repositories;

import com.extensionista.school.entities.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface AlunoRepository extends JpaRepository<Aluno, Long> {
    @Query(value = "SELECT * FROM aluno a WHERE a.user_id = :id " , nativeQuery = true)
    Aluno findByUser(Long id);
}

