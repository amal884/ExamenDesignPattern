package compositePattern;

import entitiesOfClassDiagram.Entity;

import java.util.ArrayList;
import java.util.List;

public class Group extends Entity {

    private List<Entity> childs = new ArrayList<>();


    public Group(String name) {
        super(name);
    }

    public Entity  addComposant(Entity composant){
        composant.level= this.level+1;
        childs.add(composant);
        return composant ;
    }

    @Override
    public void show() {
        System.out.println(tab()+ "GroupClass  "+ name);

        for (Entity c : childs){
            c.show();
        }
    }

    }

