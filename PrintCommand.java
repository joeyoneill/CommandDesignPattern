package csce247.assignments.command;

public class PrintCommand implements Command {
	private Document document;
	
	public PrintCommand(Document document) {
		this.document = document;
	}
	
	public void execute() {
		document.print();
	}

}