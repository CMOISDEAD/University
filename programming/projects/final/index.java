/**
 * @author : camilo
 * @created : 2021-12-06
 */
import java.util.ArrayList;
import java.util.Scanner;

public class index {
  public static Scanner sc = new Scanner(System.in);

  public static int parseOptions(ArrayList<Question> optionList) {
    String retorno = "";
    for (int i = 0; i < optionList.size(); i++) {
      String cadena = "[" + i + "] " + optionList.get(i).getMessage() + "\n";
      retorno += cadena;
    }
    System.out.println(retorno);
    return questioner("Selecciona una opcion");
  }

  public static int questioner(String message) {
    System.out.print("┌─(" + message + ")-[~]\n└──$ ");
    int retorno = sc.nextInt();
    return retorno;
  }

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
            1024495480,
            310458962,
            "O+",
            18,
            "Masculino",
            "Estudiante",
            3,
            2304,
            "Comunicacion Social",
            listaCursos);
    Estudiante E2 =
        new Estudiante(
            "Laura Camila",
            "Gutierrez Parra",
            "laurac.gutierrezp@uqvirtual.edu.co",
            "calle 54 #25-56",
            1004917303,
            310458962,
            "A+",
            22,
            "Femenino",
            "Estudiante",
            1,
            5454,
            "Ingenieria de Sistemas",
            listaCursos);
    Estudiante E3 =
        new Estudiante(
            "Camilo",
            "Araque Cano",
            "camilo.araquec@uqvirtual.edu.co",
            "calle 18 #29-10",
            57878524,
            314948484,
            "O-",
            29,
            "Masculino",
            "estudiante",
            10,
            4845,
            "Administracion P",
            listaCursos);
    Estudiante E4 =
        new Estudiante(
            "Dayana",
            "Paez aguirre",
            "dayana.paeza@uqvirtual.edu.co",
            "manzana 3 casa 12",
            145210252,
            315458962,
            "O+",
            16,
            "Femenino",
            "Estudiante",
            5,
            4579,
            "Humanidades P",
            listaCursos);
    Estudiante E5 =
        new Estudiante(
            "anakin",
            "Cruz mora",
            "juliand.cruzm@uqvirtual.edu.co",
            "calle 25 #10-02",
            1001245800,
            311958962,
            "A+",
            24,
            "Masculino",
            "Estudiante",
            2,
            2811,
            "Economia P",
            listaCursos);
    Estudiante E6 =
        new Estudiante(
            "Camilo Esteban",
            "Davila Sierra",
            "camiloe.davilas@uqvirtual.edu.co",
            "calle 25 #10-02",
            1004917304,
            311958962,
            "A+",
            18,
            "Masculino",
            "Estudiante",
            2,
            2811,
            "Ingenieria de Sistemas",
            listaCursos);
      Estudiante E7 =
        new Estudiante(
            "MF Doom",
            "Gomez Salamanca",
            "fernando.gomezs@uqvirtual.edu.co",
            "calle 19 #23-06",
            1291495489,
            310458962,
            "O+",
            18,
            "Femenino",
            "Estudiante",
            3,
            2304,
            "Comunicacion Social",
            listaCursos);
      Estudiante E8 =
        new Estudiante(
            "Viktor Vaungh",
            "Araque Cano",
            "camilo.araquec@uqvirtual.edu.co",
            "calle 18 #29-10",
            578872256,
            314948484,
            "O-",
            29,
            "Femenino",
            "estudiante",
            10,
            4845,
            "Administracion P",
            listaCursos);
      Estudiante E9 =
        new Estudiante(
            "zack",
            "Paez aguirre",
            "dayana.paeza@uqvirtual.edu.co",
            "manzana 3 casa 12",
            1526782252,
            315458962,
            "O+",
            16,
            "Masculino",
            "Estudiante",
            5,
            4579,
            "Humanidades P",
            listaCursos);
      Estudiante E10 =
        new Estudiante(
            "Sthephen",
            "Cruz mora",
            "juliand.cruzm@uqvirtual.edu.co",
            "calle 25 #10-02",
            1000245200,
            311958962,
            "A+",
            24,
            "Femenino",
            "Estudiante",
            2,
            2811,
            "Economia P",
            listaCursos);

    listaEstudiantes.add(E1);
    listaEstudiantes.add(E2);
    listaEstudiantes.add(E3);
    listaEstudiantes.add(E4);
    listaEstudiantes.add(E5);
    listaEstudiantes.add(E6);
    listaEstudiantes.add(E7);
    listaEstudiantes.add(E8);
    listaEstudiantes.add(E9);
    listaEstudiantes.add(E10);

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
    Curso matematicas = new Curso("Matematicas", 15, 01, 1,"Ingenieria");
    Curso calculo = new Curso("Calculo", 18, 02, 2, "Ingenieria");
    Curso algebra = new Curso("algebra", 15, 03, 3, "Ingenieria");
    Curso lectura = new Curso("lectura", 10, 04, 4, "Ciencias Basicas");
    Curso fisica = new Curso("fisica", 20, 05, 5, "Humanidades");

    /* Curso extra  */
    Curso narracion = new Curso("Narracion", 20, 05, 31, "Ciencias Basicas");

    listaCursos.add(matematicas);
    listaCursos.add(calculo);
    listaCursos.add(algebra);
    listaCursos.add(lectura);
    listaCursos.add(fisica);

    /* Agrego los programas  */
    Programa ingSistemas =
        new Programa(
            "Ingenieria de Sistemas", 10, 01, 100, listaCursos, "Ingenieria", listaEstudiantes);
    Programa administracionP =
        new Programa("Administracion P", 10, 02, 100, listaCursos, "Administracion", listaEstudiantes);
    Programa humanidadesP =
        new Programa("Humanidades P", 10, 03, 100, listaCursos, "Humanidades", listaEstudiantes);
    Programa comunicacionSocial =
        new Programa(
            "Comunicacion Social", 10, 04, 100, listaCursos, "Ciencias Basicas", listaEstudiantes);
    Programa economiaP =
        new Programa("Economia P", 10, 05, 100, listaCursos, "Economia", listaEstudiantes);
    Programa ingCivil =
        new Programa(
            "Ingenieria Civil", 10, 06, 100, listaCursos, "Ingenieria", listaEstudiantes);

    /* Programa extra  */
    Programa cuantica =
        new Programa("Fisica Cuantica", 10, 07, 100, listaCursos, "Ingenieria", listaEstudiantes);

    listaProgramas.add(ingSistemas);
    listaProgramas.add(administracionP);
    listaProgramas.add(humanidadesP);
    listaProgramas.add(comunicacionSocial);
    listaProgramas.add(economiaP);
    listaProgramas.add(ingCivil);

    /* Eliminar curso de un programa */
    // economiaP.removerCurso(matematicas.getNombre());
    /* Añadir un curso a un programa */
    // economiaP.añadirCurso(narracion);

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

    /* Proyecto finalizado B)  */
    PrimerPunto primerPunto = new PrimerPunto(listaFacultad);
    // primerPunto.RedAndGold();

    // SegundoPunto segundoPunto = new SegundoPunto(listaFacultad, 1004917304);
    // segundoPunto.RedAndGold();
    
    TercerPunto tercerPunto = new TercerPunto(listaFacultad, 1024495480);
    // tercerPunto.RedAndGold();
    
    CuartoPunto cuartoPunto = new CuartoPunto(listaProgramas, 04);
    // cuartoPunto.RedAndGold();

    int answer = 0;
    Header header = new Header();
    header.showHeader();
    while (answer != 4) {
      ArrayList<Question> optionList = new ArrayList<Question>();
      optionList.add(new Question("Datos Globales"));
      optionList.add(new Question("Datos Docente"));
      optionList.add(new Question("Datos Estudiantes"));
      optionList.add(new Question("Datos Programa"));
      optionList.add(new Question("Kill D.Ø.Ø.M"));
      answer = parseOptions(optionList);
      if (answer < optionList.size()) {
        switch (answer) {
          case 0: primerPunto.RedAndGold();
                  break;
          case 1: primerPunto.RedAndGold();
                  break;
          case 2: tercerPunto.setCodigo(questioner("Ingresa un documento"));
                  tercerPunto.RedAndGold();
                  break;
          case 3: cuartoPunto.setCodigo(questioner("Ingresa codigo del programa"));
                  cuartoPunto.RedAndGold();
                  break;
          case 4: System.out.println("Kill D.Ø.Ø.M"); 
                  break;
        }
      }else{
        System.out.println("err: 001 - 6ece7a48-ba14-435b-aa55-bfaeb4da1f1c");
        break;
      }
    }
  }
}
