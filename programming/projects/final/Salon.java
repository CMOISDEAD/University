/**
 * @author : camilo
 * @created : 2021-12-06
**/

public class Salon {

	private String nombre;
	private String ubicacion;
  private String facultad;
	private int numero;

  public Salon(String nombre, String ubicacion, int numero, String facultad) {
		this.nombre = nombre;
		this.ubicacion = ubicacion;
		this.numero = numero;
    this.facultad = facultad;
  }

	public void setNombre(String nombre) {
  	this.nombre = nombre;
	}

	public String getNombre() {
  	return nombre;
	}

	public void setUbicacion(String ubicacion) {
  	this.ubicacion = ubicacion;
	}

	public String getUbicacion() {
  	return ubicacion;
	}

	public void setNumero(int numero) {
  	this.numero = numero;
	}

	public int getNumero() {
  	return numero;
	}

  public void setFacultad (String facultad){
    this.facultad = facultad;
  }

  public String getFacultad(){
    return facultad;
  }
}
