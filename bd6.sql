#Muestra todos los departamentos junto con los profesores que trabajan en ellos.
select *
from profesor p 
join departamento d on d.codigo = p.id_departamento;


#Muestra los departamentos que no tienen profesores asociados.
select d.*
from departamento d, profesor p 
where d.codigo not in (select id_departamento from profesor) 
group by d.codigo;

#Muestra los departamentos y el número de profesores que trabajan en cada uno de ellos mostrando 0 si no tienen profesores.
select d.*, count(*) nProfesores 
from profesor p 
	right join departamento d on d.codigo = p.id_departamento 
group by d.codigo;


#Muestra todos los departamentos junto con el número de profesones que son de la localidad Salamanca y no ingresaron en 1990.
select d.*, count(*) 
from departamento d 
	left join profesor p on p.id_departamento=d.codigo and p.fecha_ingreso between '1990-01-01' and '1990-12-31' and p.localidad='salamanca' 
group by d.codigo;


#Muestra el código y nombre de departamento junto con el número de veces que está la asignatura “ANALISIS MATEMAT. I” en esos departamentos.
select d.codigo, d.nombre, count(*) 
from departamento d 
	left join asignatura a on a.id_departamento=d.codigo and a.nombre='analisis matemat. I' 
group by d.codigo;


#Muestra el nombre de la asignatura y la carrera que no tiene ningún alumno matriculado.

