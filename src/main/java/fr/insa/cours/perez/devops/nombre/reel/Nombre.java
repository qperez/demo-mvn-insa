package fr.insa.cours.perez.devops.nombre.reel;

public class Nombre {
    private Double valeur;

    public Nombre(Double valeur){
        this.valeur = valeur;
    }

    public Double diviser(Double diviseur){
        if(Double.compare(diviseur, 0d) == 0 ||
                Double.isNaN(diviseur) ||
                Double.isInfinite(diviseur) ){
            throw new NumberFormatException("Exception Message");
        }
        return valeur / diviseur;
    }
}
