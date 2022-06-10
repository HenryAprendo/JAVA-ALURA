# Lo que aprendimos en esta aula:

Introducción de Listas.
Diferencias entre un Array[] e ArrayList.
Adicionar valores en un ArrayList usando el método add().
Remover valores de un ArrayList usando el método remove().
Leer una lista usando for, foreach o foreach de Java 8 usando lambda.
Uso de la clase Collections para ordenar una lista simple.
Ordenar una lista usando el método sort() de la clase Collections.
Uso del método sort() de una lista.
Ordenar una lista usando stream().

# Lo que aprendimos en esta aula:
Crear una lista usando una clase llamada Curso.
Sobrescribir el método toString de una clase para imprimir los valores de la clase Curso.
Ordenar la lista de Cursos usando la clase Collections.
Ordenar una lista de Cursos usando el método comparing de la clase Comparator, para seleccionar el tipo de atributo que usaremos para ordenar.
Uso de stream() en nuestra lista de Cursos.
Filtrar una lista usando el método filter() de stream.
Usar stream para crear una nueva filtrada y ordenada usando el método collect().


# Lo que aprendimos en esta aula:

Crear una lista dentro de una lista de Objetos y obtener los valores de esa sublista usando el método get.

Obtener una lista inmutable usando el método unmodifiableList de la clase Collections.

Ver cómo funcionan las referencias entre listas.

Adicionar valores a una sublista usando el método add().

Ver que la principal diferencia de un LinkedList y ArrayList es que un LinkedList termina siendo más rápido para adicionar valores a una lista en cualquier posición, a diferencia de una ArrayList donde dependiendo de la posición que sea adicionado el valor y dependiendo del tamaño de la lista va terminar siendo más demorado.

Además usando el método get() para obtener algún valor de una posición de un LinkedList termina siendo más demorado que un ArrayList.

Usar un ejemplo práctico para ver esas diferencias en tiempo de ejecución y tomar nuestras propias conclusiones.



# Lo que aprendimos en esta aula:

Usar un HashSet adicionando valores en un Set de String usando el método add().

Leer un HashSet e imprimir sus valores en consola.

Entender el árbol de jerarquías de la Clase Collection.

Usar la interfaz Collection para generalizar una lista de HashSet así luego de acuerdo a las necesidades migrar de Set para List.

Utilizar el método max() de Stream para obtener el valor máximo de una lista.

Usar el método removeIf() de nuestra interfaz Collection.

Explicar algunas diferencias entre las interfaces Set y List, en la cual la principal sería que un Set no adiciona valores repetidos.

# Lo que aprendimos en esta aula:

Es muy importante sobrescribir el método equals y hashCode de un Set porque así podremos usar con efectividad nuestros métodos contains() y comparar valores usando el método equals.

Verificar valores de un Set.

Encapsular métodos para adicionar valores de una Lista de Set o List para poder hacer una migración de tipo de lista con más facilidad.



# Lo que aprendimos en esta aula:

Leer valores de una lista usando la interfaz Iterator a través del método next().

Saber el exception que puede dar cuando usamos el método next() de forma incorrecta.

Saber que la interfaz Iterator era una forma antigua de leer los valores de una lista.

Saber que la principal diferencia entre un Set y List es que el primero no guarda registros duplicados, además que saber que la forma de leer esos valores además de usar un for, es a través de la interfaz Iterator

Reconocer que un Set y List forman parte de la interfaz Collection y por ello podemos usar los métodos que contiene ella.