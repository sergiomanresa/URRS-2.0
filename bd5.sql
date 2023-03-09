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

