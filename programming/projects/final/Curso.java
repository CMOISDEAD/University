/**
 * @author : camilo
 * @created : 2021-12-06
 */
public class Curso {

  private String nombre;
  private int creditos;
  private int codigo;

  public Curso(String nombre, int creditos, int codigo) {
    this.nombre = nombre;
    this.creditos = creditos;
    this.codigo = codigo;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public String getNombre() {
    return nombre;
  }

  public void setCreditos(int creditos) {
    this.creditos = creditos;
  }

  public int getCreditos() {
    return creditos;
  }

  public void setCodigo(int codigo) {
    this.codigo = codigo;
  }

  public int getCodigo() {
    return codigo;
  }
}
