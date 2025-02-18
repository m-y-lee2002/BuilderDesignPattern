public class ConverseBuilder implements ShoeBuilder{
    private Shoes shoe;
    public ConverseBuilder(){
        this.shoe = new Shoes();
    }

    @Override
    public ShoeBuilder buildShoeColor(){
        this.shoe.setShoeColor('R');
        return this;
    }

    @Override
    public ShoeBuilder buildShoeLaces(){
        this.shoe.setShoeLaces(true);
        return this;
    }

    @Override
    public ShoeBuilder buildShoeMaterial(){
        this.shoe.setShoeMaterial("Canvas");
        return this;
    }

    @Override
    public Shoes getShoes(){
        return this.shoe;
    }
}