package commands;

import java.util.ArrayList;


public class FigureTypeCommands{

	private ArrayList<String> command_types;
	
	public FigureTypeCommands(){
		command_types = new ArrayList<String>();
		addTypes();
	}
	
	private void addTypes(){
		command_types.add("figure");
	}
	
		
	public String addFigureTypeCommands(String command_type){
		String figure_command;
		for (int i = 0; i < command_types.size(); i++){
			if(command_type.equals(command_types.get(i))){
				figure_command = "\\begin{" + command_types.get(i) +"}\n";
				figure_command = figure_command + "\\includegraphics[width=... ,height=...]\n";
				figure_command = figure_command + "\\caption{..}\\label{...}\n";
				figure_command = figure_command + "end{figure}\n";
				
				return figure_command;
			}
			
			
		}
		return null;
	}
	

}