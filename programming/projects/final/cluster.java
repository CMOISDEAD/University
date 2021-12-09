/**
 * @author : camilo
 * @created : 2021-12-08
 */
public class cluster {
  public static void main(String[] args) {

    /* [> Primer Punto <] */

    /* int numeroEstudiantesF = 0;
     * int numeroEstudiantesH = 0;
     * double edadPromedioF = 0;
     * double edadPromedioH = 0;
     *
     *
     *
     * for (int i = 0; i < listaFacultad.size(); i++) {
     *   for (int j = 0; j < listaFacultad.get(i).getListaProgramas().size(); j++) {
     *     System.out.println(listaFacultad.get(i).getNombre()+ ": \n"+ "\t "+ "└──" + listaFacultad.get(i).getListaProgramas().get(j).getNombre()+ ":");
     *     for (int k = 0; k < listaFacultad.get(i).getListaProgramas().get(j).getListaEstudiantes().size();k++) {
     *       if (listaFacultad.get(i).getListaProgramas().get(j).getListaEstudiantes().get(k).getGenero().toUpperCase().equals("FEMENINO")) {
     *         edadPromedioF += listaFacultad.get(i).getListaProgramas().get(j).getListaEstudiantes().get(k).getEdad();
     *         numeroEstudiantesF += 1;
     *       }else{
     *         edadPromedioH += listaFacultad.get(i).getListaProgramas().get(j).getListaEstudiantes().get(k).getEdad();
     *         numeroEstudiantesH += 1;
     *       }
     *     }
     *     edadPromedioF = edadPromedioF / numeroEstudiantesF;
     *     edadPromedioH = edadPromedioH / numeroEstudiantesH;
     *     System.out.println("\t \t" + "├──" + "Feminino" + "\n\t" + "\t│\t├──Cantidad:\n" + "\t\t│\t│\t└──" + numeroEstudiantesF + "\n\t\t│\t└──Promedio:\n" + "\t\t│\t\t└──" + edadPromedioF);
     *     System.out.println("\t \t" + "└──" + "Masculino" + "\n\t" + "\t\t├──Cantidad:\n" + "\t\t\t│\t└──" + numeroEstudiantesH + "\n\t\t\t└──Promedio:\n" + "\t\t\t\t└──" + edadPromedioH);
     *     numeroEstudiantesH = 0;
     *     numeroEstudiantesF = 0;
     *     edadPromedioH = 0;
     *     edadPromedioF = 0;
     *   }
     * } */

    /* [> Tercer Punto <] */

    /* [> [> El Infierno de los FOR  <] <] */
    /* Agregar programas a los cursos ya que todos son los mismos  */
    /* int cedulaIn = 1004917304;
     * for (int i = 0; i < listaFacultad.size(); i++) {
     *   for (int j = 0; j < listaFacultad.get(i).getListaProgramas().size(); j++) {
     *     for (int k = 0; k < listaFacultad.get(i).getListaProgramas().get(j).getListaEstudiantes().size(); k++) {
     *       if (cedulaIn == listaFacultad.get(i).getListaProgramas().get(j).getListaEstudiantes().get(k).getIdentificacion()) {
     *         int documento = listaFacultad.get(i).getListaProgramas().get(j).getListaEstudiantes().get(k).getIdentificacion();
     *         String nombre = listaFacultad.get(i).getListaProgramas().get(j).getListaEstudiantes().get(k).getNombre();
     *         String apellidos = listaFacultad.get(i).getListaProgramas().get(j).getListaEstudiantes().get(k).getApellidos();
     *         for (int l = 0; l < listaFacultad.get(i).getListaProgramas().get(j).getListaEstudiantes().get(k).getListaCursos().size(); l++) {
     *           String nombrePrograma = listaFacultad.get(i).getListaProgramas().get(j).getNombre();
     *           String nombreCurso = listaFacultad.get(i).getListaProgramas().get(j).getListaEstudiantes().get(k).getListaCursos().get(l).getNombre();
     *           String nombreFacultad = listaFacultad.get(i).getListaProgramas().get(j).getListaEstudiantes().get(k).getListaCursos().get(l).getFacultad();
     *           System.out.println(documento + "\n\t├──Nombre\n\t│\t"+ "└──" + nombre + " " + apellidos + "\n\t├──Curso\n\t│\t" + "└──" + nombreCurso + "\n\t├──Programa\n\t│\t" + "└──" + nombrePrograma + "\n\t└──Facultad\n\t\t" + "└──" + nombreFacultad);
     *         }
     *       }
     *     }
     *   }
     * } */

    /* [> Cuarto Punto <] */
    /* int codigo = 04; 
     * for (int i = 0; i < listaProgramas.size(); i++) {
     *   if (listaProgramas.get(i).getCodigo() == codigo) {
     *     for (int j = 0; j < listaProgramas.get(i).getListaCursos().size(); j++) {
     *       String nombrePrograma = listaProgramas.get(i).getNombre();
     *       String nombreCurso = listaProgramas.get(i).getListaCursos().get(j).getNombre();
     *       int numeroEstudiantes = listaProgramas.get(i).getListaCursos().get(j).getNumeroEstudiantes();
     *       System.out.println("Codigo: " + codigo + "\n\t├──Nombre\n\t│\t└──" + nombrePrograma + "\n\t├──Curso\n\t│\t└──" + nombreCurso + "\n\t└──Estudiantes\n\t\t└──" + numeroEstudiantes);
     *     }
     *   }
     * } */
  }
}
