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


# ArrayList de Java.util 

Otras formas de inicialización

Lista con capacidad predefinida.

Decíamos que el ArrayList es un array dinámico, es decir, debajo de la tela se usa un array, pero sin preocuparse por los detalles y limitaciones.

Ahora piense que necesita crear una lista que represente a los 26 estados de Brasil. Le gustaría usar un ArrayList para "escapar" del array, pero sabe que ArrayList crea un array automáticamente, del tamaño que la clase considere conveniente.

¿No hay alguna forma de crear esta lista definiendo el tamaño del array? Por supuesto que lo es y es muy sencillo. El constructor de la clase ArrayList es sobrecargado y tiene un parámetro que recibe la capacidad:

ArrayList lista = new ArrayList(26); //capacidad inicial

La lista sigue siendo dinámica, ¡pero el tamaño de la matriz inicial es 26!

Lista a partir de otra

# Otra forma de inicializar una lista es basada en otra que es muy común en el día a día. Para esto, ArrayList tiene un constructor más que recibe la lista base:

ArrayList lista = new ArrayList(26); //capacidad inicial
lista.add("RJ");
lista.add("SP");
//otros estados
ArrayList nueva = new ArrayList(lista); //creando basada en la primera lista

# Que aprendimos

En esta clase comenzamos a hablar sobre la lista y llegamos a conocer la clase java.util.ArrayList. Aprendimos:

Que la clase java.util.ArrayList encapsula el uso de array y ofrece varios métodos de más alto nivel.
Que una lista guarda referencias.
Cómo usar los métodos size, get, remove.
Cómo usar foreach para iterar a través de ArrayList.
Que los generics parametrizan clases
Que en el caso de ArrayList podemos definir el tipo de los elementos mediante generics.

Cómo implementar el método equals para definir la igualdad.
Que el método equals es usado por las listas.
Que hay más de una lista, java.util.LinkedList
La diferencia entre ArrayList y LinkedList
La interfaz java.util.List que define los métodos de la lista

java.util.Vector, que es un ArrayList threadsafe.
La interfaz java.util.Collection que es la interfaz de todas las colecciones.
Las listas son secuencias que aceptan elementos duplicados.
Los conjuntos (java.util.Set) también son colecciones, pero no aceptan duplicados ni listas.


# WRAPPERS INTEGER, FLOAT, DOUBLE
En esta clase nos enfocamos en las clases deWRAPPERS y aprendimos que.

Para cada primitivo hay una clase llamada Wrapper.
Para almacenar un primitivo en una colección, necesita crear un objeto que envuelva el valor.
La creación del objeto Wrapper se llama autoboxing.
La extracción del valor primitivo del objeto Wrapper se llama unboxing.
El autoboxing y unboxing ocurren automáticamente.
Las clases wrapper tienen varios métodos auxiliares, por ejemplo para el parsing.
Todas las clases wrappers que representan un valor numérico tienen la clase java.lang.Number como madre.


# Lo que aprendimos
En esta clase fundamental e importante aprendimos que:

Para ordenar una lista necesita definir un criterio de ordenación
Hay dos formas de definir este criterio
A través de la interfaz del comparador
A través de la interfaz Comparable (orden natural)
El algoritmo de ordenación ya se ha implementado
En la lista en el método de sort
En la clase Collections por el método sort
La clase Collections es una fachada con varios métodos auxiliares para trabajar con colecciones, principalmente listas
Respire hondo, ya que estamos casi al final de este curso, sin embargo todavía tenemos que aprender (¡por fin!) las famosas expresiones lambda. ¿Estás listo para continuar?






