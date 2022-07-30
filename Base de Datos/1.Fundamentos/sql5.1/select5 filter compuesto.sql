USE jugos;
SELECT * FROM tbproducto;

SELECT * FROM tbproducto WHERE PRECIO_LISTA >= 28.49 AND PRECIO_LISTA <= 28.52; 

SELECT * FROM tbproducto WHERE ENVASE = 'Botella Pet' OR ENVASE = 'Lata';

SELECT * FROM tbproducto WHERE (ENVASE = 'Botella Pet' OR ENVASE = 'Lata') OR (PRECIO_LISTA >= 15 AND PRECIO_LISTA <= 25 );
