# Lo que aprendimos en esta aula:

Para acceder a una base de datos necesitamos del driver de conexión;
Un driver es simplemente una librería .jar.
JDBC significa Java DataBase Connectivity;
El JDBC define una capa de abstracción entre la aplicación y el driver de la base de datos.
Esta capa es compuesta de interfaces que el driver implementa.
Para abrir una conexión con la base de datos debemos utilizar el método getConnection de la clase DriverManager;
El método getConnection recibe tres parámetros. Son ellos la URL de conexión JDBC, el usuario y la contraseña.