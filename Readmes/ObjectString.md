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