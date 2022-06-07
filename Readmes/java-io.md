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

# ¿Qué aprendimos?

En esta clase aprendí sobre Unicode, Encodings y Charsets.

Conocía el problema de Encoding: donde se utilizan diferentes codepages para escribir y mostrar información en su computadora. La solución fue proporcionada por un consorcio que creó una tabla genérica llamada Unicode que contiene todos los caracteres del mundo en números llamados codepoints. La segunda parte de la solución es aplicar diferentes Encoding para definir cómo se escriben los bytes en los archivos. Las encodings son tablas que transforman cada codepoints en su carácter específico, dependiendo de una región en particular. También señaló que los encodings utilizadas dependen mucho de cada sistema operativo.

Usando Windows, ha implementado un programa para verificar la implementación de Java para Unicodes y Encodings y ha conocido varias clases y métodos. Aprendió que la clase String tiene un método llamado codePointAt() para revelar el codepoint de un carácter dado desde su posición en el String. Descubrió que la clase que representa un encoding o Character Set es Charset y el método estático para devolver una referencia con el charset default es defaultCharset(). Aprendió que la clase String también tiene un método para transformar caracteres en bytes, el getBytes(), que se usa sin un argumento de entrada y usa charset predeterminado. También hay dos sobrecargas para este método, donde puede informar el charset que desea usar para la transformación. Conoció la clase StandardCharsets, del paquete java.nio, que tiene constantes para los charset principales. Finalmente, simuló el problema de los encodings, generando un nuevo string a partir de un constructor cuyos argumentos eran los bytes transformados en el charset y el charset deseado para la transformación. La solución fue asegurar que se aplicará el mismo charset, tanto en la entrada como en la salida.

Las clases Scanner y InputStreamReader tienen sobrecargas de constructor que toman como argumento cual charset se usará para transformar los bytes en strings. De manera análoga a la escritura, la clase PrintWriter también le permite informar cual charset se utilizará para transformar el string en bytes específicos.









































