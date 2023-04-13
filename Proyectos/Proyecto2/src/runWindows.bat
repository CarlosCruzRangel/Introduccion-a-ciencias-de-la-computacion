@echo off

::RUN para windows 
:: 
::Programa que compila y corre PROYECTO 1
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
echo EMPIEZA LA COMPILACION DEL PROYECTO 1 
echo.
echo ...Compilando...
echo.
    javac *.java
echo.
echo TERMINO LA COMPILACION DEL PROYECTO 1 
pause 
echo EMPIEZA LA EJECUCION DEL PROYECTO 1 
    
    java Main
 pause
pause exit