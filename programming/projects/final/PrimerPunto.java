/**
 * @author : camilo
 * @created : 2021-12-07
**/

public class PrimerPunto {

	private ArrayList<Facultad> facultad;

  public PrimerPunto(ArrayList<Facultad> facultad) {
		this.facultad = facultad;
  }

	public void setFacultad(ArrayList<Facultad> facultad) {
  	this.facultad = facultad;
	}

	public ArrayList<Facultad> getFacultad() {
  	return facultad;
	}
}
