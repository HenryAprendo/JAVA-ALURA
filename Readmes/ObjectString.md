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