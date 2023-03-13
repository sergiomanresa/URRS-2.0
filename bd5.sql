#Muestra el número total de alumnos de la localidad de salamanca
SELECT COUNT(*) nAlumnos
FROM alumno
WHERE localidad='salamanca';

#Muestra los dos alumnos más jóvenes.
SELECT *
FROM alumno
ORDER BY fecha_nacimiento DESC
LIMIT 2;

#Muestra el/los alumnos con fecha de nacimiento mayor, o lo que es lo mismo el/los más jóvenes
SELECT *
FROM alumno
WHERE fecha_nacimiento=(SELECT MAX(fecha_nacimiento) FROM alumno);

#Muestra el código y nombre de departamento junto con el número de asignaturas que tiene.
SELECT COUNT(*) nAsignaturas, d.codigo, d.nombre
FROM asignatura a, departamento d
WHERE a.id_departamento=d.codigo
GROUP BY d.codigo;

#Muestra las asignaturas cuyo departamento tenga el código postal más alto.
SELECT a.*
FROM asignatura a, departamento d
WHERE a.id_departamento=d.codigo AND d.codigo_postal=(SELECT MAX(codigo_postal) FROM departamento);

#Muestra el nombre de la asignatura y la carrera de aquellas carreras que tienen 6 ó 7 asignaturas.
SELECT a.nombre, c.*, count(*)
FROM asignatura a, carrera c
WHERE a.id_carrera = c.codigo
having count(*) = 6 or count(*) = 7
group by c.codigo;

SELECT d.nombre, d.codigo
from departamento d, asignatura a
where a.id_departamento = d.codigo and a.curso=5;

SELECT al.nombre, a.*
from alumno al, asignatura a, alumno_asignatura aa
where al.dni = aa.id_alumno and a.codigo = aa.id_asignatura and AVG(aa.calificacion_junio + aa.calificacion_septiembre);

#Muestra el el nombre del alumno y la asignatura cuya media sea menor que 5. La media se
#calcula para las notas de junio y septiembre, en todas las convocatorias(años).
SELECT a.nombre ,asi.nombre 
FROM alumno a , asignatura asi , alumno_asignatura aa
WHERE a.dni = aa.ID_ALUMNO AND asi.codigo=aa.ID_ASIGNATURA AND (SELECT (AVG(calificacion_junio)+AVG(calificacion_septiembre))/2 FROM alumno_asignatura)<5

#Muestra las provincias de los alumnos junto con la fecha de nacimiento más alta por
#provincia, en dónde el alumno mayor de la provincia haya nacido en 1975.
SELECT provincia , MAX(FECHA_NACIMIENTO)
FROM alumno 
WHERE FECHA_NACIMIENTO BETWEEN '1975-01-01' AND '1975-12-31'
GROUP BY provincia


#Muestra las localidades de los profesores, junto con la suma de los salarios por localidad que
#sumen más de 12 millones.
SELECT provincia
FROM profesor p , categoria c
WHERE p.ID_CATEGORIA=c.CODIGO 
GROUP BY provincia
HAVING SUM(c.salario)>12000000
# preguntar por que me desaparece zamora cunado pongo el where
