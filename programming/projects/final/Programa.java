/**
 * @author : camilo
 * @created : 2021-12-06
 */
import java.util.ArrayList;

public class Programa {

  private String nombre;
  private String nombreFacultad;
  private int creditos;
  private int codigo;
  private int numeroEstudiantesRegistrados;
  private ArrayList<Curso> listaCursos;
  private ArrayList<Estudiante> listaEstudiantes;

  public Programa(
      String nombre,
      int creditos,
      int codigo,
      int numeroEstudiantesRegistrados,
      ArrayList<Curso> listaCursos,
      String nombreFacultad,
      ArrayList<Estudiante> listaEstudiantes) {
    this.nombre = nombre;
    this.creditos = creditos;
    this.codigo = codigo;
    this.numeroEstudiantesRegistrados = numeroEstudiantesRegistrados;
    this.listaCursos = listaCursos;
    this.nombreFacultad = nombreFacultad;
    this.listaEstudiantes = seleccionarEstudiantes(listaEstudiantes, nombre);
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

  public void setCodigo(int codigo) {
    this.codigo = codigo;
  }

  public int getCodigo() {
    return codigo;
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

  public String getNombreFacultad() {
    return nombreFacultad;
  }

  public ArrayList<Estudiante> getListaEstudiantes() {
    return listaEstudiantes;
  }

  public void setListaEstudiantes(ArrayList<Estudiante> listaEstudiantes) {
    this.listaEstudiantes = listaEstudiantes;
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

  /* [> Este metodo selecciona solo los Estudiante que corresponden a este Programa <] */
  public static ArrayList<Estudiante> seleccionarEstudiantes(ArrayList<Estudiante> listaEstudiantes, String nombre) {
    ArrayList<Estudiante> retorno = new ArrayList<Estudiante>();
    for (int i = 0; i < listaEstudiantes.size(); i++) {
      if (listaEstudiantes.get(i).getPrograma() == nombre) {
        retorno.add(listaEstudiantes.get(i));
      }
    }
    return retorno;
  }
}
