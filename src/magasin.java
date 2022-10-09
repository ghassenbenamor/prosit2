public class magasin {

    // attributes
    private int id;
    private String adress;
    private int capacity;
    private produit produits[];
     final int maxCapacity = 50;

    //constructors

    public magasin() {

    }
    public magasin (int id, String adress) {
        this.id = id;
        this.adress = adress;
        this.capacity = 0;
        this.produits = new produit[maxCapacity];
    }

    //getters

    public int getId() {
        return id;
    }

    public String getAdress() {
        return adress;
    }



    //setters

    public void setId(int id) {
        this.id = id;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }


    // methods

    public void addProduct (produit produit) {
        if (capacity<maxCapacity) {
         produits[capacity] =  produit;
         capacity++;
        }
    }

    public void showMagasin () {
        System.out.println(this);
        for (int i = 0; i< capacity; i++) {
            System.out.println(produits[i]);

        }
        System.out.println("}");    }


    public void total () {
        System.out.println(this.capacity);
    }

    @Override
    public String toString() {
        return "Magasin{" + "id=" + id + ", address=" + adress + ", capacite=" + capacity + ", CAPACITE_MAX=" + maxCapacity + ", produits = {";
    }

}
