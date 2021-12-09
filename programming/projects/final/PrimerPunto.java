/**
 * @author : camilo
 * @created : 2021-12-07
**/
import java.util.ArrayList;

public class PrimerPunto {

	private ArrayList<Facultad> listaFacultad;

  public PrimerPunto(ArrayList<Facultad> listaFacultad) {
		this.listaFacultad = listaFacultad;
  }

  public void RedAndGold(){
    int numeroEstudiantesF = 0;
    int numeroEstudiantesH = 0;
    double edadPromedioF = 0;
    double edadPromedioH = 0;
    for (int i = 0; i < this.listaFacultad.size(); i++) {
      for (int j = 0; j < this.listaFacultad.get(i).getListaProgramas().size(); j++) {
        System.out.println(this.listaFacultad.get(i).getNombre()+ ": \n"+ "\t "+ "└──" + this.listaFacultad.get(i).getListaProgramas().get(j).getNombre()+ ":");
        for (int k = 0; k < this.listaFacultad.get(i).getListaProgramas().get(j).getListaEstudiantes().size();k++) {
          if (this.listaFacultad.get(i).getListaProgramas().get(j).getListaEstudiantes().get(k).getGenero().toUpperCase().equals("FEMENINO")) {
            edadPromedioF += this.listaFacultad.get(i).getListaProgramas().get(j).getListaEstudiantes().get(k).getEdad();
            numeroEstudiantesF += 1;
          }else{
            edadPromedioH += this.listaFacultad.get(i).getListaProgramas().get(j).getListaEstudiantes().get(k).getEdad();
            numeroEstudiantesH += 1;
          }
        }
        edadPromedioF = edadPromedioF / numeroEstudiantesF;
        edadPromedioH = edadPromedioH / numeroEstudiantesH;
        System.out.println("\t \t" + "├──" + "Feminino" + "\n\t" + "\t│\t├──Cantidad:\n" + "\t\t│\t│\t└──" + numeroEstudiantesF + "\n\t\t│\t└──Promedio:\n" + "\t\t│\t\t└──" + edadPromedioF);
        System.out.println("\t \t" + "└──" + "Masculino" + "\n\t" + "\t\t├──Cantidad:\n" + "\t\t\t│\t└──" + numeroEstudiantesH + "\n\t\t\t└──Promedio:\n" + "\t\t\t\t└──" + edadPromedioH);
        numeroEstudiantesH = 0;
        numeroEstudiantesF = 0;
        edadPromedioH = 0;
        edadPromedioF = 0;
      }
    }
  }
}
