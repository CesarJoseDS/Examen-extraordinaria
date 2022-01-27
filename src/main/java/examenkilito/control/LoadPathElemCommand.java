package examenkilito.control;

import examenkilito.view.CatalogueDisplay;
import examenkilito.view.CatalogueLoader;
import java.util.List;


public class LoadPathElemCommand implements Command{
    private final CatalogueLoader loader;
    private final CatalogueDisplay display;
    private final List<String> catalogue;

    public LoadPathElemCommand(CatalogueLoader loader, CatalogueDisplay display, List<String> catalogue) {
        this.loader = loader;
        this.display = display;
        this.catalogue = catalogue;
    }

    @Override
    public void execute() {
        display.display(loader.load(catalogue));
    }
    
    
}
