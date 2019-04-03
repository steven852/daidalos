package latex;

public class commandFactory {

	
	
	public command getCommandType(String command_type) {
		if (command_type == null) {
			return null;
		}
		
		if (command_type.equalsIgnoreCase("chapter")) {
			return new chapter();
		}
		
		else if (command_type.equalsIgnoreCase("subsection")) {
			return new subsection();
		}
		
		else if (command_type.equalsIgnoreCase("subsubsection")) {
			return new subsubsection();
		}
		

		
		return null;
	}
	
	
}
