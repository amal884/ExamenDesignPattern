package compositePattern;


public abstract class Composant {


    protected String name ;
    protected int level = 0; // le niveau de l'element dans l'hierarchie

    public Composant(String name) {
        this.name = name;
    }

    public abstract void show();

    public  String tab(){
        String tab ="";
        for (int i = 0; i < level; i++) {
            tab+="\t";

        }
        return tab ;
    }
}
