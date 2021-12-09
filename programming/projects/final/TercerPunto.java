/**
 * @author : camilo
 * @created : 2021-12-08
**/
import java.util.ArrayList;

public class TercerPunto {

	private ArrayList<Facultad> listaFacultad;
  private int codigo;

  public TercerPunto(ArrayList<Facultad> listaFacultad, int codigo) {
		this.listaFacultad = listaFacultad;
    this.codigo = codigo;
  }

  public void setCodigo(int codigo) {
    this.codigo = codigo;
  }
  
  public void RedAndGold(){
    /* Agregar programas a los cursos ya que todos son los mismos  */
    for (int i = 0; i < this.listaFacultad.size(); i++) {
      for (int j = 0; j < this.listaFacultad.get(i).getListaProgramas().size(); j++) {
        for (int k = 0; k < this.listaFacultad.get(i).getListaProgramas().get(j).getListaEstudiantes().size(); k++) {
          if (this.codigo == this.listaFacultad.get(i).getListaProgramas().get(j).getListaEstudiantes().get(k).getIdentificacion()) {
            int documento = this.listaFacultad.get(i).getListaProgramas().get(j).getListaEstudiantes().get(k).getIdentificacion();
            String nombre = this.listaFacultad.get(i).getListaProgramas().get(j).getListaEstudiantes().get(k).getNombre();
            String apellidos = this.listaFacultad.get(i).getListaProgramas().get(j).getListaEstudiantes().get(k).getApellidos();
            for (int l = 0; l < this.listaFacultad.get(i).getListaProgramas().get(j).getListaEstudiantes().get(k).getListaCursos().size(); l++) {
              String nombrePrograma = this.listaFacultad.get(i).getListaProgramas().get(j).getNombre();
              String nombreCurso = this.listaFacultad.get(i).getListaProgramas().get(j).getListaEstudiantes().get(k).getListaCursos().get(l).getNombre();
              String nombreFacultad = this.listaFacultad.get(i).getListaProgramas().get(j).getListaEstudiantes().get(k).getListaCursos().get(l).getFacultad();
              System.out.println(documento + "\n\t├──Nombre\n\t│\t"+ "└──" + nombre + " " + apellidos + "\n\t├──Curso\n\t│\t" + "└──" + nombreCurso + "\n\t├──Programa\n\t│\t" + "└──" + nombrePrograma + "\n\t└──Facultad\n\t\t" + "└──" + nombreFacultad);
            }
          }
        }
      }
    }
  }
}
