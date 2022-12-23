package entitiesOfClassDiagram;

import java.util.ArrayList;
import java.util.List;

public class Enum extends Entity {


    private List<String> valeurs = new ArrayList<>();

    public Enum(String name) {
        super(name);
    }

    @Override
    public void show() {

    }

    public List<String> getValeurs() {
        return valeurs;
    }

    public void setValeurs(List<String> valeurs) {
        this.valeurs = valeurs;
    }
}
