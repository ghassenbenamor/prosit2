public class main {
    public static void main(String[] args) {
        produit p1 = new produit(1021,"lait","delice");
        produit p2 = new produit(2510,"yaourt","vitalait");
        produit p3 = new produit(3250,"tomate","sicam",1.250);
        magasin m1 = new magasin(1,"rades");
        m1.addProduct(p1);
        m1.addProduct(p2);
        m1.addProduct(p3);
        m1.showMagasin();
        m1.total();
        m1.showMagasin();
    }
}
