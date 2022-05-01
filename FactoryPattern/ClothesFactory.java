public class ClothesFactory {
    public Clothes manufacture(String name){
        Clothes clothes = null;

        if(name.equalsIgnoreCase("Shirt")){
            clothes = new ShirtClothes();
        }
        else if (name.equalsIgnoreCase("Hoodie")) {
            clothes = new HoodieClothes();
        }
        else {
            System.out.println(name + " are not manufactured.");
        }
        return clothes;
    }
}
