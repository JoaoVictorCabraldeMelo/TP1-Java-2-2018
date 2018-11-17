
/**
 * Not Rented the Vehicle type of Exception
 * @author joao
 *
 */
public class NotRented  extends RuntimeException{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public NotRented(String msg){
		super(msg);
	}

}
