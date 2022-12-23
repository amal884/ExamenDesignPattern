package entitiesOfClassDiagram;

import enumeration.methodStatus;
import enumeration.visibiliteStatus;

import java.util.ArrayList;
import java.util.List;

public class Method {
    private String nom ;
    private String type ;
    private visibiliteStatus visibiliteStatus;
    private methodStatus methodStatus;
    private List<Parameters> parameters = new ArrayList<>();

    public Method(String nom, String type, enumeration.visibiliteStatus visibiliteStatus, enumeration.methodStatus methodStatus, List<Parameters> parameters) {
        this.nom = nom;
        this.type = type;
        this.visibiliteStatus = visibiliteStatus;
        this.methodStatus = methodStatus;
        this.parameters = parameters;
    }


    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public enumeration.visibiliteStatus getVisibiliteStatus() {
        return visibiliteStatus;
    }

    public void setVisibiliteStatus(enumeration.visibiliteStatus visibiliteStatus) {
        this.visibiliteStatus = visibiliteStatus;
    }

    public enumeration.methodStatus getMethodStatus() {
        return methodStatus;
    }

    public void setMethodStatus(enumeration.methodStatus methodStatus) {
        this.methodStatus = methodStatus;
    }

    public List<Parameters> getParameters() {
        return parameters;
    }

    public void setParameters(List<Parameters> parameters) {
        this.parameters = parameters;
    }
}
