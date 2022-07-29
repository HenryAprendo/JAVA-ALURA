USE jugos;

SELECT * FROM tbcliente WHERE EDAD > 25;

SELECT * FROM tbcliente WHERE EDAD < 25;

SELECT * FROM tbcliente WHERE EDAD <> 25;

SELECT * FROM tbcliente WHERE NOMBRE > 'Marcelo Perez';

SELECT * FROM tbcliente WHERE NOMBRE < 'Erica Carvajo';
SELECT * FROM tbcliente WHERE NOMBRE <= 'Erica Carvajo';

SELECT * FROM tbproducto;

SELECT * FROM tbproducto WHERE PRECIO_LISTA = 28.51;

SELECT * FROM tbproducto WHERE PRECIO_LISTA < 28.51;

SELECT * FROM tbproducto WHERE PRECIO_LISTA BETWEEN 28.49 AND 28.52;

SELECT * FROM tabla_de_vendedores;
SELECT * FROM tabla_de_vendedores WHERE porcentaje_comision > 0.10;




