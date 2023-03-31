@echo off

::RUN para windows 
:: 
::Programa que compila y corre practica 1
:: 
::@author Carlos Cruz Rangel
::@author Toprak Memik Hernandez
:: 
::@since 26 de Febrero 2022
::@version v1.0

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
   
    echo  Opcion 1     Ejecutar Actividad dos
    echo  Opcion 2     Ejecutar Actividad tres "(Persona.java)"
    echo  Opcion 3     Ejecutar Actividad cuatro "(Raices.java)"
    echo  Opcion 4     Ejecutar Actividad cinco "(Password.java)"    
    echo  Opcion 5     Salir 

    SET /p var= ^> Seleccione una opcion [1-5]:

    if "%var%"=="0" goto inicio
    if "%var%"=="1" goto op1
    if "%var%"=="2" goto op2
    if "%var%"=="3" goto op3
    if "%var%"=="4" goto op4
    if "%var%"=="5" goto salir

    ::Mensaje de error, validación cuando se selecciona una opción fuera de rango
    echo. El numero "%var%" no es una opcion valida, por favor intente de nuevo.
    echo.
    pause
    echo.
    goto:inicio

    :op1
        echo.
        echo. Has elegido la opcion Actividad 2 
        echo  Esto es un programa de un juego de Alice y Bob.
        echo.
        


        
        echo.
        pause
    goto:inicio

    :op2
               echo.
        echo. Has elegido la opcion Actividad 3
        echo  Esto es un programa que calcula el IMC de 3 personas.
        echo.
        java Persona
       
        
        echo.
        pause
    goto:inicio

    :op3
        echo.
        echo. Has elegido la opcion Actividad 4
        echo  Esto es un programa que resulve ecuciones de grado 2
        echo.
        java Raices      

        
        echo.
        pause
   goto:inicio

    :op4
        echo.
        echo. Has elegido la opcion Actividad 5
        echo Esto es un programa que genera contraseñas seguras.
        echo.
        java Password

        
        echo.
        pause
   goto:inicio
    
    :salir
        @cls&exit

 pause
pause exit