/**
 * @author : camilo
 * @created : 2021-11-30
 */
import java.util.ArrayList;

class index {
  // Metodo
  ArrayList<Persona> devolverMujeresMayorEdad(Persona[] listadoPersonasEstatico) {
    ArrayList<Persona> retorno = new ArrayList<Persona>();

    for (int i = 0; i < listadoPersonasEstatico.length; i++) {
      if (listadoPersonasEstatico[i].edad >= 18 && listadoPersonasEstatico[i].genero.equals("F")) {
        retorno.add(listadoPersonasEstatico[i]);
      }
    }
    return retorno;
  }

  // Personas de genero Masculino y que su nombre o apellido comiensen por "s";
  ArrayList<Persona> devolverMasculinoNombreS(Persona[] listadoPersonasEstatico) {
    ArrayList<Persona> retorno = new ArrayList<Persona>();

    for (int i = 0; i < listadoPersonasEstatico.length; i++) {
      if (listadoPersonasEstatico[i].genero.equals("M")
              && listadoPersonasEstatico[i].nombre.toLowerCase.charAt(0).equals("s")
          || listadoPersonasEstatico[i].apellido.toLowerCase.charAt(0).equals("s")) {
        retorno.add(listadoPersonasEstatico[i]);
      }
    }
    return retorno;
  }

  public static void main(String args[]) {}
}
