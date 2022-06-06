# JAVA.IO lectura de archivos

En esta clase aprendimos sobre algunos temas relacionados con la lectura con Java IO:

Abrir archivos;
Lectura línea a línea del archivo y detección de su finalización;
Uso de excepciones por parte de Java IO si la operación de lectura no sale como se esperaba;
Clases abstractas y concretas de lectura.

# En esta clase aprendimos sobre algunos temas relacionados con la escritura y la flexibilidad de Java IO:

Escribir en archivos;
Escribir usando diferentes outputs;
Implementación de abstracción de datos de lectura y escritura;
Clases abstractas y concretas de escritura y lectura.

# Nuevas clases de escritura de archivos
Varias alternativas para establecer una salida en un archivo de texto, como:
La clase FileWriter;
La clase PrintStream;
La clase PrintWriter.
Algunos detalles de la clase System, como:
El atributo System.out es de tipo PrintStream;
El método System.lineSeparator() devuelve los caracteres que representan una nueva línea;
El método System.currentTimeMillis() devuelve los milisegundos que han pasado desde el 1 de enero de 1970.

# Para saber más: java.util.Properties

En proyectos más complejos (que verás en otros cursos) tenemos muchas configuraciones para que nuestra aplicación funcione. Por ejemplo, necesita configurar usuarios, contraseñas, direcciones o puertos de acceso a otras aplicaciones y servicios. Un ejemplo clásico es el acceso a la base de datos, que necesita un usuario/contraseña, etc.

Estas configuraciones pueden estar dentro del código fuente, pero esto requiere volver a compilar el código fuente tan pronto como una configuración cambie. Lo mejor sería externalizarlos y ponerlos en un archivo separado, por ejemplo, un archivo de texto, que no requiere compilación. De esa manera, solo necesitamos cambiar este texto, sin interferir con el código fuente de Java.

Genial, y exactamente eso se hace en miles de proyectos Java y para hacerlo aún más fácil y estandarizado, se creó un mini-patrón para este tipo de archivo. Se denominan archivos de propiedades o simplemente propiedades.

Un archivo de propiedades asocia el nombre de la configuración con su valor. Vea el ejemplo:

#login = alura
password = alurapass
url = www.alura.com

La configuración de login tiene su valor alura, password tiene el valor alurapass y así sucesivamente. Siempre tiene una llave (key) y un valor (value) asociada. Y como esto es tan común, ya se ha creado la clase específica java.util.Properties para trabajar con estos pares clave/valor, pero por supuesto, ¡también podríamos usar un Scanner!

El uso de esta clase es muy sencillo. Vea la representación de los valores anteriores, a través de un objeto de la clase Properties:

//import debe ser java.util.Properties
Properties props = new Properties(); 
props.setProperty("login", "alura"); //chave, valor
props.setProperty("password", "alurapass");
props.setProperty("url", "www.alura.com");

Con el objeto creado podemos ver cómo escribir estos datos en el HD.

Escritura de properties

Ahora todo lo que queda es guardar un archivo para realmente externalizar la configuración. Para hacer esto, usa el método store, de la clase Properties, que recibe un stream o writer, además de los comentarios deseados:

props.store(new FileWriter("conf.properties"), "algun comentário");

Esto crea un archivo conf.properties, con los datos del objeto anterior:

#algun comentário
#Thu May 10 14:29:38 BRT 2018
password=alurapass
login=alura
url=www.alura.com

Para leer este archivo de properties, simplemente use el método de load:

Properties props = new Properties();        
props.load(new FileReader("conf.properties"));

String login = props.getProperty("login");
String password = props.getProperty("password");
String url = props.getProperty("url");

System.out.println(login + ", " + pasword + ", " +  url);

Tenga en cuenta que, una vez leído el archivo, podemos utilizar el método getProperty (key), de la clase Properties, para recuperar su valor.

# En esta lección aprendimos más sobre Scanner y también sobre el formato de texto. Siga la lista:

Leer archivos con Scanner;
Uso de delimitador con Scanner;
Formato de texto y números;
Configuración de localización para formatear el texto.











































