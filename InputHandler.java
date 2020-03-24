import java.util.HashMap; 

/**
 * @author Charlie Coffin
 * @version 1.0
 * @since 1.0
 */
public class InputHandler {

	public HashMap<String, Command> commands;
	
	public InputHandler(Document document) {
		commands = new HashMap<String, Command>();
		
		Command load = new LoadCommand(document);
		Command save = new SaveCommand(document);
		Command print = new PrintCommand(document);
		Command spell = new SpellCommand(document);
		
		commands.put("load", load);
		commands.put("save", save);
		commands.put("print", print);
		commands.put("spell", spell);
	} 
	
	public void inputEntered(String data) {
		
		if(data.equalsIgnoreCase("quit")){
			System.out.println("Goodbye");
			System.exit(0);
		}
		
		Command command = commands.get(data); 
		
		if(command == null) {
			System.out.println("Sorry, we don't recognize that command");
			return;
		}
		
		else {
			command.execute();
		}
	}
}
