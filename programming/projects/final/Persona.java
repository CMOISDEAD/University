/**
 * @author : camilo
 * @created : 2021-12-05
 */

public class Persona {

  private String nombre;
  private String apellidos;
  private String correo;
  private String direccion;
  private int identificacion;
  private int telefono;
  private String rh;
  private int edad;
  private String genero;
  private String tipoVinculacion;

  public Persona(
      String nombre,
      String apellidos,
      String correo,
      String direccion,
      int identificacion,
      int telefono,
      String rh,
      int edad,
      String genero,
      String tipoVinculacion) {
    this.nombre = nombre;
    this.apellidos = apellidos;
    this.correo = correo;
    this.direccion = direccion;
    this.identificacion = identificacion;
    this.telefono = telefono;
    this.rh = rh;
    this.edad = edad;
    this.genero = genero;
    this.tipoVinculacion = tipoVinculacion;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public String getNombre() {
    return nombre;
  }

  public void setApellidos(String apellidos) {
    this.apellidos = apellidos;
  }

  public String getApellidos() {
    return apellidos;
  }

  public void setCorreo(String correo) {
    this.correo = correo;
  }

  public String getCorreo() {
    return correo;
  }

  public void setDireccion(String direccion) {
    this.direccion = direccion;
  }

  public String getDireccion() {
    return direccion;
  }

  public void setIdentificacion(int identificacion) {
    this.identificacion = identificacion;
  }

  public int getIdentificacion() {
    return identificacion;
  }

  public void setTelefono(int telefono) {
    this.telefono = telefono;
  }

  public int getTelefono() {
    return telefono;
  }

  public void setRh(String rh) {
    this.rh = rh;
  }

  public String getRh() {
    return rh;
  }

  public void setEdad(int edad) {
    this.edad = edad;
  }

  public int getEdad() {
    return edad;
  }

  public void setGenero(String genero) {
    this.genero = genero;
  }

  public String getGenero() {
    return genero;
  }

  public void setTipoVinculacion(String tipoVinculacion) {
    this.tipoVinculacion = tipoVinculacion;
  }

  public String getTipoVinculacion() {
    return tipoVinculacion;
  }
}
