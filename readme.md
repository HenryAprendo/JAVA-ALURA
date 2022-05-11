#  Primera sesion:  INTRODUCCIÓN A JAVA

# JVM 
 En el mundo Java siempre tendremos el mismo archivo "ejecutable" (Bytecode) que será ejecutado por la máquina virtual de Java (JVM) independientemente del sistema operativo que estemos usando. De esta forma, no es necesario reescribir el código o adaptarlo a cada sistema operativo. ¡Tenemos un único ejecutable para todas las plataformas!

# ¿Que sistemas podemos desarrollar con JAVA?
a. Sistemas web (Web sites, aplicaciones web)
b. Sistemas solo server side (backend)
c. Aplicaciones Android
d. Applets para navegadores web

# Bytecode
Ya hemos hablado que Bytecode es un código de máquina similar a Assembly. Tal vez encontraste extraño el nombre Bytecode (yo también), sin embargo, tiene una explicación muy simple: existe un conjunto de comandos que la máquina virtual de Java entiende, esos comandos son también llamados opcodes (operation code) y cada opcode posee exactamente 1 Byte de tamaño. Entonces, tenemos un opcode de 1 Byte, o más simple, Bytecode.

# Resumen
En la clase introductoria ya hemos aprendido varios temas fundamentales sobre Java.

Hablamos sobre las principales características de Java como:

Orientado a objetos.
Parecido a C++.
Muchas librerías y una gran comunidad.
Además de eso, aprendimos:

La diferencia entre código fuente y Bytecode.
Para ejecutar el Bytecode necesitamos tener la máquina virtual de Java.
El Bytecode es independiente del sistema operativo.
Vimos también los principales componentes de la plataforma Java, que son:

Java Virtual Machine (JVM).
Lenguaje Java.
Librerias Java (API).


# Segunda sesion: Mi primer programa e instalación del JDK

# JDK Java Development Kid [JVM, JRE, TOOLS]
El JDK son las herramientas de desarrollo (como el compilador) y también tiene el JRE incluido java runtime environment y las Tools.
A su vez la JRE está constituida por la JVM Java Virtual Machine y las librerias del lenguaje. El JRE es el ambiente para ejecutar una aplicación.

#  JVM vs JRE vs JDK
El mundo Java está lleno de siglas de 3 o 4 letras comenzando con la letra J. Ya debes conocer las dos más famosas, JRE y JDK. El primero es el ambiente de ejecución, el segundo son las herramientas de desarrollo junto con el ambiente de ejecución. Simplificando, podemos decir que:

JDK = JRE + Herramientas de desarrollo

Existe una tercera sigla, JVM (Java Virtual Machine), que también hemos usado durante el curso. La responsabilidad de la Java Virtual Machine es ejecutar el Bytecode, entonces ¿Cuál es la diferencia entre el JRE y la JVM si ambos ejecutan Bytecode?

La respuesta es simple: El JRE (Nuestro ambiente de ejecución) contiene la JVM, pero también posee varias librerías incluidas. Es decir, para ejecutar una aplicación Java no solo es necesario tener la JVM, también necesitamos de otras librerías.

Entonces, podemos simplificar:

JRE = JVM + Librerías

Es importante resaltar que no se puede descargar la JVM individualmente. Siempre tendremos que descargar el JRE que tiene la JVM y el conjunto de librerías.


# Metodo main
La entrada de una aplicación java es siempre el metodo main.
# public static void main(String[] args){};

# Compilación y ejecución

a. Durante la compilación ocurre una verificación sintáctica del código fuente.
b. En la compilación y ejecución pueden aparecer errores.
c. La JVM ejecuta Bytecode.
d. El compilador genera Bytecode en caso de que el código fuente no presente ningún error sintáctico.

# Ejecutando codigo java en la terminal
Creamos un programa con la extension .java asi, ejemplo.java y en la terminal ejecutamos los siguientes comandos:

# javac ejemplo.java        // Para compilar y generar un bitecode o arhivo ejemplo.class

y luego,

# java ejemplo        // Para llamar a la maquina virtual JVM, llamando al archivo sin la extension .class y ejecutar


# Primer programa JAVA
public class Programa {

    public static void main(String[] args){
        System.out.println("Hola mundo");
    }

}

Después de hacer esto, guarda el archivo como Programa.java en algún directorio. ¡El nombre debe ser exactamente el mismo que el nombre de la clase creada, incluyendo letras mayúsculas y minúsculas! Recuerda que Java es case-sensitive, distingue entre mayúsculas y minúsculas.


# Instalando JDK en Linux
sudo apt-get install oracle-java9-installer

# JDK en window
Finalmente, para instalar en Windows, ingresa a esta web.

Escoge el JDK (Java Development Kit) y, finalmente, la versión de tu sistema operativo. Después de descargar, ejecuta el instalador.

Configuración del PATH en Windows
1) Ve al panel de control, busca y selecciona Sistema, después de eso, haz clic en Configuración avanzada del sistema.

2) En la pestaña "Avanzado", haz clic en variables de entorno y en la ventana "Variables del sistema" selecciona " Path " y haz clic en editar.

3) En esta nueva ventana, haz clic en el botón nuevo y en la línea que fue seleccionada (última), coloca la ruta a tu directorio bin dentro de la carpeta jdk, que a su vez está dentro de la carpeta java.

4) Guarda el cambio haciendo clic en Aceptar y cierra todas las ventanas.

5) Después de hacerlo, cierra la consola de línea de comandos y ábrela nuevamente.

Prueba los siguientes comandos:

java -version
javac -version

# Resumen

En esta clase escribiste tu primer código Java y aprendimos:

Cuál es la diferencia entre JRE y JDK.
Cómo compilar el código fuente de Java desde la línea de comandos (javac).
Cómo ejecutar Bytecode en la línea de comando (java).
Un programa Java debe escribirse dentro de una clase (class).
Cada instrucción Java debe terminar con ;.
Para abrir y cerrar un bloque usaremos las llaves {}.
Un programa Java tiene una entrada que es una función (método) main.
Para imprimir algo en la consola, usamos la declaración System.out.println ().



# Tercera Sesión: IDE Eclipse

Así como vimos en los videos, ahora descargaremos el IDE de Eclipse, para eso, sigue los pasos a continuación:

1) En primer lugar, ve al sitio web de Eclipse y haz clic en el botón Download.

2) Cuando hacemos clic, el sitio nos redirige a otra página, haz clic en el botón Download debajo de Get Eclipse.

3) El sitio nos llevará a la descarga de acuerdo con tu sistema operativo, así que ahora haz clic en Download y espera para finalizar.

4) Desde aquí, procede a la instalación de acuerdo con tu sistema operativo.

Windows
Para instalar el IDE de Eclipse en Windows, sigue estos pasos:

4.1) Ejecuta el archivo que acabas de descargar y espera al instalador.

4.2) El instalador de Eclipse nos dará varias opciones, para este curso, debemos elegir la opción Eclipse IDE for Java Developers.

4.3) En esta nueva parte, haz clic en Install y espera. Cuando se complete la instalación, haz clic en el Launch para abrir Eclipse automáticamente.

Linux
Para instalar el IDE de Eclipse en Linux, sigue estos pasos:

4.1) Extrae los archivos y ejecuta el archivo "eclipse-inst"

4.2) El instalador de Eclipse nos dará varias opciones, para este curso, debemos elegir la opción Eclipse IDE for Java Developers.

4.3) En esta nueva parte, haz clic en Install y espera. Cuando finalice la instalación, haz clic en el Launch para abrir Eclipse automáticamente.

Mac
4.1) Extrae los archivos y ejecuta el instalador (eclipse).

4.2) El instalador de Eclipse nos dará varias opciones, para este curso, debemos elegir la opción Eclipse IDE for Java Developers.

4.3) En esta nueva parte, haz clic en Install y espera. Cuando finalice la instalación, haz clic en el Launch para abrir Eclipse automáticamente.

# Ejecución de un programa en eclipse
Ha llegado el momento de ejecutar nuestro código en Eclipse, sigue los pasos a continuación:

1) Cuando iniciamos Eclipse, nos pedirá que seleccionemos un " workspace ", que es donde se almacenarán tus proyectos. Si deseas personalizar esto, haz clic en Examinar ... y selecciona tu carpeta. En este curso utilizaremos la carpeta del workspace en sí.

2) Cierra la página de Welcome y comenzaremos Eclipse de la forma en que normalmente lo encontramos.

3) Haz clic en File y coloca el cursor en la línea new y verás que Eclipse nos dará algunas opciones. Elige Java project.

4) En esta nueva ventana, nombraremos nuestro proyecto, elegiremos el nombre sintaxe-basica, recuerda verificar la versión de Java utilizada.

5) Observa que tenemos un nuevo proyecto en View Package Explorer, guardaremos nuestro proyecto en esta carpeta src que se creó.

6) En el directorio src, haz clic derecho, coloca el cursor en new y elige class.

7) En esta nueva ventana, crearemos la clase con el nombre Programa, no te preocupes por las diversas opciones que nos ofrezca Eclipse. Haz clic en finish y tendremos nuestra clase de programa.

8) Antes de colocar System.out.println, escribe el método main. Ten la seguridad de que entenderemos mejor el método main durante el curso. Nuestro código se verá así:

public class Programa {

    public static void main(String[] args){
        System.out.println("Hola mundo");
    }

}

9) Ten en cuenta que, durante la escritura, Eclipse intenta inferir algunas cosas, además de cerrar las comillas automáticamente.

10) Para ejecutar nuestro código, en la parte superior de Eclipse, haz clic en Run, luego en Run As y elige Java Application.

# Resumen
El papel de un IDE y su diferencia con respecto a un editor.
Cómo descargar el IDE de Eclipse.
¿Para qué sirve workspace?
El concepto de perspectiva.
Cómo crear un proyecto Java, incluidas las clases y cómo ejecutarlo.
Cómo mostrar diferentes views.