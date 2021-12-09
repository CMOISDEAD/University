/**
 * @author : camilo
 * @created : 2021-12-08
**/

import java.util.ArrayList;

public class CuartoPunto {

	private ArrayList<Programa> listaProgramas;
	private int codigo;

  public CuartoPunto(ArrayList<Programa> listaProgramas, int codigo) {
		this.listaProgramas = listaProgramas;
		this.codigo = codigo;
  }

	public void setListaProgramas(ArrayList<Programa> listaProgramas) {
  	this.listaProgramas = listaProgramas;
	}

	public ArrayList<Programa> getListaProgramas() {
  	return listaProgramas;
	}

	public void setCodigo(int codigo) {
  	this.codigo = codigo;
	}

	public int getCodigo() {
  	return codigo;
	}

  public void RedAndGold(){
     for (int i = 0; i < this.listaProgramas.size(); i++) {
      if (this.listaProgramas.get(i).getCodigo() == this.codigo) {
        for (int j = 0; j < this.listaProgramas.get(i).getListaCursos().size(); j++) {
          String nombrePrograma = this.listaProgramas.get(i).getNombre();
          String nombreCurso = this.listaProgramas.get(i).getListaCursos().get(j).getNombre();
          int numeroEstudiantes = this.listaProgramas.get(i).getListaCursos().get(j).getNumeroEstudiantes();
          System.out.println("Codigo: " + this.codigo + "\n\t├──Nombre\n\t│\t└──" + nombrePrograma + "\n\t├──Curso\n\t│\t└──" + nombreCurso + "\n\t└──Estudiantes\n\t\t└──" + numeroEstudiantes);
        }
      }
    }
  }
}
