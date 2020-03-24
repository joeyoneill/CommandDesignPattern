public class PrintCommand implements Command {
	
	private Document doc;
	
	/**
	 * Default Constructor
	 */
	public PrintCommand(Document doc) {
		this.doc = doc;
	}
	
	@Override
	public void execute() {
		doc.print();
	}
}