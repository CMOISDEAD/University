/**
 * @author : camilo
 * @created : 2021-12-06
 */
import java.util.ArrayList;

public class index {

  public static void main(String[] args) {
    /* Intanciacion de las listas  */
    ArrayList<Programa> listaProgramas = new ArrayList<Programa>();
    ArrayList<Facultad> listaFacultad = new ArrayList<Facultad>();
    ArrayList<Curso> listaCursos = new ArrayList<Curso>();
    ArrayList<Salon> listaSalones = new ArrayList<Salon>();
    ArrayList<Estudiante> listaEstudiantes = new ArrayList<Estudiante>();

    /*  Agrego los estudiantes */
    Estudiante E1 =
        new Estudiante(
            "Fernando",
            "Gomez Salamanca",
            "fernando.gomezs@uqvirtual.edu.co",
            "calle 19 #23-06",
            1024495489,
            310458962,
            "O+",
            18,
            "Masculino",
            "Estudiante",
            3,
            2304,
            "Comunicacion Social");
    Estudiante E2 =
        new Estudiante(
            "Laura Camila",
            "Gutierrez Parra",
            "laurac.gutierrezp@uqvirtual.edu.co",
            "calle 54 #25-56",
            105552365,
            310458962,
            "A+",
            22,
            "Femenino",
            "Estudiante",
            1,
            5454,
            "Ingenieria de Sistemas");
    Estudiante E3 =
        new Estudiante(
            "Camilo",
            "Araque Cano",
            "camilo.araquec@uqvirtual.edu.co",
            "calle 18 #29-10",
            57878756,
            314948484,
            "O-",
            29,
            "Masculino",
            "estudiante",
            10,
            4845,
            "Administracion P");
    Estudiante E4 =
        new Estudiante(
            "Dayana",
            "Paez aguirre",
            "dayana.paeza@uqvirtual.edu.co",
            "manzana 3 casa 12",
            145267852,
            315458962,
            "O+",
            16,
            "Femenino",
            "Estudiante",
            5,
            4579,
            "Humanidades P");
    Estudiante E5 =
        new Estudiante(
            "Julian David",
            "Cruz mora",
            "juliand.cruzm@uqvirtual.edu.co",
            "calle 25 #10-02",
            1000245800,
            311958962,
            "A+",
            24,
            "Masculino",
            "Estudiante",
            2,
            2811,
            "Economia P");
    Estudiante E6 =
        new Estudiante(
            "Camilo Esteban",
            "Davila Sierra",
            "camiloe.davilas@uqvirtual.edu.co",
            "calle 25 #10-02",
            1000245800,
            311958962,
            "A+",
            18,
            "Masculino",
            "Estudiante",
            2,
            2811,
            "Ingenieria de Sistemas");

    listaEstudiantes.add(E1);
    listaEstudiantes.add(E2);
    listaEstudiantes.add(E3);
    listaEstudiantes.add(E4);
    listaEstudiantes.add(E5);
    listaEstudiantes.add(E6);

    /*  Agrego los salones */
    Salon s305 = new Salon("Laboratorio Sistemas", "D4 305", 305, "Ingenieria");
    Salon s300 = new Salon("Aulas Ingles", "D3 300", 300, "Ingenieria");
    Salon ad1 = new Salon("Auditorio", "D4 Auditiorio 1 322", 322, "Ciencias Basicas");
    Salon s201 = new Salon("Secretaria", "D4 201", 201, "Ciencias Basicas");
    Salon s202 = new Salon("Secretaria 2", "D4 202", 202, "Ciencias Basicas");

    listaSalones.add(s305);
    listaSalones.add(s300);
    listaSalones.add(ad1);
    listaSalones.add(s201);
    listaSalones.add(s202);

    /* Agrego los cursos  */
    Curso matematicas = new Curso("Matematicas", 15, 01);
    Curso calculo = new Curso("Calculo", 18, 02);
    Curso algebra = new Curso("algebra", 15, 03);
    Curso lectura = new Curso("lectura", 10, 04);
    Curso fisica = new Curso("fisica", 20, 05);

    /* Curso extra  */
    Curso narracion = new Curso("Narracion", 20, 05);

    listaCursos.add(matematicas);
    listaCursos.add(calculo);
    listaCursos.add(algebra);
    listaCursos.add(lectura);
    listaCursos.add(fisica);

    /* Agrego los programas  */
    Programa ingSistemas =
        new Programa(
            "Ingenieria de Sistemas", 10, 100, listaCursos, "Ingenieria", listaEstudiantes);
    Programa administracionP =
        new Programa("Administracion P", 10, 100, listaCursos, "Administracion", listaEstudiantes);
    Programa humanidadesP =
        new Programa("Humanidades P", 10, 100, listaCursos, "Humanidades", listaEstudiantes);
    Programa comunicacionSocial =
        new Programa(
            "Comunicacion Social", 10, 100, listaCursos, "Ciencias Basicas", listaEstudiantes);
    Programa economiaP =
        new Programa("Economia P", 10, 100, listaCursos, "Economia", listaEstudiantes);

    /* Programa extra  */
    Programa cuantica =
        new Programa("Fisica Cuantica", 10, 100, listaCursos, "Ingenieria", listaEstudiantes);

    listaProgramas.add(ingSistemas);
    listaProgramas.add(administracionP);
    listaProgramas.add(humanidadesP);
    listaProgramas.add(comunicacionSocial);
    listaProgramas.add(economiaP);

    /* Eliminar curso de un programa */
    economiaP.removerCurso(matematicas.getNombre());
    /* Añadir un curso a un programa */
    economiaP.añadirCurso(narracion);

    /* Imprimo los nombres de los cursos de cada programa  */

    /* Agregar las facultades  */
    Facultad cienciasBasicas = new Facultad("Ciencias Basicas", 20, listaProgramas, listaSalones);
    Facultad ingenieria = new Facultad("Ingenieria", 18, listaProgramas, listaSalones);
    Facultad administracion = new Facultad("Administracion", 20, listaProgramas, listaSalones);
    Facultad humanidades = new Facultad("Humanidades", 10, listaProgramas, listaSalones);
    Facultad economia = new Facultad("Economia", 20, listaProgramas, listaSalones);

    listaFacultad.add(cienciasBasicas);
    listaFacultad.add(ingenieria);
    listaFacultad.add(administracion);
    listaFacultad.add(humanidades);
    listaFacultad.add(economia);

    /* Remover programa de la facultad de economia */
    // economia.removerPrograma(filosofia.getNombre());
    /* Añadir programa a la facultad de economia */
    // economia.añadirPrograma(cuantica);

    /* Imprimo las Facultades  */
    int numeroEstudiantesF = 0;
    int numeroEstudiantesH = 0;
    double edadPromedioF = 0;
    double edadPromedioH = 0;

    for (int i = 0; i < listaFacultad.size(); i++) {
      for (int j = 0; j < listaFacultad.get(i).getListaProgramas().size(); j++) {
        System.out.println(listaFacultad.get(i).getNombre()+ ": \n"+ "\t "+ "└──" + listaFacultad.get(i).getListaProgramas().get(j).getNombre()+ ":");
        for (int k = 0; k < listaFacultad.get(i).getListaProgramas().get(j).getListaEstudiantes().size();k++) {
          if (listaFacultad.get(i).getListaProgramas().get(j).getListaEstudiantes().get(k).getGenero().toUpperCase().equals("FEMENINO")) {
            edadPromedioF += listaFacultad.get(i).getListaProgramas().get(j).getListaEstudiantes().get(k).getEdad();
            numeroEstudiantesF += 1;
          }else{
            edadPromedioH += listaFacultad.get(i).getListaProgramas().get(j).getListaEstudiantes().get(k).getEdad();
            numeroEstudiantesH += 1;
          }
        }
        // edadPromedio = edadPromedio / listaFacultad.get(i).getListaProgramas().get(j).getListaEstudiantes().size();
        System.out.println("\t \t" + "├──" + "Feminino" + "\n\t" + "\t│\t└──Cantidad: Promedio:\n" + "\t\t│\t\t└──" + numeroEstudiantesF + "\t└──" + edadPromedioF);
        System.out.println("\t \t" + "└──" + "Masculino" + "\n\t" + "\t\t└──Cantidad: Promedio:\n" + "\t\t\t\t└──" + numeroEstudiantesH + "\t└──" + edadPromedioH);
      }
    }
  }
}
