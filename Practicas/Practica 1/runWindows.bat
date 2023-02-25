@echo off 
echo
echo " _______  ___   _______  __    _  __   __  _______  __    _  ___   ______   _______ ";
echo "|  _    ||   | |       ||  |  | ||  | |  ||       ||  |  | ||   | |      | |       |";
echo "| |_|   ||   | |    ___||   |_| ||  |_|  ||    ___||   |_| ||   | |  _    ||   _   |";
echo "|       ||   | |   |___ |       ||       ||   |___ |       ||   | | | |   ||  | |  |";
echo "|  _   | |   | |    ___||  _    ||       ||    ___||  _    ||   | | |_|   ||  |_|  |";
echo "| |_|   ||   | |   |___ | | |   | |     | |   |___ | | |   ||   | |       ||       |";
echo "|_______||___| |_______||_|  |__|  |___|  |_______||_|  |__||___| |______| |_______|";
echo.
echo.
echo BIENVENIDO %USERNAME%
echo.%TIME% %DATE%
echo.
echo.
echo EMPIEZA LA COMPILACION DE LA PRACTICA
echo.
    cd src
    javac *.java
echo.
echo TERMINO LA COMPILACION DE LA PRACTICA
pause 
echo EMPIEZA LA EJECUCION DE LA PRACTICA

    ::DEMOSTRACION DE FILTROS SECUENCIALES
    :inicio
    SET var=0
    echo.
    echo ------------------------------------------------------------------------------
    echo Este es un menu interectivo ingresa el numero de la opcion que te interese. 
   
    echo  1     Ejecutar Actividad 1
    echo  2     Ejecutar Actividad 2
    echo  3     Ejecutar Actividad 3
    echo  4     Ejecutar Actividad 4   
    echo  5     Ejecutar Actividad 5 
    echo  6     Ejecutar Actividad 6  
    echo  11    Salir 

    SET /p var= ^> Seleccione una opcion [1-10]:

    if "%var%"=="0" goto inicio
    if "%var%"=="1" goto op1
    if "%var%"=="2" goto op2
    if "%var%"=="3" goto op3
    if "%var%"=="4" goto op4
    if "%var%"=="5" goto op5
    if "%var%"=="6" goto op6
    if "%var%"=="7" goto op7
    if "%var%"=="8" goto op8
    if "%var%"=="9" goto op9
    if "%var%"=="10" goto op10
    if "%var%"=="11" goto salir

    ::Mensaje de error, validación cuando se selecciona una opción fuera de rango
    echo. El numero "%var%" no es una opcion valida, por favor intente de nuevo.
    echo.
    pause
    echo.
    goto:inicio

    :op1
        echo.
        echo. Has elegido la opcion Actividad 1
        echo.
        java Actividad1


        color 08
        echo.
        pause
    goto:inicio

    :op2
               echo.
        echo. Has elegido la opcion No. 2 Gray
        echo.
        echo Ingresa un numero de la matriz de aplicacion solo acepta matriz de 10x10, 100x100, 1000x1000
        echo si quieres una matriz de 10x10 entonces ingresa 10
        echo si quieres una matriz de 100x100 entonces ingresa 100
        echo si quieres una matriz de 1000x1000 entonces ingresa 1000
        SET var1=0
        SET /p var1= ^> ingresa tu numero [1-1000]:
        echo Ingresa un numero de hilos Te recomendamos entre 1 y 1000 hilos
        SET var2=0
        SET /p var2= ^> ingresa tu numero [1 - 1000]:
        echo Tenemos tres ejemplos de imagen con ¿cual quiereres tarabajar? ¿1 o 2 o 3?
        SET var3=0
        SET /p var3= ^> ingresa tu numero [1 o 2 o 3]:
        java -cp ./classes Main %var1% imagenes/javatar%var3%.png 2 false %var2%
        color 09
        echo.
        pause
    goto:inicio

    :op3
        echo.
        echo. Has elegido la opcion No. 3 Gray
        echo.
        echo Ingresa un numero de la matriz de aplicacion solo acepta matriz de 10x10, 100x100, 1000x1000
        echo si quieres una matriz de 10x10 entonces ingresa 10
        echo si quieres una matriz de 100x100 entonces ingresa 100
        echo si quieres una matriz de 1000x1000 entonces ingresa 1000
        SET var1=0
        SET /p var1= ^> ingresa tu numero [1-1000]:
        echo Ingresa un numero de hilos Te recomendamos entre 1 y 1000 hilos
        SET var2=0
        SET /p var2= ^> ingresa tu numero [1 - 1000]:
        echo Tenemos tres ejemplos de imagen con ¿cual quiereres tarabajar? ¿1 o 2 o 3?
        SET var3=0
        SET /p var3= ^> ingresa tu numero [1 o 2 o 3]:
        java -cp ./classes Main %var1% imagenes/javatar%var3%.png 3 false %var2%
        color 0A
        echo.
        pause
   goto:inicio

    :salir
        @cls&exit

 pause
pause exit