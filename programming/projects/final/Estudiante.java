/**
 * @author : camilo
 * @created : 2021-12-06
 */
public class Estudiante extends Persona{

  private int semestre;
  private int codigoEstudiante;

  public Estudiante(int semestre, int codigoEstudiante) {
    super();
    this.semestre = semestre;
    this.codigoEstudiante = codigoEstudiante;
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
}
