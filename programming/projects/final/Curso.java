/**
 * @author : camilo
 * @created : 2021-12-06
 */
public class Curso {

  private String nombre;
  private int creditos;
  private int codigo;
  private int numeroEstudiantes;
  // private ArrayList<Estudiante> listaEstudiantes;
  private String facultad;

  public Curso(String nombre, int creditos, int codigo, int numeroEstudiantes, String facultad) {
    this.nombre = nombre;
    this.creditos = creditos;
    this.codigo = codigo;
    this.numeroEstudiantes = numeroEstudiantes;
    this.facultad = facultad;
    // this.listaEstudiantes = listaEstudiantes;
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

  public void setNumeroEstudiantes(int numero) {
    this.numeroEstudiantes = numero;
  }

  public int getNumeroEstudiantes() {
    return numeroEstudiantes;
  }

/*   public ArrayList<Estudiante> getListaEstudiantes() {
 *     return listaEstudiantes;
 *   }
 *
 *   public void setListaEstudiantes(ArrayList<Estudiante> listaEstudiantes) {
 *     this.listaEstudiantes = listaEstudiantes;
 *   } */

  public void setFacultad(String facultad) {
    this.facultad = facultad;
  }

  public String getFacultad() {
    return facultad;
  }
}
