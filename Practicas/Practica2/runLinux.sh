#!/bin/bash

echo " _______  ___   _______  __    _  __   __  _______  __    _  ___   ______   _______ ";
echo "|  _    ||   | |       ||  |  | ||  | |  ||       ||  |  | ||   | |      | |       |";
echo "| |_|   ||   | |    ___||   |_| ||  |_|  ||    ___||   |_| ||   | |  _    ||   _   |";
echo "|       ||   | |   |___ |       ||       ||   |___ |       ||   | | | |   ||  | |  |";
echo "|  _   | |   | |    ___||  _    ||       ||    ___||  _    ||   | | |_|   ||  |_|  |";
echo "| |_|   ||   | |   |___ | | |   | |     | |   |___ | | |   ||   | |       ||       |";
echo "|_______||___| |_______||_|  |__|  |___|  |_______||_|  |__||___| |______| |_______|";






echo "BIENVENIDO $USER A LA PRACTICA DOS "
    date

echo
echo "EMPIEZA LA COMPILACION DE LA PRACTICA 2"
echo
    cd src

    javac *.java

echo "TERMINA LA COMPILACION DE LA PRACTICA 1"
echo


read -n 1 -s -r -p "Presione cualquier tecla para continuar..."
echo
\
echo "EMPIEZA LA EJECUCION DE LA PRACTICA 2"
    # Función para mostrar el menú
mostrar_menu() {
    echo
    echo "Seleccione una opción:"
    echo "1. Actividad 1 Juego Alice y Bob"
    echo "2. Actividad 2 Clase Persona "
    echo "3. Actividad 3 Clase Raices"
    echo "4. Actividad 4 Clase Pasword "
    echo "5. Salir "
}

# Ciclo para mostrar el menú y recibir la entrada del usuario
opcion=0
while [ $opcion -ne 5 ]
do
    mostrar_menu
    read opcion
    case $opcion in
        1) java AliceBob 
            read -n 1 -s -r -p "Presione cualquier tecla para continuar...";;
        2) java Persona 
            read -n 1 -s -r -p "Presione cualquier tecla para continuar...";;
        3) java Raices 
            read -n 1 -s -r -p "Presione cualquier tecla para continuar...";;
        4) java Password 
            read -n 1 -s -r -p "Presione cualquier tecla para continuar...";;
        5) "Adios buapo" ;;
        *) "Opcion Invalida" ;;
        
    esac
    if ! [[ "$opcion" =~ ^[1-6]+$ ]]; then
        echo "Entrada no válida, por favor ingrese sólo caracteres numéricos del 1 al 6."
        opcion=0
    fi
done
