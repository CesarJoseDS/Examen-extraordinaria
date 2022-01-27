
package examenkilito.view;

import examenkilito.model.Catalogue;
import java.util.List;

public interface CatalogueLoader {
    public List<String> load(List<String> list);
    public Catalogue load(String name);
}
