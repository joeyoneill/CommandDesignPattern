public class SpellCommand implements Command {

	private Document doc;
	
	/**
	 * Default Constructor
	 */
	public SpellCommand(Document doc) {
		this.doc = doc;
	}
	
	@Override
	public void execute() {
		doc.spell();
	}
}
