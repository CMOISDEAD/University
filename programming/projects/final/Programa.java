/**
 * @author : camilo
 * @created : 2021-12-06
 */
import java.util.ArrayList;

public class Programa {

  private String nombre;
  private int creditos;
  private int numeroEstudiantesRegistrados;
  private ArrayList<Curso> listaCursos;

  public Programa(
      String nombre, int creditos, int numeroEstudiantesRegistrados, ArrayList<Curso> listaCursos) {
    this.nombre = nombre;
    this.creditos = creditos;
    this.numeroEstudiantesRegistrados = numeroEstudiantesRegistrados;
    this.listaCursos = listaCursos;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public String getNombre() {
    return nombre;
  }

  public void setCreditos(int creditos) {
    this.creditos = creditos;
  }

  public int getCreditos() {
    return creditos;
  }

  public void setNumeroEstudiantesRegistrados(int numeroEstudiantesRegistrados) {
    this.numeroEstudiantesRegistrados = numeroEstudiantesRegistrados;
  }

  public int getNumeroEstudiantesRegistrados() {
    return numeroEstudiantesRegistrados;
  }

  public ArrayList<Curso> getListaCursos() {
    return listaCursos;
  }

  /* [> Eliminar curso  <] */
  public void removerCurso(String nombre) {
    ArrayList<Curso> nuevoArreglo = new ArrayList<Curso>();
    for (int i = 0; i < listaCursos.size(); i++) {
      if (listaCursos.get(i).getNombre() != nombre) {
        nuevoArreglo.add(listaCursos.get(i));
      }
    }
    this.listaCursos = nuevoArreglo;
  }

  /* [> Añadir curso al programa  <] */
  public void añadirCurso(Curso nuevoCurso) {
    boolean centinela = false;
    for (int i = 0; i < this.listaCursos.size(); i++) {
      if (this.listaCursos.get(i).getNombre() == nuevoCurso.getNombre()) {
        centinela = true;
      }
    }

    if (centinela != true) {
      this.listaCursos.add(nuevoCurso);
    }
  }
}
