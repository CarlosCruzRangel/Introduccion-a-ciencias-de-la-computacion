#!/bin/bash

echo " _______  ___   _______  __    _  __   __  _______  __    _  ___   ______   _______ ";
echo "|  _    ||   | |       ||  |  | ||  | |  ||       ||  |  | ||   | |      | |       |";
echo "| |_|   ||   | |    ___||   |_| ||  |_|  ||    ___||   |_| ||   | |  _    ||   _   |";
echo "|       ||   | |   |___ |       ||       ||   |___ |       ||   | | | |   ||  | |  |";
echo "|  _   | |   | |    ___||  _    ||       ||    ___||  _    ||   | | |_|   ||  |_|  |";
echo "| |_|   ||   | |   |___ | | |   | |     | |   |___ | | |   ||   | |       ||       |";
echo "|_______||___| |_______||_|  |__|  |___|  |_______||_|  |__||___| |______| |_______|";






echo "BIENVENIDO $USER A LA PRACTICA UNO "
    date

echo
echo "EMPIEZA LA COMPILACION DE LA PRACTICA 1"
echo
    cd src
    javac Practica1.java

echo "TERMINA LA COMPILACION DE LA PRACTICA 1"
echo
echo "Presione una tecla para continuar . . ."
read 
echo
\
echo "EMPIEZA LA EJECUCION DE LA PRACTICA1"
    java Practica1

