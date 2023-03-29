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

  <h3 align="center">PRÁCTICA 2: Variables, Tipos de datos primitivos, Controladores de Flujo y Scanner</h3>

  
  </p>
</div>

________________________________

# Equipo: JAVATAR
## Autores


* CARLOS CRUZ RANGEL - [@Eiffelsci](https://twitter.com/Eiffelsci) - carloscruzrangel@ciencias.unam.mx

* TOPRAK MEMIK HERNANDEZ - [@ToprakShakur](https://twitter.com/ToprakShakur) - toprakshakur@ciencias.unam.mx 

___________________

# Sobre la Práctica
## Actividad 1 
Implementamos un programa en el cual le pide al usuario 5 cadenas, el programa debera indica al usuario si la cadena que introdujo es un NUMERO, en caso contrario se le dara un mensaje de que no es un numero:

## Actividad 2
Declaramos y asignamos las variables que consideramos necesarias para representar las siguientes expresiones, usando operadores definidos en Java, además imprime el valor de las variables x, y, z, w, v y los resultados de cada operación.

## Actividad 3
Escribimos los parentesis necesarios a las operaciones definidas en las variables misterio1 y misterio2 para que la practica pueda compilar y escribimos un comentario sobre como se obtuvo

#### > Misterioso1
```
int misterioso1 = (++valor1) - (--valor2) + (valor2++) + (++valor1);
```
la expresión ++valor1, el operador de incremento prefijo significa que el valor de valor1 se incrementa en 1 antes de ser utilizado en la expresión. Por lo tanto, el primer temino vale 35.

En la expresión --valor2, el operador de decremento prefijo significa que el valor de valor2 se decrementa en 1 antes de ser utilizado en la expresión. Por lo tanto, el segundo término es 1.

En la expresión valor2++, el operador de incremento posfijo significa que el valor actual de valor2 se utiliza en la expresión, pero luego se incrementa en 1. Por lo tanto, el tercero es 2.

Finalmente,  valor1 seincrementa en 1 antes de ser utilizado en la expresión. Por lo tanto, el último término es 35. Por lo tanto, el valor de misterioso1 es 35 - 1 + 2 + 35 = 71.

#### > Misterioso2
```
int misterioso2 = (valor4++) + (++valor4) + (valor5++) - (--valor5);
```
En la expresión valor4++, el operador de incremento posfijo significa que el valor actual de valor4 se utiliza en la expresión, pero luego se incrementa en 1. Por lo tanto, el primer termino es: 9.

la expresión ++valor4, el operador de incremento prefijo significa que el valor de valor4 se incrementa en 1 antes de ser utilizado en la expresión. Por lo tanto, el segundo temino vale 10.

En la expresión valor5++, el operador de incremento posfijo significa que el valor actual de valor5 se utiliza en la expresión, pero luego se incrementa en 1. Por lo tanto, el tercer termino es: 90.

Finalmente,  valor1 seincrementa en 1 antes de ser utilizado en la expresión. Por lo tanto, el último término es 89.

Por lo tanto, el valor de misterioso1 es 9 + 10 + 90 - 89 = 20.

## Actividad 4
Escribimos un programa que imprima todos los números pares entre dos números que se le pidan al usuario. Se valida si el primer número que escriben es menos o igual al segundo numero, se imprimen los valores y se acaba el programa ,en caso contrario se le manda un mensaje al usuario pero se le dejara nuevamente volver a intentar.

## Actividad 5
### Actividad 5.1
Se creó un programa que dibuje una escalera de asteriscos. El programa le pedira un número al usuario el cual tomaremos como altura de la piramide.
### Actividad 5.2
un programa que dibuje una escalera invertida de asteriscos. El programa le pedira un numero al usuario el cual tomaremos como altura de la piramide.


## Hecho con:

Esta practica fue hecha con java.
* ![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=java&logoColor=white) 


<p align="right">(<a href="#readme-top">back to top</a>)</p>



<!-- GETTING STARTED -->
# Como Comenzar

## Prerequisitos

Tener Java 8 o superior.



## ¿Como se corre nuestra práctica?
### En Linux
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

#### Ejecutandolo despues de la primera vez
* Solo basta con dar  click derecho sobre "runLinux.sh" y daras clic izquierdo sobre "Ejecutar como un programa"
> ![Captura desde 2023-02-21 10-46-29](https://user-images.githubusercontent.com/79823316/220414591-b0024a4b-d174-45d0-92ed-b120020f6873.png)


* Acontinuación se abrira la terminal integrada de linux, (Se recomienda expandir la ventana) 

> ![Captura desde 2023-02-21 10-47-19](https://user-images.githubusercontent.com/79823316/220414847-91091515-0f55-4edc-8937-6e0b8e8fece8.png)

* Empezara la compilación automatica, sigue las instrucciones de la terminal.

<p align="right">(<a href="#readme-top">back to top</a>)</p>

### En Windows
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
