/**
 * @author : camilo
 * @created : 2021-12-03
 */
import java.util.ArrayList;

class Universidad {
  private String nombre;
  ArrayList<Programa> listadoPrograma;
  ArrayList<Curso> listadoCursos;

  /*
   * getter, setter
   * */

  public Universidad(String nombre) {
    if (listadoPrograma == null) {
      listadoPrograma = new ArrayList<Programa>();
    }

    if (listadoCursos == null) {
      listadoCursos = new ArrayList<Curso>();
    }

    this.nombre = nombre;
  }

  private void adiccionarPrograma(Programa p) {
    this.listadoPrograma.add(p);
  }

  public void eliminar() {
    for (int i = 0; i < listadoPrograma.size(); i++) {
      Programa p = listadoPrograma.get(i);
      p.eliminar();
    }
    for (int i = 0; i < listadoCursos.size(); i++) {
      Curso c = listadoCursos.get(i);
      c.eliminar();
    }
  }
}
