public class LoadCommand implements Command {
	
	private Document doc;
	
	/**
	 * Default Constructor
	 */
	public LoadCommand(Document doc) {
		this.doc = doc;
	}
	
	@Override
	public void execute() {
		doc.load();
	}
}
