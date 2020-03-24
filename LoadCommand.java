package csce247.assignments.command;

public class LoadCommand implements Command {
	private Document document;
	
	public LoadCommand(Document document) {
		this.document = document;
	}
	
	public void execute() {
		document.load();
	}

}
