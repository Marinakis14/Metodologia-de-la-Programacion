package Practica2_ComposicionAgregacion.ej6.MyPoint;

public class MatrizDeDistancias {

    public static void main(String[] args) {

        //Primero hay que crear el array de 10 puntos MyPoint, para ello vamos a utilizar un bucle
        MyPoint[] coordenadas = new MyPoint[10];
        for (int i = 0; i < 10; i++) {
            coordenadas[i] = new MyPoint(i + 1, i + 1);
        }

        //Para mostrar la matriz de distancias creamos dos bucles for: uno para las filas y otro para las columnas y utilizamos el metodo distancia de la clase que hemos creado
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.printf("%.2f\t", coordenadas[i].distance(coordenadas[j]));  //Para que los numeros salgan con dos decimales(%.2f) y que las columnas esten alineadas(\t)
            }
            System.out.println();  //para crear las filas y que no este en una misma linea
        }

    }

}
