package commands;

import java.util.ArrayList;


public class ListTypeCommands{

	private ArrayList<String> commandTypes;
	
	public ListTypeCommands(){
		commandTypes = new ArrayList<String>();
		addTypes();
	}
	
	private void addTypes(){
		commandTypes.add("itemize");
		commandTypes.add("enumerate");
	}
	
		
	public String addListTypeCommands(String commandType){
		String listCommand;
		for (int i = 0; i < commandTypes.size(); i++){
			if(commandType.equals(commandTypes.get(i))){
				listCommand = "\\begin{" + commandTypes.get(i) +"}\n";
				for(int j = 0; j < 3; j++){
					listCommand = listCommand + "\\item ...\n";
				}
				listCommand = listCommand + "end\\{" + commandTypes.get(i) + "}\n";
				
				return listCommand;
			}
		
		}
		return null;
	}
	

}