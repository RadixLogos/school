package com.extensionista.school.repositories;

import com.extensionista.school.dtos.SituacaoAlunoDTO;
import com.extensionista.school.entities.Materia;
import com.extensionista.school.entities.Nota;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface NotaRepository extends JpaRepository<Nota, Long> {
    @Query("""
SELECT new com.extensionista.school.dtos.SituacaoAlunoDTO(
    n.materia.nome, AVG(n.valor)
)
FROM Nota n
WHERE n.aluno.id = :alunoId
GROUP BY n.materia.nome
""")
    List<SituacaoAlunoDTO> calcularMediaPorMateria(@Param("alunoId") Long alunoId);

}
