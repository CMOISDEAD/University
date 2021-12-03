/**
 * @author : camilo
 * @created : 2021-12-03
 */
public class Profesor {
  public ArrayList<Curso> listadoCursos;
  private String nombre;
  private int codigo;

  public Profesor(int codigo, String name) {
    this.listadoProfesores = new ArrayList<Profesores>();
  }

  public void adiccionarCurso(Curso curso) {
    this.listadoCursos.add(curso);
  }

  public void eliminar(Curso curso) {}

  public void eliminarCurso(Curso curso) {
    listadoCursos.remove(curso);
  }
}
