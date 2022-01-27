package examenkilito.Main;

import examenkilito.model.Catalogue;
import examenkilito.model.ElemPatrimonial;
import examenkilito.view.CatalogueDisplay;
import java.util.List;


public class MockCatalogDisplay implements CatalogueDisplay{

    @Override
    public void display(List<String> list) {
        System.out.println(list);
    }

    @Override
    public void display(Catalogue catalogue) {
        for (ElemPatrimonial e : catalogue.getList()) {
            System.out.println("-------------------------");
            display(e);
            System.out.println("-------------------------");
        }
    }

    @Override
    public void display(ElemPatrimonial e) {
        System.out.println("-Name: "+e.getName()+"\n-Position: "+e.getPosition()+"\n-Author: "+e.getAuthor()+"\n-Year of construction: "+e.getYear()+"\n-Method: "+e.getMethod()+"\n-Material: "+e.getMaterial()+"\n-Status: "+e.getStatus()+"\n-Pictures: "+ e.getPictures()+"\n-Type: "+e.getType());
    }
    
}
