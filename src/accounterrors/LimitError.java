package accounterrors;

public class LimitError extends Exception{
	private static final long serialVersionUID = 1L;
	
	public LimitError(String msg) {
		super(msg);
	}
	
}
