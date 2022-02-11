Create database  if not exists  db_escola;

use db_escola;

drop table tb_estudantes;

Create table tb_estudantes(
id int(20) auto_increment,
nome varchar(60) not null,
idade int(2) not null,
sexo char(1),
curso varchar(60),
nota float(2.2),

primary key(id)
); 						/*Executar dps do ponto e virgula faz com que ele execute de 
							tras para frente ate encontrar o ultimo ponto virgula*/
insert into tb_estudantes (nome, idade, sexo, curso, nota) values ("Carlos Alberto", 40, "M", "Jornalismo", 04.00); /*Só alterar os dados correspondentes*/

select * from tb_estudantes;

select nome, nota from tb_estudantes where nota > 07.00 order by nota desc;

select nome, nota from tb_estudantes where nota < 07.00 order by nota desc;

UPDATE tb_estudantes SET nome =  "Eduardo" WHERE id=1 		/*Muda o nome ou outro atributo*/
