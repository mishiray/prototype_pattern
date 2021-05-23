public class Adidas extends Footwear {

    public int size;
    public String name = "Adidas";

    public String color;

    public Adidas(){}

    public Adidas(Adidas brand){
        super(brand);
        if(brand!=null){
            this.size = brand.size;
            this.color = brand.color;
        }
    }

    public int getSize() {
        return size;
    }

    public String getColor() {
        return color;
    }

    public String getName() {
        return name;
    }

    @Override
    public Footwear clone() {
        return new Adidas(this);
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Adidas) || !super.equals(obj)) return false;
        Adidas brand = (Adidas) obj;
        return brand.size == size && brand.color == color;
    }
}
