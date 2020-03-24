public class SpellCommand implements Command {

	private Document doc;

	/**
	 * Default Constructor for spell command
	 * 
	 * @param doc accepts docuement and sets it
	 */
	public SpellCommand(Document doc) {
		this.doc = doc;
	}

	@Override
	public void execute() {
		doc.spell();
	}
}
