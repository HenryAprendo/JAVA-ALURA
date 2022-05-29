# Modificadores de acceso

En esta clase volvimos a hablar sobre visibilidad y aprendimos:

Hay 3 palabras clave relacionadas con la visibilidad: private, protected, public
Hay 4 niveles de visibilidad (de menor a mayor):
private (visible solo en clase)
<<package private>> (visible en la clase y en cualquier otro miembro del mismo paquete, que puede ser llamado de default)
protected (visible en la clase y en cualquier otro miembro del mismo paquete y para cualquier hijo)
public (visible en cualquier paquete)
Los modificadores pueden ser usados en la definición de la clase, atributo, constructor y método.


# Javadoc  generando documentacion.
Eclipse -- Project -- Generate Javadoc -- automaticamente genera una documentación.

Para saber más: Todas las etiquetas
PRÓXIMA ACTIVIDAD

Ya vimos en esta clase algunas tag (o anotaciones) de javadoc como @version o @author.

Aquí está la lista completa:

@author (usado en la clase o interfaz)
@version (usado en la clase o interfaz)
@param (usado en el método y constructor)
@return (usado solo en el método)
@exception o @throws (en el método o constructor)
@see
@since
@seriel
@deprecated
Es importante que las etiquetas javadoc existan solo para estandarizar algunos datos fundamentales de su código fuente, como el autor y la versión.


# Anotaciones 
En los cursos también ha visto una anotación fuera del javadoc, la anotación @Override. Esta anotación se considera una configuración, en este caso interpretada por el compilador.

Las anotaciones van mucho más allá de los tags de javadoc y son mucho más sofisticadas y poderosas. Ellas ingresaron a la plataforma Java desde la versión 1.5 mientras que el javadoc ha estado presente desde el nacimiento de la plataforma Java. Lo interesante es que las anotaciones se inspiraron en las etiquetas javadoc.

Si aún no está seguro sobre el uso de las anotaciones, tenga la seguridad de que aún verá muchas usadas por las bibliotecas que se utilizan para definir datos y configuraciones. ¡Espere!

# Ejercicio JavaDoc 
El Javadoc solo estará disponible para las instalaciones de JDK’s y no para las de JRE’s. Asegúrate de estar usando un JDK.

1) Cuando creamos nuestras clases, no hay nada más justo que agregar información sobre el autor. En este sentido, cambiaremos la clase Cliente.java y agregaremos metainformación sobre el autor y su versión.

/ **
* Clase que representa a un cliente en ByteBank
*
* @autor Nico Steppat
* @version 0.1
* /
public class Cliente {
    /* código omitido */
}

Recuerde que el uso del atajo /** Eclipse agrega automáticamente la documentación con @author por usted. Vale la pena acostumbrarse a este atajo.

2) Haz lo mismo con la clase Conta.java.

3) Sabemos que la documentación puede ir más allá del nombre y la versión del autor, por ejemplo, documentar métodos y constructores. Usando el atajo / **, documente el constructor de la clase Cuenta.java. El resultado de la documentación debería verse así:


/**
* @param agencia
* @param numero
*/
public Cuenta(int agencia, int numero) {
    /* código omitido */
}

El atajo / ** solo agrega información sobre los parámetros del método, y es responsabilidad del desarrollador completar la documentación.

/**
* valor necesita ser menor o igual al saldo
* @param valor 
* @throws SaldoInsuficienteException
*/
public void sacar(double valor) throws SaldoInsuficienteException {
    /* código omitido */
}

5) A través de Quick Access (Acceso rápido), busque Javadoc en View. Al seleccionar la opción, se mostrará la pestaña "Javadoc". Intente hacer clic en las clases que acaba de documentar. La pestaña "javadoc" mostrará la documentación de la clase.

6) Además de mostrar la documentación haciendo clic en cada clase documentada, podemos generar la documentación como un archivo para ser consultado. Para hacer esto, accede al menú Project -> Generate Javadoc.

En la lista de proyectos mostrados, asegúrese de seleccionar el proyecto bytebank-heredando-cuenta. Asegúrese de que el Javadoc command esté lleno con la ruta de la herramienta javadoc. Utilice en la opción User standard docket la ruta del proyecto padrón, sin ningún cambio. Finalmente, haga clic en el botón "Finish" para generar la documentación.

7) Verifique la carpeta doc generada con la documentación. Acceda al archivo doc/resources/index.html. Esta página es el punto de entrada para la documentación. Navegue por las clases documentadas comprobando el resultado.



# Distrubacion de codigo JAR
Sabemos que a través de jars podemos facilitar el intercambio de nuestro código entre equipos. Ha llegado el momento de practicar.

En Eclipse, haciendo clic derecho en el proyectobytebank-heredado-cuenta, seleccione la opción export. Se mostrarán varias opciones de exportación, seleccione las que están dentro del grupo java y dentro de ella la opción JAR File haga clic en "NEXT". Veamos el siguiente paso a seguir.

En el proyecto proyectobytebank-heredado-cuenta, seleccione solo la carpeta src. También desmarque los archivos .classpath y .project. Asegúrese de que solo esté marcada la opción "Export generated class files and resources". En "Jar File", seleccione una carpeta de fácil acceso en la que se guardará el archivo jar que vamos a crear. Haga clic en Finish y, si se muestra alguna advertencia, ignórela por completo.

Verifique la existencia del archivo jar creado.

Para probar el archivo jar recién creado, cree un nuevo proyecto java llamado bytebank-biblioteca. Cierre el resto de proyectos para que sea más fácil concentrarse en el nuevo proyecto.

Con el botón derecho en el nuevo proyecto, elija New -> Folder. Para el nombre del folder, elija libs.

Copie el jar exportado en la carpeta libs recién creada.

Copiar el archivo jar en un proyecto no es suficiente, debe estar en el class path. Haga clic con el botón derecho en el archivo jar dentro de la carpeta libs y elija la opción add to build path. Vea si seleccionó la opción "Package Explorer". Si tiene la opción Navigator seleccionada, no aparecerá Build Path

Ahora que nuestro proyecto ve el jar creado, cree la clase TestLibreria en el paquete br.com.alura.bytebank. Su propósito es importar algunas clases del jar importado:

package br.com.alura.bytebank;


import br.com.bytebank.banco.modelo.Cuenta;
import br.com.bytebank.banco.modelo.CuentaCorriente;


public class TestLiberia {


    public static void main(String[] args) {
        Cuenta c = new CuentaCorriente(123, 321);
    }
}


Para saber más: Maven
PRÓXIMA ACTIVIDAD

Java es una plataforma de desarrollo completa que destaca por su gran cantidad de proyectos de código abierto (open source). Para la mayoría de problemas en el día a día del desarrollador ya existen librerías para solucionar. Es decir, si te gustaría conectarte con una base de datos, o trabajar en desarrollo web, en el área de ciencia de datos, creación de servicios o Android, ya existen librerías para esto, muchas veces más de una.

Existe la necesidad de organizar, centralizar y versionar los JARs de esas librerías y administrar las dependencias entre ellos. Para solucionar esto, se crearon herramientas específicas y en el mundo Java se destacó Maven. Maven organiza los JARs (código compilado, código fuente y documentación) en un repositorio central que es público y se puede buscar:

mvnrepository.com

Allí puede ver e incluso descargar los archivos JARs, pero lo mejor es que la herramienta Maven puede hacer esto por usted.

Nota: si es un usuario de Linux, Maven es muy similar a los administradores de apt o rpm. En MacOS existe brew con el mismo propósito. En el mundo .Net tenemos nuget y la plataforma node.js usa npm. La gestión de dependencias es un problema cotidiano para el desarrollador, y cada sistema o plataforma tiene su propia solución.

# aprendimos
¿Qué aprendimos?

En esta sección más ligera vimos y aprendimos:

Qué comentarios y tags (anotaciones) usar para definir el javadoc
Cómo generar javadoc en Eclipse
Que javadoc es una documentación para desarrolladores
Que las clases estándar de Java también usan javadoc
Cómo crear nuestra propia librería a través de JAR (J*ava *ARchive)
Cómo importar librerías al nuevo proyecto
Cómo crear un JAR ejecutable
En la siguiente clase conoceremos el paquete java.lang.



# JAVA.LANG CLASE STRING

En esta clase aprendimos y sabemos:

El package java.lang es el único paquete que no necesita ser importado
Tiene clases fundamentales que cualquier aplicación necesita, como la clase String y System
Los objetos de la clase String son inmutables y usamos una sintaxis literal para crear (objeto literal)
Cualquier método para cambiar la clase String devuelve un nuevo String que representa el cambio
La clase String es una CharSequence
Si necesitamos concatenar muchos String debemos usar la clase StringBuilder
Vimos varios métodos de la clase String como trim, charAt, contains, isEmpty, length, indexOf, replace