public class Shoes{
    private char shoe_color;
    private boolean has_laces;
    private String shoe_material;

    public void setShoeColor(char shoe_color){
        this.shoe_color = shoe_color;
    }
    public void setShoeLaces(boolean has_laces){
        this.has_laces = has_laces;
    }
    public void setShoeMaterial(String material){
        this.shoe_material = material;
    }
    
    public char getShoeColor(){
        return this.shoe_color;
    }
    public boolean getShoeLaces(){
        return this.has_laces;
    }
    public String getShoeMaterial(){
        return this.shoe_material;
    }

    @Override
    public String toString(){
        return "Shoe Color: " + this.shoe_color + " | Shoe Laces: " + this.has_laces + " | Shoe Material: " + this.shoe_material;
    }
}