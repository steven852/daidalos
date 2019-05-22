package commands;

import java.util.ArrayList;


public class DivisionTypeCommands extends TypeOfCommands{

	private ArrayList<String> commandTypes;
	
	public DivisionTypeCommands(){
		commandTypes = new ArrayList<String>();
		addTypes();
	}
	
	private void addTypes(){
		commandTypes.add("chapter");
		commandTypes.add("section");
		commandTypes.add("subsection");
		commandTypes.add("subsubsection");
	}
	
	
	public String addCommandType(String commandType){
		for (int i = 0; i < commandTypes.size(); i++){
			if(commandType.equals(commandTypes.get(i))){
				return "\\" + commandTypes.get(i) + "{" + "title" + "}\n";
			}
		
		}
		return null;
	}
	
	

	

}