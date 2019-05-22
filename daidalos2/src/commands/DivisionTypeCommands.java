package commands;

import java.util.ArrayList;


public class DivisionTypeCommands{

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
	
	
	public String addDivisionTypeCommands(String commandType){
		for (int i = 0; i < commandTypes.size(); i++){
			if(commandType.equals(commandTypes.get(i))){
				return "\\" + commandTypes.get(i) + "{" + "title" + "}\n";
			}
		
		}
		return null;
	}
	
	

	

}