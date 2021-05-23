import java.util.ArrayList;
import java.util.List;

public class testClass {

    public static void clone(List<Footwear> brands, List<Footwear> brandcopys){
        for (Footwear brand : brands) {
            brandcopys.add(brand.clone());
        }

        for (int i = 0; i < brands.size(); i++) {
            System.out.println("Brand = "+brands.get(i).getName());
            System.out.println("Color: "+brands.get(i).getColor());
            System.out.println("Size: "+brands.get(i).getSize());
            System.out.println("---------------------------------------------------");
            System.out.println("Brand Clone= "+brandcopys.get(i).getName());
            System.out.println("Clone Color: "+brandcopys.get(i).getColor());
            System.out.println("Clone Size: "+brandcopys.get(i).getSize());
        }
    }

    public static void main(String[] args) {

        List<Footwear> footwearList = new ArrayList<>();
        List<Footwear> footwearListCopy = new ArrayList<>();

        Adidas adidas = new Adidas();
        adidas.size = 40;
        adidas.color = "red";
        footwearList.add(adidas);

        Nike nike = new Nike();
        nike.size = 44;
        nike.color = "blue";
        footwearList.add(nike);

        clone(footwearList,footwearListCopy);
    }
}
