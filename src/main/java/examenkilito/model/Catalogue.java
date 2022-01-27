package examenkilito.model;

import java.util.List;


public class Catalogue {
    private final String type;
    private final List<ElemPatrimonial> list;

    public Catalogue(String type, List<ElemPatrimonial> list) {
        this.type = type;
        this.list = list;
    }

    public String getType() {
        return type;
    }

    public List<ElemPatrimonial> getList() {
        return list;
    }
    
}
