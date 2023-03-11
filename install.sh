#!/bin/bash
read -p "Introduce el nombre del programa: " nombre_programa

read -p "Introduce la ruta relativa a HOME donde se encuentre el icono: " icono

read -p "Introduce la ruta relativa a HOME donde se encuentre el ejecutable: " ejecutable

archivo = "$HOME/Documents/$nombre_programa.desktop"
touch archivo
echo "[Desktop Entry]" >> $archivo
echo "Name=$nombre_programa" >> "$archivo"
echo "Exec=$ejecutable" >> "$archivo"
echo "Icon=$icono" >> $archivo
echo "Type=Application" >> "$archivo"

sudo mv $archivo "/usr/share/applications/"
