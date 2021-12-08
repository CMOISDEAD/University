/**
 * @author : camilo
 * @created : 2021-12-06
 */
public class Estudiante extends Persona {

  private int semestre;
  private int codigoEstudiante;
  private String programa;

  public Estudiante(
      String nombre,
      String apellido,
      String correo,
      String direccion,
      int identificacion,
      int telefono,
      String rh,
      int edad,
      String genero,
      String tipoVinculacion,
      int semestre,
      int codigoEstudiante,
      String programa) {
    super(
        nombre,
        apellido,
        correo,
        direccion,
        identificacion,
        telefono,
        rh,
        edad,
        genero,
        tipoVinculacion);
    this.semestre = semestre;
    this.codigoEstudiante = codigoEstudiante;
    this.programa = programa;
  }

  public void setSemestre(int semestre) {
    this.semestre = semestre;
  }

  public int getSemestre() {
    return semestre;
  }

  public void setCodigoEstudiante(int codigoEstudiante) {
    this.codigoEstudiante = codigoEstudiante;
  }

  public int getCodigoEstudiante() {
    return codigoEstudiante;
  }

  public String getPrograma() {
    return programa;
  }

  public void setPrograma(String programa) {
    this.programa = programa;
  }
}
