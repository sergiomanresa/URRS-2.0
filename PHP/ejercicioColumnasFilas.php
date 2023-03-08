<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <title>Ejercicio Columnas y Filas</title>
</head>
<body>
    <form action="#" method="post">
        <input style="width: 30%;" type="number" name="numeroColumnas" required placeholder="Introduce el número de columnas">
        <input style="width: 30%;" type="number" name="numeroFilas" required placeholder="Introduce el número de filas">
        <input type="submit" value="Enviar">
    </form>

    <?php
    if(!empty($_POST)){
        echo '<table border="1px">';
        $columnas = $_POST['numeroColumnas'];
        $filas = $_POST['numeroFilas'];
        for($i=0; $i<$filas; $i++){
            echo '<tr>';
            for($j=0; $j<$columnas; $j++){
                echo "<td>$j</td>";
            }
            echo '</tr>';
        }
        echo '</table>';
    }
    ?>
</body>
</html>