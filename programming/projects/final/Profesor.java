/**
 * @author : camilo
 * @created : 2021-12-06
**/

public class Profesor extends Persona{

	private String especialidad;

  public Profesor(String especialidad) {
    super();
		this.especialidad = especialidad;
  }

	public void setEspecialidad(String especialidad) {
  	this.especialidad = especialidad;
	}

	public String getEspecialidad() {
  	return especialidad;
	}

}
