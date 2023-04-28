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

  <h3 align="center">PRÁCTICA 3: Matrices</h3>

  
  </p>
</div>

________________________________

# Equipo: JAVATAR
## Autores


* CARLOS CRUZ RANGEL - 312285823 - [@Eiffelsci](https://twitter.com/Eiffelsci) - carloscruzrangel@ciencias.unam.mx

* TOPRAK MEMIK HERNANDEZ - 419002354 - [@ToprakShakur](https://twitter.com/ToprakShakur) - toprakshakur@ciencias.unam.mx 

___________________

# Sobre la Práctica
## Actividad 1 (Suma de matrices)
Ejercicio:\
Dadas dos matrices de la misma dimension,A = (a_ij) y B = (b_ij),se define la matriz suma como:

* A + B = (a_ij + b_ij )

La matriz suma se obtienen sumando los elementos de las dos matrices que ocupan la misma misma
posición.

![imagen](https://user-images.githubusercontent.com/91149209/234074366-e0ed6499-e213-4d5d-9c50-f0fbdea44b49.png)




<p align="right">(<a href="#readme-top">back to top</a>)</p>

## Actividad 2 (Resta de matrices)
Ejercicio:\
Dadas dos matrices de la misma dimension, A = (a_ij ) y B = (b_ij ), se define la matriz resta como:

* A − B = (a_ij − b_ij )

La matriz resta se obtienen restando los elementos de las dos matrices que ocupan la misma misma
posici ́on.

![imagen](https://user-images.githubusercontent.com/91149209/234075601-9c58cb54-1e7b-402b-b44a-31ac26a6c76c.png)
![imagen](https://user-images.githubusercontent.com/91149209/234075790-9053aa7e-e3ce-4ab2-bf25-832b65c0106d.png)



<p align="right">(<a href="#readme-top">back to top</a>)</p>

## Actividad 3 (Producto de un escalar por una matriz)
Ejercicio:\
Dada una matriz A = (a_ij), y un numero real k ∈ R, se define producto de un número real por
una matriz: a la matriz del mismo orden que A, en la que cada elemento está multiplicado por k.

![imagen](https://user-images.githubusercontent.com/91149209/234076233-6e5ba797-7645-4dcf-bee8-f84d8d79c7e2.png)

<p align="right">(<a href="#readme-top">back to top</a>)</p>

## Actividad 4 (Producto de matrices)
Ejercicio:\
Dos matrices A y B son multiplicables si el número de columnas de A coincide con el número de filas de B.

* M_m∗n ∗ M_n∗p = M_m∗p 

El elemento c_ij de la matriz producto se obtiene multiplicando cada elemento de la fila i de la matriz A por cada elemento de la columna j de la matriz B y sumándolos.

![imagen](https://user-images.githubusercontent.com/91149209/234077188-11498614-d876-433e-9970-97aa78f8e9e7.png)
![imagen](https://user-images.githubusercontent.com/91149209/234085435-7478aff0-80e1-4aa7-bb9d-0eb81fd100d6.png)

<p align="right">(<a href="#readme-top">back to top</a>)</p>


## Hecho con:

Esta práctica fue hecha VSCode usando como lenguaje a java.


* ![VSCode](https://img.shields.io/badge/Visual_Studio_Code-v1.76.2_For_Windows-blue?style=for-the-badge&logo=visualstudiocode)

* ![VSCode](https://img.shields.io/badge/Visual_Studio_Code-v1.76.2--1678_For_Linux-blue?style=for-the-badge&logo=visualstudiocode)

* ![Java](https://img.shields.io/badge/java-11-orange?style=for-the-badge&logo=java) 

## Árbol de carpetas y archivos
```
Practica3
├──────────Folder "src"
│            ├───SumaMatrices.java
│            ├───RestaMatrices.java
│            ├───Actividad3.java
│            └───Actividad4.java
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
