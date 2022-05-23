# Curso de manejo de excepciones

Qué es, para qué sirve y cómo funciona la pila de ejecución.
Qué es la depuración (debug) y para qué sirve.
Cómo utilizar Eclipse y su perspectiva de debug.
Cómo cambiar entre perspectivas de Eclipse.


Qué son las excepciones, para qué sirven y por qué se utilizarlas.
Cómo analizar el seguimiento de excepciones o stacktrace.
Manejar excepciones con bloques try-catch.
Manejar una excepción lanzada dentro del bloque catch.
Manejar múltiples excepciones con más de un bloque catcho usando Multi-Catch usando el pipe (|).

Miguel estudió esta clase cuidadosamente y tomó las notas que se encuentran a continuación. ¿Puedes tu, un erudito, indicar qué declaraciones escribió Miguel incorrectamente a través de las alternativas a continuación?

1) Existe una gran jerarquía de clases que representan excepciones. Por ejemplo, ArithmeticException es hija de RuntimeException, que hereda de Exception, que a su vez es hija de la clase de excepciones más ancestral, Throwable. Conocer bien esta jerarquía significa saber cómo usar las excepciones en su aplicación.

2) Throwable es la clase que necesita ser extendida para poder lanzar un objeto en la pila (usando la palabra reservada throw)

3) La jerarquía que comenzó con la clase Throwable se divide en excepciones y errores. Las excepciones se utilizan en códigos de aplicación. Los errores son utilizados exclusivamente por la máquina virtual. Las clases que heredan de Error se utilizan para informar errores en la máquina virtual. Los desarrolladores de aplicaciones no deben crear errores que hereden de Error

4) StackOverflowError es un error de la máquina virtual para informar que la pila de ejecución no tiene más memoria.

5) Las excepciones se dividen en dos grandes categorías: las que el compilador comprueba obligatoriamente y las que no. Los primeros se denominan checked y se crean al pertenecer a una jerarquía que no pasa por RuntimeException. Los segundos son unchecked y se crean como descendientes de RuntimeException.