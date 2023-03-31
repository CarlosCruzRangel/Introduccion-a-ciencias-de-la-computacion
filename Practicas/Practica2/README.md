<!-- PLANTILLA HECHA POR JAVATAR-->


<a name="readme-top"></a>


<!-- PROJECT SHIELDS -->
![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=java&logoColor=white) ![Status badge](https://img.shields.io/badge/status-Terminado%20-green?style=for-the-badge)



<!-- PROJECT LOGO -->
<br />
<div align="center">
  <a href="https://github.com/CarlosCruzRangel/Introduccion-a-ciencias-de-la-computacion">
    <img src="https://user-images.githubusercontent.com/79823316/220245622-4cd1cc0b-521c-4252-8e39-1d2b0d9c2389.png" alt="Logo" width="80" height="80">
  </a>

  <h3 align="center">PRÁCTICA 2: Objetos y Atributos</h3>

  
  </p>
</div>

________________________________

# Equipo: JAVATAR
## Autores


* CARLOS CRUZ RANGEL - [@Eiffelsci](https://twitter.com/Eiffelsci) - carloscruzrangel@ciencias.unam.mx

* TOPRAK MEMIK HERNANDEZ - [@ToprakShakur](https://twitter.com/ToprakShakur) - toprakshakur@ciencias.unam.mx 

___________________

# Sobre la Práctica
## Actividad 1 (resuelto aquí)
Ejercicio:
Dada una clase Carro con estas dos variables de instancia:
```
String marca;
int anio;
```
Describa todas las operaciones que ocurren cuando la siguiente sentencia se ejecuta:
```
Carro carroCaiden = new Carro();
```

>RESPUESTA:
>La sentencia "new Carro()" crea una nueva instancia de la clase "Carro" en la memoria y devuelve una referencia a la nueva instancia. La variable "carroCaiden" se declara y se le asigna la referencia de la nueva instancia de "Carro". La variable "carroCaiden" es de tipo "Carro" y se puede utilizar para acceder a los métodos y propiedades de la instancia de la clase "Carro". El constructor de la clase "Carro" se llama automáticamente para inicializar la nueva instancia. Si no se define ningún constructor explícito, la clase tendrá un constructor predeterminado sin argumentos. Se asignan los valores predeterminados a las variables de instancia "marca" y "anio". En este caso, como no se especifican valores para las variables de instancia, "marca" será inicializada con el valor predeterminado "null" (para objetos de tipo String como es el caso de "marca") y "anio" con el valor predeterminado "0" (para objetos de tipo int como es el caso de "anio").

<p align="right">(<a href="#readme-top">back to top</a>)</p>

## Actividad 2
Alice y Bob están jugando a un juego. Tienen una cadena común S de longitud N. Los jugadores también tienen sus cadenas individuales A (perteneciente a Alice) y B(perteneciente a Bob) que están vacías al principio. El juego comienza con Alice y ambos jugadores alternan sus turnos. En su turno, el jugador elige un  ́unico carácter de la cadena S, lo añade al final de su cadena individual y borra el carácter elegido de la cadena S. El juego continúa hasta que la cadena S está vacía. Averigua si existe una secuencia de movimientos tal que las cadenas A y B sean iguales al final de la partida.

|   |
| - |
|  ***Entrada:*** |
| La primera linea de entrada contendra un unico numero entero T, que indicara el numero de casos de prueba. Cada caso de prueba consta de varias lineas de entrada. La primera linea de cada caso de prueba contiene un numero entero N: la longitud de la cadena. La linea siguiente contiene las cadenas S, formadas por letras minusculas.  |
|  ***Salida:*** |
| Para cada caso de prueba, la salida scra cn una nueva linea , SI si existe una secuencia de movimientos tales que las cadenas A y B sean iguales al final dc la partida, y NO en caso contrario. Puede imprimir cada caracter de la cadena en mayusculas o minusculas (por ejemplo, las cadenas YES, YES, yes y ycS sc trataran todascomo identicas)  |
```
Entrada:
Numero de casos:
4
Languitud de cadena:
4
Cadena:
abab
Languitud de cadena:
5
Cadena:
cbcba
Languitud de cadena:
4
Cadena:
abcd
Languitud de cadena:
6
Cadena:
pqprqr

Salida:
YES
NO
NO
YES
```

<p align="right">(<a href="#readme-top">back to top</a>)</p>

## Actividad 3 (Clase: Persona.java)

Haz una clase llamada Persona que siga las siguientes condiciones:
* Sus atributos son: nombre, edad, DNI, sexo (H hombre, M mujer), peso y altura. No queremos que se accedan directamente a ellos. Piensa que modificador de acceso es el mas adecuado, también su tipo. Si quieres añadir algún atributo puedes hacerlo.

* Por defecto, todos los atributos menos el DNI serán valores por defecto según su tipo (0 números, cadena vacía para String, etc.).

* El sexo sera hombre por defecto (H), usa una constante para ello.

Se implantaran varios constructores:
* Un constructor por defecto.
* Un constructor con el nombre, edad y peso, el resto por defecto.
* Un constructor con todos los atributos como parámetro.

Los métodos que se implementaran son:

* calcularIMC(): calculara si la persona esta en su peso ideal (busca la formula), si esta fórmula devuelve un valor menor que 20, la función devuelve un -1, si devuelve un número entre 20 y 25 (incluidos), significa que esta por debajo de su peso ideal la función devuelve un 0 y si devuelve un valor mayor que 25 significa que tiene sobrepeso, la función devuelve un 1. Te recomiendo que uses constantes para devolver estos valores.

* esMayorDeEdad(): indica si es mayor de edad, devuelve un booleano.

* comprobarSexo(char sexo): comprueba que el sexo introducido es correcto. Si no es correcto, sera H. No sera visible al exterior.

* toString(): devuelve toda la información del objeto.

* generaDNI(): genera un número aleatorio de 8 cifras, genera a partir de este su número su letra correspondiente. Este método sera invocado cuando se construya el objeto. Puedes dividir el método para que te sea más fácil. No ser ́a visible al exterior.

* Metodos set de cada parámetro, excepto de DNI.

Ahora, crea una clase ejecutable que haga lo siguiente:

* Pide por teclado el nombre, la edad, sexo, peso y altura.

* Crea 3 objetos de la clase anterior, el primer objeto obtendrá las anteriores variables pedidas por teclado, el segundo objeto obtendrá todos los anteriores menos el peso y la altura y el  ́ultimo por defecto, para este último utiliza los métodos set para darle a los atributos un valor. 

* comprobarSexo(char sexo): comprueba que el sexo introducido es correcto. Si no es correcto, sera H. No sera visible al exterior.

* Para cada objeto, deberá comprobar si esta en su peso ideal, tiene sobrepeso o por debajo de su peso ideal con un mensaje.

* Indicar para cada objeto si es mayor de edad.

* Por último, mostrar la información de cada objeto.

<p align="right">(<a href="#readme-top">back to top</a>)</p>

## Actividad 4(Clase: Raices.java)
Vamos a realizar una clase llamada Raices, donde representaremos los valores de una ecuación de 2o grado. 

Tendremos los 3 coeficientes como atributos, llamémosles a, b y c. Hay que insertar estos 3 valores para construir el objeto. Las operaciones que se podr ́an hacer son las siguientes:

* obtenerRaices(): imprime las 2 posibles soluciones

* getDiscriminante(): devuelve el valor del discriminante (double), el discriminante tiene la siguiente formula, (b2) − 4 ∗ a ∗ c

* tieneRaices(): devuelve un booleano indicando si tiene dos soluciones, para que esto ocurra, el discriminante debe ser mayor o igual que 0.

* tieneRaiz(): devuelve un booleano indicando si tiene una única solución, para que esto ocurra, el discriminante debe ser igual que 0.

* calcular(): mostrara por consola las posibles soluciones que tiene nuestra ecuación, en caso de no existir solución, mostrarlo también.

* Formula ecuación 2o grado: (-b±((b2) − (4 ∗ a ∗ c)))/(2 ∗ a)

<p align="right">(<a href="#readme-top">back to top</a>)</p>

## Actividad 5

Haz una clase llamada Password que siga las siguientes condiciones:

* Que tenga los atributos longitud y contraseña . Por defecto, la longitud sera de 8. 

Los constructores serán los siguientes:

* Un constructor por defecto.
* Un cosntructor donde nosotros pasemos la contraseña

Los métodos que implementa serán:

* esFuerte(): devuelve un booleano si es fuerte o no, para que sea fuerte debe tener mas de 2 mayúsculas, mas de 1 minúscula y mas de 5 números.

* generarPassword(): genera la contraseña del objeto con la longitud que tenga.
* Método get para contrase ̃na y longitud.
* Método set para contrase ̃na.

Ahora, crea una clase clase ejecutable:

* Crea un una entrada en la cual nosotros podemos insertar un número el cual indicara el numero de casos de prueba.

* Por cada caso de prueba, se le desplegara un menu al usuario en el cual sera libre de generar una contraseña por el sistema o por el mismo, si es generada por el mismo deberemos indicarle si su contraseña es valida o no, si la contraseña es debil se le dajara escribir tantas veces sea necesario hasta que su contraseña sea fuerte.



<p align="right">(<a href="#readme-top">back to top</a>)</p>

## Hecho con:

Esta práctica fue hecha VSCode usando como lenguaje a java.


* ![VSCode](https://img.shields.io/badge/Visual_Studio_Code-v1.76.2_For_Windows-blue?style=for-the-badge&logo=visualstudiocode)

* ![VSCode](https://img.shields.io/badge/Visual_Studio_Code-v1.76.2--1678_For_Linux-blue?style=for-the-badge&logo=visualstudiocode)

* ![Java](https://img.shields.io/badge/java-11-orange?style=for-the-badge&logo=java) 

## Árbol de carpetas y archivos
```
Practica2
├──────────Folder "src"
│            ├───Actividad2.java
│            ├───Actividad3.java
│            ├───Actividad4.java
│            └───Actividad5.java
├───runLinux.sh
├───runWindows.bat
└───Readme.md
```

<p align="right">(<a href="#readme-top">back to top</a>)</p>


_________________________________________________
<!-- GETTING STARTED -->
# Como Comenzar

## Prerequisitos

Tener Java 8 o superior.



## ¿Como se corre nuestra práctica?
### En Linux

![Linux](https://img.shields.io/badge/Linux-FCC624?style=for-the-badge&logo=linux&logoColor=black)
![Ubuntu](https://img.shields.io/badge/Ubuntu-E95420?style=for-the-badge&logo=ubuntu&logoColor=white)

#### Ejecutandolo por primera vez
* Descomprime el archivo
* Abre la carpeta que se generó despues de la descompresión
* Al abrir la carpeta que descomprimio busca el archivo "runLinux.sh"
* Daras clic derecho sobre el archivo y desplegara un menu daras clic izquierdo en "propiedades"

> ![Captura desde 2023-02-21 10-45-34](https://user-images.githubusercontent.com/79823316/220413991-2f28d9a4-2c89-48b6-b11a-f843c7becce7.png)


* Se abrira el siguiente menú:

> ![Captura desde 2023-02-21 10-45-51](https://user-images.githubusercontent.com/79823316/220414107-bfd066e2-331f-4d94-85cb-9df1f3b49c1b.png)


* Daras clic izquierdo en la pestaña "Permisos" y veras lo siguiente:

> ![Captura desde 2023-02-21 10-45-57](https://user-images.githubusercontent.com/79823316/220414226-97e2cdf3-7ff5-4100-970c-3e88772cfc92.png)


* Marcaras la casilla "Permitir ejecutar el archivo como programa", asi como se muestra en la imagen:

> ![Captura desde 2023-02-21 10-46-06](https://user-images.githubusercontent.com/79823316/220414365-4442b7bf-6b4b-4aa9-9be8-77d55ab1d576.png)

* Cerrarás la ventana

* Daras click derecho sobre "runLinux.sh" y daras clic izquierdo sobre "Ejecutar como un programa"

> ![Captura desde 2023-02-21 10-46-29](https://user-images.githubusercontent.com/79823316/220414591-b0024a4b-d174-45d0-92ed-b120020f6873.png)


* Acontinuación se abrira la terminal integrada de linux, (Se recomienda expandir la ventana) 

> ![Captura desde 2023-02-21 10-47-19](https://user-images.githubusercontent.com/79823316/220414847-91091515-0f55-4edc-8937-6e0b8e8fece8.png)

* Empezara la compilación automatica, sigue las instrucciones de la terminal.
<p align="right">(<a href="#readme-top">back to top</a>)</p>

#### Ejecutandolo despues de la primera vez
* Solo basta con dar  click derecho sobre "runLinux.sh" y daras clic izquierdo sobre "Ejecutar como un programa"
> ![Captura desde 2023-02-21 10-46-29](https://user-images.githubusercontent.com/79823316/220414591-b0024a4b-d174-45d0-92ed-b120020f6873.png)


* Acontinuación se abrira la terminal integrada de linux, (Se recomienda expandir la ventana) 

> ![Captura desde 2023-02-21 10-47-19](https://user-images.githubusercontent.com/79823316/220414847-91091515-0f55-4edc-8937-6e0b8e8fece8.png)

* Empezara la compilación automatica, sigue las instrucciones de la terminal.

<p align="right">(<a href="#readme-top">back to top</a>)</p>

### En Windows

![Windows](https://img.shields.io/badge/Windows-0078D6?style=for-the-badge&logo=windows&logoColor=white)
![Windows 11](https://img.shields.io/badge/Windows%2011-%230079d5.svg?style=for-the-badge&logo=Windows%2011&logoColor=white)

* Descomprime el archivo
* Abre la carpeta que se generó despues de la descompresión
* Al abrir la carpeta que descomprimio busca el archivo "runWindows.bat"
* Da doble clic izquierdo en "runWindows.bat" 
* Se abrira Simbolo del sistema y ejecutará la práctica empezando por la compilacion automatica.
> ![para icc](https://user-images.githubusercontent.com/79823316/220416533-cd27c5c0-ac45-4fbf-a534-e0f8104c31d4.png)
* Sigue las instrucciones de la terminal.


<p align="right">(<a href="#readme-top">back to top</a>)</p>






<!-- CONTACT -->

> Project Link: [Practicas y tareas de ICC](https://github.com/CarlosCruzRangel/Introduccion-a-ciencias-de-la-computacion)




 ⌨️ con ❤️ por [Carlos](https://github.com/CarlosCruzRangel) y [Toprak](https://github.com/ToprakShakur)
