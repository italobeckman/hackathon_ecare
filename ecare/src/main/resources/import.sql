insert into Adm (id, nome, crm_coren, especialidade) values (1, 'admin', '123456', 'jurandir');

insert into Exame (id, descricao, data, exameRealizado) values 
(1, 'Exame de sangue', '2021-10-10', true),
(2, 'Exame de urina', '2021-10-10', true),
(3, 'Exame de fezes', '2021-10-10', true);

insert into Gestante (cpf, nome, dataNascimento, dataprevistaparto)
values ('12345678901', 'Maria', '2021-10-10', '2021-10-10');

insert into Consulta (data, descricao) values 
('2021-10-10', 'Consulta de rotina'),
('2021-11-10', 'Consulta de rotina'),
('2021-12-10', 'Consulta de rotina');

insert into Vacina (descricao, data, statusrealizada) values 
('Vacina de gripe', '2021-10-10', true),
('Vacina de febre amarela', '2021-10-10', false),
('Vacina de covid', '2021-10-10', true);
