package commands;

import java.util.ArrayList;


public class TableTypeCommands{

	private ArrayList<String> commandTypes;
	
	public TableTypeCommands(){
		commandTypes = new ArrayList<String>();
		addTypes();
	}
	
	private void addTypes(){
		commandTypes.add("table");
	}
	
		
	public String addTableTypeCommands(String commandType){
		String tableCommand;
		for (int i = 0; i < commandTypes.size(); i++){
			if(commandType.equals(commandTypes.get(i))){
				tableCommand = "\\begin{" + commandTypes.get(i) +"}\n";
				tableCommand = tableCommand + "\\caption{...}\\label{...}\n";
				tableCommand = tableCommand + "\\begin{tabular}{c|c|c}\n";
				tableCommand = tableCommand + "\\hline\n" + "...&...&... \\\\ \n" + "\\hline\n";
				tableCommand = tableCommand + "end{tabular}\n" + "\\end{" + commandTypes.get(i) +"}\n";
				
				return tableCommand;
			}
			
			
		}
		return null;
	}
	

}