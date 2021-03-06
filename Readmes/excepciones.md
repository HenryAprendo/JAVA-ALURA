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


# Resumen sobre Excepciones
Existe una gran jerarquía de clases que representan excepciones. Por ejemplo, ArithmeticException es hija de RuntimeException, que hereda de Exception, que a su vez es hija de la clase de excepciones más ancestral, Throwable. Conocer bien esta jerarquía significa saber cómo usar las excepciones en su aplicación.
Throwable es la clase que debe extenderse para poder lanzar un objeto en la pila (usando la palabra reservada throw)
Es en la clase Throwable donde tenemos casi todo el código relacionado con las excepciones, incluyendo getMessage() e printStackTrace (). El resto de la jerarquía tiene solo algunas sobrecargas de constructores para comunicar mensajes específicos.
La jerarquía que comenzó con la clase Throwable se divide en excepciones y errores. Las excepciones se utilizan en los códigos de aplicación. Los errores son utilizados exclusivamente por la máquina virtual.
Las clases que heredan de Error se utilizan para informar errores en la máquina virtual. Los desarrolladores de aplicaciones no deben crear errores que hereden de Error.
StackOverflowError es un error de máquina virtual para informar que la pila de ejecución no tiene más memoria.
Las excepciones se dividen en dos categorías amplias: las que el compilador comprueba obligatoriamente y las que no.
Los primeros se denominan checked y se crean por pertenecer a una jerarquía que no pasa RuntimeException.
Los segundos están unchecked y se crean como descendientes de RuntimeException.



# formas de capturar varias excepciones

try {
    deposita();
}
catch(Exception ex) {
    ex.printStackTrace();
}
Es colocando la clase exception para capturar de forma generica cualquier tipo de excepcion
que se presente.
 Creamos un catch genérica que captura cualquier excepción, incluidas las excepciones checked.
Esto puede parecer una buena práctica, pero generalmente no lo es. Como regla general, siempre trate de ser lo más específico posible en el bloque catch favoreciendo multiples bloques de catch o utilizando multi-catch.



Ya hemos visto en este curso dos formas de capturar varias excepciones a través del bloque catch. (1) La forma tradicional, que ha funcionado desde el comienzo de Java, simplemente repite el bloque catch para cada excepción:

try {
    metodoPeligrosoQuePuedeLanzarVariasExcepciones();
} catch(MiExcepcion ex) {
    ex.printStackTrace();
} catch(OtraExcepcion ex) {
    ex.printStackTrace();
} 

Y (2) la forma más actual, que se introdujo en Java 7, le permite definir las diversas excepciones en el mismo bloque (multi catch):

try {
    metodoPeligrosoQuePuedeLanzarVariasExcepciones ();
} catch(MiExcepcion | OtraExcepcion ex) { 
    // multi-catch
    ex.printStackTrace();
}

Encontrarás ambas formas en tu día a día como desarrollador Java. Ahora, vea la firma del "método peligroso" en cuestión:

//funciona, podemos colocar dos excepciones en la firma

public void metodoPeligrosoQuePuedeLanzarVariasExcepciones() throws MiExcepcion, OtraExcepcion {
    // código omitido
}


# ¿Cómo pueden las excepciones ayudar a mejorar el código de su programa?

1) Las excepciones tienen un nombre y, si ese nombre es expresivo, documenta el problema que está ocurriendo.

2) Las excepciones pueden tener un mensaje, es decir, el problema y el estado de las variables se pueden describir en el mensaje.

3) Las excepciones cambian el flujo de ejecución, es decir, impiden que el problema siga el flujo "normal" cuando ocurre algo excepcional.

4) Se pueden manejar excepciones, es decir, podemos volver a la ejecución "normal" si se resuelve el "problema".

# Aprendimos
cómo crear un bloque catch genérico utilizando la clase Exception;
cómo crear una nueva excepción SaldoInsuficienteException;
cómo transformar la excepción en checked o unchecked.


# IllegalArgumentException
En el video, usamos la excepción IllegalStateException, que es parte de la biblioteca de Java e indica que un objeto tiene un estado invalido. Es posible que haya visto otras excepciones famosas, como NullPointerException. Ambos son parte de las excepciones padrones del mundo Java que el desarrollador debe conocer.

Hay otra excepción padrón importante que podríamos haber utilizado en nuestro proyecto. Para ponerlo en contexto, ¿tiene sentido crear una cuenta con una agencia que tiene un valor negativo? Por ejemplo:

Cuenta c = new CuentaCorriente (-111, 222);  //¿tiene sentido?

No tiene ningún sentido. Entonces, podríamos verificar los valores en el constructor de la clase. Si el valor es incorrecto, lanzamos una excepción. ¿Cual? La IllegalArgumentException, que es parte de las excepciones de la biblioteca de Java:

public abstract class Cuenta {

    //atributos omitidos

    public Cuenta(int agencia, int numero){

        if(agencia < 1) {
            throw new IllegalArgumentException("Agencia inválida");
        }

        if(numero < 1) {
            throw new IllegalArgumentException("Número de cuenta inválido");
        }

        //resto del constructor fue omitido
    }
}

IllegalArgumentException y IllegalStateException son dos excepciones importantes que el desarrollador de Java debería utilizar. En general, cuando tenga sentido, utilice una excepción estándar en lugar de crear la suya propia.

# En esta clase aprendimos:

que existe un bloque finally, útil para cerrar recursos (como conexión);
cuando hay un bloque finally, el bloque de catch es opcional;
que el bloque * finally * se ejecuta siempre, sin o con excepción;
cómo utilizar try-with-resources.


# Packages
Los packages sirven para organizar nuestro código.
Los packages son parte del FQN (Full Qualified Name) de la clase.
El nombre completo de la clase (FQN) consta de: PACKAGE.NOMBRE_SIMPLE_DE_LA_CLASE
La definición de package debe ser la primera declaración en el código fuente
Para facilitar el uso de clases de otros packages, podemos importarlas
Los import son justo después de la declaración del package
La nomenclatura padrón es usar el nombre de dominio en la web al revés con el nombre del proyecto, por ejemplo:

br.com.caelum.geradornotas
br.com.alura.gnarus
br.gov.rj.notas
de.adidas.lager