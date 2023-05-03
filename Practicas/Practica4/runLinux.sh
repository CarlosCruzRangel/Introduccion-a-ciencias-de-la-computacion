#!/bin/bash

echo " _______  ___   _______  __    _  __   __  _______  __    _  ___   ______   _______ ";
echo "|  _    ||   | |       ||  |  | ||  | |  ||       ||  |  | ||   | |      | |       |";
echo "| |_|   ||   | |    ___||   |_| ||  |_|  ||    ___||   |_| ||   | |  _    ||   _   |";
echo "|       ||   | |   |___ |       ||       ||   |___ |       ||   | | | |   ||  | |  |";
echo "|  _   | |   | |    ___||  _    ||       ||    ___||  _    ||   | | |_|   ||  |_|  |";
echo "| |_|   ||   | |   |___ | | |   | |     | |   |___ | | |   ||   | |       ||       |";
echo "|_______||___| |_______||_|  |__|  |___|  |_______||_|  |__||___| |______| |_______|";






echo "BIENVENIDO $USER A LA PRACTICA TRES "
    date

echo
echo "EMPIEZA LA COMPILACION DE LA PRACTICA 3"
echo
    cd src

    javac *.java

echo "TERMINA LA COMPILACION DE LA PRACTICA 3"
echo


read -n 1 -s -r -p "Presione cualquier tecla para continuar..."
echo
\
echo "EMPIEZA LA EJECUCION DE LA PRACTICA 3"
    java Main
done
