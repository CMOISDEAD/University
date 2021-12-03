/**
 * @author : camilo
 * @created : 2021-12-03
 */
public class Curso {
  private ArrayList<Curso> listadoCursos;
  private ArrayList<Profesores> listadoProfesores;

  public Curso() {
    listadoProfesores = new ArrayList<Profesores>();
  }

  public void eliminar(Programa programa) {
    for (int i = 0; i < listadoCursos.size(); i++) {
      Profesores p  = listadoCursos.get(i); 
      p.eliminarCurso(programa);
    }
    listadoCursos.remove(programa);
  }

  public void eliminarPrograma (Programa p){

  }
}
