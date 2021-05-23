public class Nike extends Footwear {

    public int size;
    public String color;
    public String name = "Nike";

    public Nike(){}

    public Nike(Nike brand){
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
        return new Nike(this);
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Nike) || !super.equals(obj)) return false;
        Nike brand = (Nike) obj;
        return brand.size == size && brand.color == color;
    }
}
