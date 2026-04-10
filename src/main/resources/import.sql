INSERT INTO PROFESSOR (id, nome) VALUES (1, 'João');
INSERT INTO PROFESSOR (id, nome) VALUES (2, 'Maria');

INSERT INTO MATERIA (id, nome, professor_id) VALUES (1, 'Matemática', 1);
INSERT INTO MATERIA (id, nome, professor_id) VALUES (2, 'História', 2);

INSERT INTO ALUNO (id, nome) VALUES (1, 'Carlos');
INSERT INTO ALUNO (id, nome) VALUES (2, 'Ana');

INSERT INTO NOTA (id, valor, aluno_id, materia_id) VALUES (1, 8.0, 1, 1);
INSERT INTO NOTA (id, valor, aluno_id, materia_id) VALUES (2, 7.0, 1, 1);
INSERT INTO NOTA (id, valor, aluno_id, materia_id) VALUES (3, 9.0, 1, 2);
INSERT INTO NOTA (id, valor, aluno_id, materia_id) VALUES (4, 6.0, 2, 1);

-- Professores adicionais
INSERT INTO PROFESSOR (id, nome) VALUES (3, 'Pedro');
INSERT INTO PROFESSOR (id, nome) VALUES (4, 'Luciana');

-- Matérias adicionais
INSERT INTO MATERIA (id, nome, professor_id) VALUES (3, 'Geografia', 3);
INSERT INTO MATERIA (id, nome, professor_id) VALUES (4, 'Física', 1);
INSERT INTO MATERIA (id, nome, professor_id) VALUES (5, 'Química', 4);

-- Alunos adicionais
INSERT INTO ALUNO (id, nome) VALUES (3, 'Bruno');
INSERT INTO ALUNO (id, nome) VALUES (4, 'Juliana');
INSERT INTO ALUNO (id, nome) VALUES (5, 'Marcos');

-- Notas adicionais

-- Carlos (id=1)
INSERT INTO NOTA (id, valor, aluno_id, materia_id) VALUES (5, 7.5, 1, 3);
INSERT INTO NOTA (id, valor, aluno_id, materia_id) VALUES (6, 8.5, 1, 4);

-- Ana (id=2)
INSERT INTO NOTA (id, valor, aluno_id, materia_id) VALUES (7, 6.5, 2, 2);
INSERT INTO NOTA (id, valor, aluno_id, materia_id) VALUES (8, 7.8, 2, 3);

-- Bruno (id=3)
INSERT INTO NOTA (id, valor, aluno_id, materia_id) VALUES (9, 5.0, 3, 1);
INSERT INTO NOTA (id, valor, aluno_id, materia_id) VALUES (10, 6.0, 3, 2);
INSERT INTO NOTA (id, valor, aluno_id, materia_id) VALUES (11, 7.0, 3, 5);

-- Juliana (id=4)
INSERT INTO NOTA (id, valor, aluno_id, materia_id) VALUES (12, 9.5, 4, 1);
INSERT INTO NOTA (id, valor, aluno_id, materia_id) VALUES (13, 8.7, 4, 4);

-- Marcos (id=5)
INSERT INTO NOTA (id, valor, aluno_id, materia_id) VALUES (14, 4.5, 5, 2);
INSERT INTO NOTA (id, valor, aluno_id, materia_id) VALUES (15, 6.2, 5, 3);
INSERT INTO NOTA (id, valor, aluno_id, materia_id) VALUES (16, 7.1, 5, 5);

-- Ana (id=2) -> faltam matérias 4 e 5
INSERT INTO NOTA (id, valor, aluno_id, materia_id) VALUES (17, 8.0, 2, 4);
INSERT INTO NOTA (id, valor, aluno_id, materia_id) VALUES (18, 7.5, 2, 5);

-- Bruno (id=3) -> faltam matérias 3 e 4
INSERT INTO NOTA (id, valor, aluno_id, materia_id) VALUES (19, 6.8, 3, 3);
INSERT INTO NOTA (id, valor, aluno_id, materia_id) VALUES (20, 7.2, 3, 4);

-- Juliana (id=4) -> faltam matérias 2, 3 e 5
INSERT INTO NOTA (id, valor, aluno_id, materia_id) VALUES (21, 8.9, 4, 2);
INSERT INTO NOTA (id, valor, aluno_id, materia_id) VALUES (22, 9.1, 4, 3);
INSERT INTO NOTA (id, valor, aluno_id, materia_id) VALUES (23, 8.3, 4, 5);

-- Marcos (id=5) -> faltam matérias 1 e 4
INSERT INTO NOTA (id, valor, aluno_id, materia_id) VALUES (24, 5.5, 5, 1);
INSERT INTO NOTA (id, valor, aluno_id, materia_id) VALUES (25, 6.7, 5, 4);
INSERT INTO NOTA (id, valor, aluno_id, materia_id) VALUES (26, 8.2, 1, 5);