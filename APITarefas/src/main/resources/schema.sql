DROP TABLE IF EXISTS TB_Tarefas;

CREATE TABLE TB_Tarefas (
id_tarefa INTEGER PRIMARY KEY,
nome_tarefa VARCHAR(255) NOT NULL,
descricao_tarefa VARCHAR(255) NOT NULL,
nome_usuario_tarefa VARCHAR(255) NOT NULL,
prioridade_tarefa VARCHAR(255) NOT NULL
)