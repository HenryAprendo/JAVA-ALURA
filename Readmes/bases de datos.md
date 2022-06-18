# Lo que aprendimos en esta aula:

Para acceder a una base de datos necesitamos del driver de conexión;
Un driver es simplemente una librería .jar.
JDBC significa Java DataBase Connectivity;
El JDBC define una capa de abstracción entre la aplicación y el driver de la base de datos.
Esta capa es compuesta de interfaces que el driver implementa.
Para abrir una conexión con la base de datos debemos utilizar el método getConnection de la clase DriverManager;
El método getConnection recibe tres parámetros. Son ellos la URL de conexión JDBC, el usuario y la contraseña.

# Lo que aprendimos en esta aula:

Cuando ejecutamos una query SQL como Statement tenemos un riesgo de seguridad llamado SQL Injection;
SQL Injection es el hecho de enviar comandos SQL como parámetro de las solicitudes en una aplicación.
Para evitar el fallo por SQL Injection debemos utilizar la interfaz PreparedStatement;
Diferente del Statement, el PreparedStatement trata los parámetros del comando SQL para que caracteres y comandos especiales sean tratados como strings.
Las bases de datos ofrecen un recurso llamado transacción, que junta muchas operaciones SQL como un conjunto de ejecución;
Si el conjunto falla no es aplicada ninguna modificación y ocurre el rollback de la transacción.
Todos los comandos del conjunto necesitan funcionar para que la transacción sea finalizada con un commit.
Para garantizar el cierre de los recursos abiertos en el código, Java provee un recurso llamado try-with-resources para ayudarnos;
Para utilizar este recurso es necesario que la clase utilizada (como la Connection) implemente la interfaz Autocloseable.


# Utilizar el pool de conexiones es una buena práctica;
El pool de conexiones controla la cantidad de conexiones abiertas entre la aplicación y la base de datos;
Es normal que haya un mínimo y un máximo de conexiones.
De la misma forma que hay, en JDBC, una interfaz para representar la conexión (java.sql.Connection), también hay una interfaz que representa el pool de conexiones (javax.sql.DataSource);
C3P0 es una implementación Java de un pool de conexiones.