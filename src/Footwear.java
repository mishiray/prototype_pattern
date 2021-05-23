public abstract class Footwear {
    public int size;
    public String color;
    public String name;

    public Footwear(){

    }

    public Footwear(Footwear brand){
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
    public abstract Footwear clone();

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Footwear)) return false;
        Footwear brand = (Footwear) obj;
        return brand.size == size && brand.color == color;
    }
}
