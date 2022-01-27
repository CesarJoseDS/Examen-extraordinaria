package examenkilito.Main;

import examenkilito.model.Catalogue;
import examenkilito.model.ElemPatrimonial;
import examenkilito.view.CatalogueLoader;
import java.util.ArrayList;
import java.util.List;


public class MockCatalogLoader implements CatalogueLoader{
    private final List<ElemPatrimonial> churchs;
    private final List<ElemPatrimonial> buildings;
    private final List<ElemPatrimonial> bridges;

    public MockCatalogLoader() {
        //create Patrimonial elements
        ElemPatrimonial c1 = new ElemPatrimonial("Galdar", "Iglesia de Santiago", "Juan", 1000, "gotic", "stone", "good", "fotoS1.jpg, fotoS2,jpg", "church");
        ElemPatrimonial b1 = new ElemPatrimonial("Las Palmas", "Museo Elder", "Paco", 1500, "unknown", "stone", "good", "fotoM1.jpg, fotoM2,jpg", "building");
        ElemPatrimonial b2 = new ElemPatrimonial("Galdar", "Ayuntamiento", "Manolo", 1500, "gotic", "stone", "good", "fotoA1.jpg, fotoA2,jpg", "building");
        ElemPatrimonial br1 = new ElemPatrimonial("Norte de la isla", "Puentes de silva", "Fran", 1900, "unknown", "stone", "good", "fotoP1.jpg, fotoP2,jpg", "bridge");
        
        
        
        churchs = new ArrayList<ElemPatrimonial>();
        buildings = new ArrayList<ElemPatrimonial>();
        bridges = new ArrayList<ElemPatrimonial>();
        churchs.add(c1);
        buildings.add(b1);
        buildings.add(b2);
        bridges.add(br1);
    
    }
    
    
    
    @Override
    public List<String> load(List<String> list) {
        return list;
    }

    @Override
    public Catalogue load(String name) {//devolvemos
        switch (name) {
            case "Churchs":
                return new Catalogue(name, churchs);
            case "Buildings":
                return new Catalogue(name, buildings);
            case "Bridges":
                return new Catalogue(name, bridges);
            default:
                return null;
        }
    }
    
    public List<String> getLists(){
        List<String> lists = new ArrayList<>();
        lists.add("Churchs");
        lists.add("Buildings");
        lists.add("Bridges");
        return lists;
    }
}
