# Herencia

# Primer aula

En esta aula comenzamos a hablar de herencia y aprendimos:

Cuáles son los problemas que la herencia resuelve.
Cómo usar la herencia en Java a través de la palabra llave extends
Al heredar la clase hija gana todas las características (atributos) y todas las funcionalidades (métodos) de la clase madre.
Conocimos el primer beneficio de la herencia: La reutilización de código.
En la próxima clase veremos más detalles sobre la herencia como la palabra llave super, protected y la sobreescritura de métodos.


# Sobrecarga y sobre-escritura de métodos
Existe otro concepto en los lenguajes OO que se llama sobrecarga que es mucho más simple que la sobreescritura y no depende de la herencia.

Por ejemplo, en nuestra clase Gerente, imagina otro nuevo método autenticar que recibe además de la contraseña también el login:	

public class Gerente extends Funcionario {

    private int contraseña;

    public int getContraseña() {
        return contraseña;
    }

    public void setContraseña(int contraseña) {
        this.contraseña = contraseña;
    }

    public boolean autenticar(int contraseña) {
        if (this.contraseña == contraseña) {
            return true;
        } else {
            return false;
        }
    }

    // Nuevo método, recibiendo dos parámetros
    public boolean autenticar(String login, int contraseña) {
        // implementación omitida
    }

    // Otros métodos omitidos
}


Observe que hemos creado una nueva versión del método autenticar. Ahora tenemos dos métodos de autenticar en la misma clase que varían en el número o tipo de parámetros. Esto se llama sobrecarga de métodos.

La sobrecarga no tiene en cuenta la visibilidad o retorno del método, solo los parámetros y no depende de la herencia.


# En esta clase entramos más a fondo en la herencia. Aprendimos:

* que la clase madre es llamada de super o base class.
* que la clase hija también es llamada de sub class.
* como aumentar la visibilidad de un miembro (atributo, método) a través de protected.
* cómo acceder o llamar un miembro (atributo, método) a través de super.
* cómo redefinir un método a través de la sobreescritura. En la próxima clase veremos un nuevo beneficio de la herencia, el Polimorfismo. ¡Aguarda!