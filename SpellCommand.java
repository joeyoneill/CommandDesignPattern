package csce247.assignments.command;

public class SpellCommand implements Command {
	private Document document;
	
	public SpellCommand(Document document) {
		this.document = document;
	}
	
	public void execute() {
		document.spellCheck();
	}

}
