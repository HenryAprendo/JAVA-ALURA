# PROGRAMACIÓN ORIENTADA A OBJETO

En esta clase conocimos el paradigma procedural, que se utilizó como práctica de programación antes de la introducción de lenguajes orientados a objetos. La necesidad de validar el numeroIdentidad en un formulario se utilizó como ejemplo para discutir los principales problemas que pueden aparecer en este paradigma.

En particular, a medida que otros formularios y desarrolladores necesitan la misma validación de numeroIdentidad, no fue fácil ver que ya había procedimientos y funciones que hicieron este trabajo, ya que los datos y las funciones no tenían un vínculo tan fuerte. Esto podría dar lugar a otra nueva función o fragmento de código con una responsabilidad similar.

Además, conocemos la idea central del paradigma orientado a objetos, que es crear unidades de código que combinen los datos asociados con cierta información con las funcionalidades aplicadas a esos datos (por ejemplo, numeroIdentidad + validación). Son los atributos y métodos.


# Clase
Una clase es una especificación de un tipo, que define atributos y comportamientos.

# Objeto
Un objeto es una instancia de una clase donde podemos definir valores para sus atributos.
Para crear una instancia necesitamos usar la palabra clave new



# Referencias a otro objeto
    public class Cuenta {
        double saldo;
    }

    public class Test {

        public static void main(String[] args) {

            Cuenta miCuenta = new Cuenta();
            miCuenta.saldo = 500.0;
            Cuenta otraCuenta = miCuenta;
            otraCuenta.saldo += 1000.0;

            System.out.println(miCuenta.saldo);
        }
    }

    Imprime 1500, porque las dos referencias (miCuenta y otraCuenta) apuntan al mismo objeto, lo que hace que se agregue la cantidad 1000 a los 500 anteriores.
    Como las dos variables se refieren al mismo objeto en la memoria, el valor de miCuenta cambiará por la asignación realizada en otraCuenta.

# Resumen
En esta clase aprendimos sobre atributos y creación de objetos.

Vimos:

¿Qué es una clase? Cómo crear una clase Cómo crear un objeto o instancia de una clase ¿Qué son los atributos? Cómo definir y ver los valores de los atributos ¿Cómo funciona la asignación de una referencia a una variable?

¡Veremos más sobre las clases en la próxima clase! Ahora no solo sus características sino también su comportamiento. ¡Solo comencemos! ¡Te espero allí!    


# METODOS
* Un método puede tener ninguno, uno o más parámetros.
* Un método define el comportamiento de un objeto. Este es el objetivo de los métodos, definir lo que un objeto sabe hacer. El comportamiento   se implementa dentro del método.
* Los ejemplos de nombres de métodos son: transferir, transferirPara, transferisParaOtroTitular. Tenga en cuenta que todos los nombres comienzan con una letra minúscula y luego usan "CamelCase".


# Referecias y relaciones de objetos:
Aprendimos en este capítulo:

• Darse cuenta de la relación entre clases a través de la composición;

• Ventajas de aislar información repetida en otra clase (abstracción);

• Detalles de la composición;

• NullPointerException para atributos no inicializados y su cuidado.



# Atributos privados
Atributos privados, restringiendo el acceso a los atributos. Encapsulación de código Métodos de lectura de atributos, los getters Métodos para modificar atributos, los setters Getters y Setters de referencia


# Atributos y métodos estaticos
Constructor de clases, que permite recibir argumentos e inicializar atributos desde la creación de un objeto. Con esto, la inicialización de los atributos recibidos en el constructor se vuelve obligatoria. Atributos de clase, atributos estáticos. Métodos de clase, métodos estáticos. Ausencia de referencia, del this, dentro de los métodos estáticos.