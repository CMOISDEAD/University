import java.util.ArrayList;

class ListaPersonas {

  static ArrayList<Persona> generarPersonas() {
    Persona[] persons = new Persona[10];

    persons[0] = new Persona("Camilo", "Davila", 18);
    persons[1] = new Persona("Esteban", "Sierra", 19);
    persons[2] = new Persona("Maria", "Vargas", 20);
    persons[3] = new Persona("Angeles", "Gonzales", 21);
    persons[4] = new Persona("Julian", "Ortega", 22);
    persons[5] = new Persona("Mike", "Vidal", 23);
    persons[6] = new Persona("Juliana", "Herrera", 24);
    persons[7] = new Persona("Alejandra", "Martinez", 25);
    persons[8] = new Persona("Lucia", "Gomez", 26);
    persons[9] = new Persona("Mario", "Stocker", 27);

    ArrayList<Persona> listaPersonas = new ArrayList<Persona>();

    for (int i = 0; i < persons.length; i++) {
      listaPersonas.add(persons[i]);
    }

    return listaPersonas;
  }
}
