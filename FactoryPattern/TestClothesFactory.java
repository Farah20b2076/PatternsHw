public class TestClothesFactory {
    public static void main(String[] args) {
        ClothesFactory ClothesFactory = new ClothesFactory();
        Clothes shirt = ClothesFactory.manufacture("Shirt");
        if (shirt != null)
            shirt.getClothes();
        Clothes hoodie = ClothesFactory.manufacture("Hoodie");
        if (hoodie != null)
            hoodie.getClothes();
        Clothes dress = ClothesFactory.manufacture("Dress");
        if (dress != null)
            dress.getClothes();
    }
}
