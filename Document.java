public class Document {
	public String name; 
	
	public Document(String name) {
		this.name = name;
		System.out.println("Document named " + this.name + " is created");
	}
	
	public void load() {
		System.out.println("Document " + this.name + " is loaded into view");
	}
	
	public void save() {
		System.out.println("Document " + this.name + " is being saved");
	}
	
	public void spell() {
		System.out.println("Document " + this.name + " is being checked for spelling errors");
	}
	
	public void print() {
		System.out.println("Document " + this.name + " is printing");
	}
}
