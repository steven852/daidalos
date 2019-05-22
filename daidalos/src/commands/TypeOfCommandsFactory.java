package commands;

public class TypeOfCommandsFactory {
	
	public TypeOfCommandsFactory(){
		
	}
	
	public TypeOfCommands getType(String type){
		if(type.equalsIgnoreCase("Division")){		
			return new DivisionTypeCommands();
		}
		
		if(type.equalsIgnoreCase("List")){		
			return new ListTypeCommands();
		}
		
		if(type.equalsIgnoreCase("Table")){		
			return new TableTypeCommands();
		}
		
		if(type.equalsIgnoreCase("Figure")){		
			return new FigureTypeCommands();
		}
		
		return null;
	}

}
