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



# Tercera Sesión: 






































