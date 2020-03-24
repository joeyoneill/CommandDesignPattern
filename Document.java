public class Document {
	public String name;

	/**
	 * Sets the name of document and prints out that it has been created
	 * 
	 * @param name is the name of the document
	 */
	public Document(String name) {
		this.name = name;
		System.out.println("Document named " + this.name + " is created");
	}

	/**
	 * Loads document into view
	 */
	public void load() {
		System.out.println("Document " + this.name + " is loaded into view");
	}

	/**
	 * Saves document
	 */
	public void save() {
		System.out.println("Document " + this.name + " is being saved");
	}

	/**
	 * Checks for input validation
	 */
	public void spell() {
		System.out.println("Document " + this.name + " is being checked for spelling errors");
	}

	/**
	 * prints out the docuemnt
	 */
	public void print() {
		System.out.println("Document " + this.name + " is printing");
	}
}
