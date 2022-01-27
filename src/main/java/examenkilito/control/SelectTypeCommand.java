package examenkilito.control;

import examenkilito.view.CatalogueDisplay;
import examenkilito.view.CatalogueLoader;
import java.util.List;
import java.util.Scanner;


public class SelectTypeCommand implements Command{
    private final CatalogueLoader loader;
    private final CatalogueDisplay display;
    private final List<String> catalogue;

    public SelectTypeCommand(CatalogueLoader loader, CatalogueDisplay display, List<String> catalogue) {
        this.loader = loader;
        this.display = display;
        this.catalogue = catalogue;
    }

    @Override
    public void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write the type of Monument");
        String type = scanner.nextLine();
        
        for (String string : catalogue) {
            if (string.equals(type)) {
                display.display(loader.load(type));
            }
        }
        
        
        
    }
    
    
    
}
