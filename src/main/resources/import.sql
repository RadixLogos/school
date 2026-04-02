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