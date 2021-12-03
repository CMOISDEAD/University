/**
 * @author : camilo
 * @created : 2021-12-02
 */
import java.util.ArrayList;

class Cine {
  private String id;
  private int row = 0;
  private int col = 0;

  public Cine(String id, int row, int col) {
    this.id = id;
    this.row = row;
    this.col = col;
  }

  public String getId() {
    return id;
  }

  public int getRow() {
    return row;
  }

  public int getCol() {
    return col;
  }

  public static final int ASIENTOS_CINE = 10;

  public static void main(String args[]) {
    ArrayList<ArrayList<Cine>> listaAsientos = new ArrayList<ArrayList<Cine>>();
    int identificador = 0;

    for (int i = 0; i < ASIENTOS_CINE; i++) {
      ArrayList<Cine> asientoFilas = new ArrayList<Cine>();
      for (int j = 0; j < 5; j++) {
        if(identificador < 10){
          asientoFilas.add(new Cine("00" + identificador, i, j));
        }else{
          asientoFilas.add(new Cine("0" + identificador, i, j));
        }
        identificador++;
      }
      listaAsientos.add(asientoFilas);
    }

    for (int i = 0; i < listaAsientos.size(); i++) {
      for (int j = 0; j < listaAsientos.get(0).size(); j++) {
        ArrayList<cine> actual = listaAsientos.get(i);

        System.out.println("[ " + actual.get(j).getId() + " ]");
      }
      System.out.println("");
    }
  }
}
