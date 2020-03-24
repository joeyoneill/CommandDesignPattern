public class SaveCommand implements Command {

	private Document doc;

	/**
	 * Default Constructor for SaveCommand
	 * 
	 * @param doc sets the save command document
	 */
	public SaveCommand(Document doc) {
		this.doc = doc;
	}

	@Override
	public void execute() {
		doc.save();
	}
}