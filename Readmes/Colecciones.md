# Curso 5. Java y Java.util 

# Arrays
En esta clase sobre arrays aprendimos:

Un array es una estructura de datos y se usa para almacenar elementos (valores primitivos o referencias)
Los arrays usan corchetes ([]) sintácticamente
¡Los arrays tienen un tamaño fijo!
¡Un array también es un objeto!
Los arrays son zero-based(el primer elemento se encuentra en la posición 0)
Un array siempre se inicializa con los valores padron.
Al acceder a una posición no válida recibimos la excepción ArrayIndexOutOfBoundException
Las matrices tienen un atributo length para conocer el tamaño
La forma literal de crear un array, utilizando llaves {}.

# Cast Implicito y Explicito de primitivos
Ya hemos hablado mucho sobre Type Cast que no es más que convertir de un tipo a otro.

# Cast implícito

Para ser correctos, ya hemos visto cast sucediendo incluso antes de definirlo. Tenemos dos ejemplos, el primero en el mundo de los primitivos:

int numero = 3;
double valor = numero; //cast implícito

Observe que colocamos un valor de la variable numero (tipo int) en la variable valor (tipo double), sin usar un cast explícito. ¿Esto funciona? La respuesta es sí, ya que cualquier entero cabe dentro de un double. Por eso el compilador se queda quieto y no exige un cast explícito, pero nada le impide escribir lo:

int numero = 3;
double valor = (double) numero; //cast explícito

# Cast Explicito
Ahora bien, lo contrario no funciona sin cast, ya que un double no cabe en un int:
double valor = 3.56;
int numero = (int) valor; //cast explícito es exigido por el compilador

En este caso, el compilador desecha todo el valor fraccionario y almacena solo el valor entero.


# Cast implícito y explícito de referencias.

En las referencias, se aplica el mismo principio. Si el cast siempre funciona no es necesario hacerlo explícito, por ejemplo:
# CuentaCorriente cc1 = new CuentaCorriente(22, 33);
# Cuenta cuenta = cc1; //cast implícito

Aquí también podría ser explícito, pero nuevamente, el compilador no lo requiere porque cualquier CuentaCorriente es una Cuenta:

CuentaCorriente cc1 = new ConCuentaCorrientetaCorriente(22, 33);
Cuenta Cuenta = (Cuenta) cc1; //cast explícito más desnecessário


# Cast posible e imposible
¿Type cast explícito siempre funciona?

La respuesta es no. El cast explícito solo funciona si es posible, pero hay casos en los que el compilador sabe que un cast es imposible y luego ni compila ni con type cast. Por ejemplo:

# Cliente cliente = new Cliente();
# Cuenta cuenta = (Cuenta) cliente; //imposible, no compila

Como el cliente no extiende la clase de Cuenta ni implementa una interfaz de tipo de Cuenta, es imposible que funcione ese cast, ya que una referencia de tipo de Cuenta nunca puede apuntar a un objeto del tipo de Cliente.

La certificación Java tiene muchas de estas preguntas sobre cast posible, imposible, explícita e implícita. Si pretendes obtener esta certificación, vale la pena estudiar este tema con mucha tranquilidad.

# En esta clase aprendimos:

Un array de tipo Object puede contener cualquier tipo de referencia.
Cuando convertimos una referencia genérica a una referencia más específica, necesitamos usar un type cast.
El cast solo compila cuando es posible, aún así puede fallar al ejecutarse.
Cuando falla el type cast, podemos recibir un ClassCastException.
Para recibir valores al llamar al programa Java en la línea de comando, podemos usar la matriz String[] en el método main.
¡En la próxima clase comenzaremos a hablar de listas! Espere :)


















