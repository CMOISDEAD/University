/**
 * @author : camilo
 * @created : 2021-12-03
**/

public class Question {

	private String message;

  public Question(String message) {
		this.message = message;
  }

	public void setMessage(String message) {
  	this.message = message;
	}

	public String getMessage() {
  	return message;
	}

  public void questionAction() {
    System.out.println("__" + this.message + "__");
  }

}
