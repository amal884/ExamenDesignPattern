package entitiesOfClassDiagram;

import java.util.ArrayList;
import java.util.List;

public class Interface extends Entity {


//     static method ?
    private List<Method> methods = new ArrayList<>();

    public Interface(String name) {
        super(name);
    }

    @Override
    public void show() {

    }



    // getters and setters avec le method status est abstract


    public List<Method> getMethods() {
        return methods;
    }

    // il faut ajouter methode par methode et faire add dans la list methode et changer
    //l'etat de la methode en abstract . mains il n'est pas de temps pour faire tous ca

    public void setMethods(List<Method> methods) {

        this.methods = methods;
    }
}
