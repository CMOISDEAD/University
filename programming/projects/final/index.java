/**
 * @author : camilo
 * @created : 2021-12-06
 */
import java.util.ArrayList;

public class index {

  public static ArrayList<Salon> seleccionar(ArrayList<Salon> listaSalones, String facultad) {
    ArrayList<Salon> retorno = new ArrayList<Salon>();
    for (int i = 0; i < retorno.size(); i++) {
      if (retorno.get(i).getFacultad() != facultad) {
        retorno.add(listaSalones.get(i));
      }
    }
    return retorno;
  }

  public static void main(String[] args) {
    /* Intanciacion de las listas  */
    ArrayList<Programa> listaProgramas = new ArrayList<Programa>();
    ArrayList<Facultad> listaFacultad = new ArrayList<Facultad>();
    ArrayList<Curso> listaCursos = new ArrayList<Curso>();
    ArrayList<Salon> listaSalones = new ArrayList<Salon>();

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
    Programa ingSistemas = new Programa("Ingenieria de Sistemas", 10, 100, listaCursos);
    Programa ingCivil = new Programa("Ingenieria Civil", 10, 100, listaCursos);
    Programa ingElectronica = new Programa("Ingenieria Electronica", 10, 100, listaCursos);
    Programa comunicacionSocial = new Programa("Comunicacion Social", 10, 100, listaCursos);
    Programa filosofia = new Programa("Filosofia", 10, 100, listaCursos);

    /* Programa extra  */
    Programa cuantica = new Programa("Fisica Cuantica", 10, 100, listaCursos);

    listaProgramas.add(ingSistemas);
    listaProgramas.add(ingCivil);
    listaProgramas.add(ingElectronica);
    listaProgramas.add(comunicacionSocial);
    listaProgramas.add(filosofia);

    /* Eliminar curso de un programa */
    filosofia.removerCurso(matematicas.getNombre());
    /* Añadir un curso a un programa */
    filosofia.añadirCurso(narracion);

    /* Imprimo los nombres de los cursos de cada programa  */
    /* for (int i = 0; i < listaProgramas.size(); i++) {
     *   System.out.println("-> " + listaProgramas.get(i).getNombre());
     *   for (int j = 0; j < listaProgramas.get(i).getListaCursos().size(); j++) {
     *     System.out.println(listaProgramas.get(i).getListaCursos().get(j).getNombre());
     *   }
     * } */

    /* Agregar las facultades  */
    Facultad cienciasBasicas =
        new Facultad(
            "Ciencias Basicas", 20, listaProgramas, listaSalones);
    Facultad ingenieria =
        new Facultad("Ingenieria", 18, listaProgramas, listaSalones);
    Facultad administracion =
        new Facultad("Administracion", 20, listaProgramas, listaSalones);
    Facultad humanidades =
        new Facultad("Humanidades", 10, listaProgramas, listaSalones);
    Facultad economia =
        new Facultad("Economia", 20, listaProgramas, listaSalones);

    listaFacultad.add(cienciasBasicas);
    listaFacultad.add(ingenieria);
    listaFacultad.add(administracion);
    listaFacultad.add(humanidades);
    listaFacultad.add(economia);

    /* Remover programa de la facultad de economia */
    economia.removerPrograma(filosofia.getNombre());
    /* Añadir programa a la facultad de economia */
    economia.añadirPrograma(cuantica);

    /* Imprimo las Facultades  */
    for (int i = 0; i < listaFacultad.size(); i++) {
      System.out.println("-> " + listaFacultad.get(i).getNombre());
      for (int j = 0; j < listaFacultad.get(i).getListaSalones().size(); j++) {
        System.out.println(":" + listaFacultad.get(i).getListaSalones().get(j).getNombre());
      }
    }
  }
}
