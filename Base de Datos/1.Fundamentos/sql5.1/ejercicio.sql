SELECT * FROM tabla_de_vendedores;

SELECT nombre, matricula  FROM tabla_de_vendedores;
SELECT * FROM tabla_de_vendedores WHERE de_vacaciones = 'Si' AND YEAR(fecha_admision) < 2016;