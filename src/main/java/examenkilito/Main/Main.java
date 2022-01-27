package examenkilito.Main;

import examenkilito.control.Command;
import examenkilito.control.LoadPathElemCommand;
import examenkilito.control.NullCommand;
import examenkilito.control.SelectTypeCommand;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        new Main().execute();
    }
    private MockCatalogDisplay display;
    private MockCatalogLoader loader;
    private Map<String,Command> commands; 
    
    private void execute(){
        display = new MockCatalogDisplay();
        loader = new MockCatalogLoader();
        commands = commandsInit();
        Scanner scanner = new Scanner(System.in);
        
        while(true){
            System.out.println("Flags:\nl -- List all available patrimonials elements\ns -- select a patrimonial type\ne -- exit");
            commands.getOrDefault(scanner.nextLine(), NullCommand.instance).execute();
        }
    }
    
    /**
     * Commands ->  l -- list all the Patrimonials Elements available 
     *              s -- Select type of elementPatrimonial
     * @return 
     */
    private Map<String,Command> commandsInit(){
    Map<String,Command> commands = new HashMap<>();
    commands.put("l",new LoadPathElemCommand(loader, display, loader.getLists()));
    commands.put("s",new SelectTypeCommand(loader, display, loader.getLists()));
    commands.put("e",new Command(){
        @Override
        public void execute(){
            System.exit(0);
        }
    });
  
    return commands;
    }
}
