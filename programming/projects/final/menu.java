/**
 * @author : camilo
 * @created : 2021-12-03
 */
import java.util.ArrayList;
import java.util.Scanner;

// for(List item: list) item.action();

class menu {
  public static Scanner sc = new Scanner(System.in);

  public static int parseOptions(ArrayList<Question> optionList) {
    String retorno = "";
    for (int i = 0; i < optionList.size(); i++) {
      String cadena = i + 1 + ") " + optionList.get(i).getMessage() + "\n";
      retorno += cadena;
    }
    return questioner(retorno);
  }

  public static int questioner(String optionList) {
    prnt(optionList);
    prnt("Select an option: ");
    int retorno = sc.nextInt();
    return retorno;
  }

  public static void prnt(String message) {
    System.out.print(message);
  }

  public static void main(String args[]) {
    ArrayList<Question> optionList = new ArrayList<Question>();
    optionList.add(new Question("Universidad"));
    optionList.add(new Question("Profesor"));
    optionList.add(new Question("Estudiantes"));
    optionList.add(new Question("Programas"));
    int answer = parseOptions(optionList);
    optionList.get(answer - 1).questionAction();
  }
}
