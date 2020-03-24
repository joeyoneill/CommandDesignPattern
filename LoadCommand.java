public class LoadCommand implements Command {

	private Document doc;

	/**
	 * Default Constructor for loadingCommand
	 * 
	 * @param doc sets the document
	 */
	public LoadCommand(Document doc) {
		this.doc = doc;
	}

	@Override
	public void execute() {
		doc.load();
	}
}
