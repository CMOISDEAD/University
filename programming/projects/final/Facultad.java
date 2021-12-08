/**
 * @author : camilo
 * @created : 2021-12-06
 */
import java.util.ArrayList;

public class Facultad {

  private String nombre;
  private int numeroProgramas;
  private ArrayList<Programa> listaProgramas;
  private ArrayList<Salon> listaSalones;

  public Facultad(
      String nombre,
      int numeroProgramas,
      ArrayList<Programa> listaProgramas,
      ArrayList<Salon> listaSalones) {
    this.nombre = nombre;
    this.numeroProgramas = numeroProgramas;
    this.listaProgramas = seleccionarPrograma(listaProgramas, nombre);
    this.listaSalones = seleccionarSalon(listaSalones, nombre);
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public String getNombre() {
    return nombre;
  }

  public void setNumeroProgramas(int numeroProgramas) {
    this.numeroProgramas = numeroProgramas;
  }

  public int getNumeroProgramas() {
    return numeroProgramas;
  }

  public void setListaProgramas(ArrayList<Programa> listaProgramas) {
    this.listaProgramas = listaProgramas;
  }

  public ArrayList<Programa> getListaProgramas() {
    return listaProgramas;
  }

  public void setListaSalones(ArrayList<Salon> listaSalones) {
    this.listaSalones = listaSalones;
  }

  public ArrayList<Salon> getListaSalones() {
    return listaSalones;
  }
  
  /* [>Remover programa de listaProgramas  <] */
  public void removerPrograma(String nombre) {
    ArrayList<Programa> nuevoArreglo = new ArrayList<Programa>();
    for (int i = 0; i < listaProgramas.size(); i++) {
      if (listaProgramas.get(i).getNombre() != nombre) {
        nuevoArreglo.add(listaProgramas.get(i));
      }
    }
    this.listaProgramas = nuevoArreglo;
  }

  /* [> Añadir programa a la Facultad  <] */
  public void añadirPrograma(Programa nuevoPrograma) {
    boolean centinela = false;
    for (int i = 0; i < this.listaProgramas.size(); i++) {
      if (this.listaProgramas.get(i).getNombre() == nuevoPrograma.getNombre()) {
        centinela = true;
      }
    }

    if (centinela != true) {
      this.listaProgramas.add(nuevoPrograma);
    }
  }

  /* [> Este metodo selecciona solo los salones que corresponden a esta facultad <] */
  public static ArrayList<Salon> seleccionarSalon(ArrayList<Salon> listaSalones, String nombre) {
    ArrayList<Salon> retorno = new ArrayList<Salon>();
    for (int i = 0; i < listaSalones.size(); i++) {
      if (listaSalones.get(i).getFacultad() == nombre) {
        retorno.add(listaSalones.get(i));
      }
    }
    return retorno;
  }

  /* [> Este metodo selecciona solo los programas que corresponden a esta facultad <] */
  public static ArrayList<Programa> seleccionarPrograma(
      ArrayList<Programa> listaProgramas, String nombre) {
    ArrayList<Programa> retorno = new ArrayList<Programa>();
    for (int i = 0; i < listaProgramas.size(); i++) {
      if (listaProgramas.get(i).getNombreFacultad() == nombre) {
        retorno.add(listaProgramas.get(i));
      }
    }
    return retorno;
  }
}
