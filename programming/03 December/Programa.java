/**
 * @author : camilo
 * @created : 2021-12-03
 */
public class Programa {
  private int codigo;
  private String nombre;
  private Universidad universidad;
  private ArrayList<Curso> listadoCursos;

  public Programa(Universidad universidad, int codigo, String nombre) {
    this.universidad = universidad;
    this.codigo = codigo;
    this.nombre = nombre;
  }

  public void adiccionarCurso() {}

  public void eliminar() {
    for (int i = 0; i < listadoCursos.size(); i++) {
      Curso C = listadoCursos.get(i);
      c.eliminar();
    }
  }
}
