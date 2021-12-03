/**
 * @author : camilo
 * @created : 2021-11-30
 */
class index {
  String nombre, matricula;
  int cantidadPasajeros, velocidadMaxima, largo, ancho, autonomia, numeroGalonesCombustible;

  /*
   * 1. Construir metodo que empleando el arreglo que contiene "n" cantidad de objetos tipo bote
   *    retorne:
   *
   *    ø - el bote que tiene mayor capacidad de pasajeros  (12, 13, 11).
   *    1 - el numero de botes que su matricula termine con S o s.
   *    2 - la autonomia promedio de todo los botes del arreglo.
   *    3 - la velocidad maxima del bote mas rapido.
   * */

  double[] caracteristicaBote(bote[] arregloBotes) {
    double[] retorno = new double[4];
    int indice = 0, capacidadPasajeros = 0, velocidad = 0;
    String boteCapacidadpasajeros;
    double promedioBotes = 0;

    for (int i = 0; i < arregloBotes.length; i++) {
      promedioBotes += arregloBotes[i].autonomia;
      // Punto_1
      if (capacidadPasajeros < arregloBotes[i].capacidadPasajeros) {
        capacidadPasajeros = arregloBotes[i].capacidadPasajeros;
        retorno[0] = arregloBotes[i].nombre;
      }
      // Punto_2
      char letra = arregloBotes[i].nombre.charAt(arreglo[i].nombre.length - 1);
      if (letra.toUpperCase() = "S") {
        retorno[1] = arregloBotes[i].nombre;
      }
      // Punto_4
      if (velocidad < arregloBotes[i].velocidadMaxima) {
        velocidad = arregloBotes[i].velocidadMaxima;
        retorno[3] = arregloBotes[i].nombre;
      }
    }
    // Punto_3
    retorno[2] = promedioBotes / arregloBotes.length;

    return retorno;
  }

  public static void main(String args[]) {}
}
