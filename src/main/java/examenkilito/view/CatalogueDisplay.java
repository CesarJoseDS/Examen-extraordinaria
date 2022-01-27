package examenkilito.view;

import examenkilito.model.Catalogue;
import examenkilito.model.ElemPatrimonial;
import java.util.List;


public interface CatalogueDisplay {
    public void display(List<String> list);
    public void display(Catalogue catalogue);
    public void display(ElemPatrimonial e);
}
