public class ConverseBuilder implements ShoeBuilder{
    private Shoes shoe;
    public ConverseBuilder(){
        this.shoe = new Shoes();
    }

    @Override
    public void buildShoeColor(){
        this.shoe.setShoeColor('R');
    }

    @Override
    public void buildShoeLaces(){
        this.shoe.setShoeLaces(true);
    }

    @Override
    public void buildShoeMaterial(){
        this.shoe.setShoeMaterial("Canvas");
    }

    @Override
    public Shoes getShoes(){
        return this.shoe;
    }
}