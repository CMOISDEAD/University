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
      String cadena = "[" + i + "] " + optionList.get(i).getMessage() + "\n";
      retorno += cadena;
    }
    return questioner(retorno);
  }

  public static int questioner(String optionList) {
    prnt(optionList);
    prnt("┌─(Selecciona una opcion)-[~]\n└──$ ");
    int retorno = sc.nextInt();
    return retorno;
  }

  public static void prnt(String message) {
    System.out.print(message);
  }

  public static void main(String args[]) {
    int answer = 0;
    Header header = new Header();
    header.showHeader();
    while (answer != 4) {
      ArrayList<Question> optionList = new ArrayList<Question>();
      optionList.add(new Question("Datos Globales"));
      optionList.add(new Question("Datos Estudiantes"));
      optionList.add(new Question("Datos Docente"));
      optionList.add(new Question("Datos Programa"));
      optionList.add(new Question("Kill D.Ø.Ø.M"));
      answer = parseOptions(optionList);
      if (answer < optionList.size()) {
        optionList.get(answer).questionAction();
      }else{
        System.out.println("err: 001 - 6ece7a48-ba14-435b-aa55-bfaeb4da1f1c");
        break;
      }
    }
  }
}
