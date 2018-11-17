
/**
 * Exception for None existing client or Not Available Vehicle
 * @author joao
 *
 */
public class NothingOrNotAvailable extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public NothingOrNotAvailable(String msg) {
		super(msg);
	}

}
