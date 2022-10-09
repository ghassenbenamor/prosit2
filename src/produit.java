public class produit {
    private int id;
    private double prix;
    private String label;
    private String marque;


    public produit(){
    }
    public produit(int id, String label, String marque) {
        this.id=id;
        this.label=label;
        this.marque=marque;
    }
    public produit(int id, String label, String marque, double prix) {
        this.id=id;
        this.label=label;
        this.marque=marque;
        this.prix=prix;
    }


    public int getId() {
        return id;
    }

    public String getLabel() {
        return label;
    }

    public String getMarque() {
        return marque;
    }

    public double getPrix() {
        return prix;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public void afficherProduit() {
        System.out.println(this.toString());
    }

    @Override
    public String  toString() {
        return ("produit =  { " + "" + id + "," + label +"," + marque + ","+ prix + " }" );
    }
}
