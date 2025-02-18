public class CrocsBuilder implements ShoeBuilder{
    private Shoes shoe;
    public CrocsBuilder(){
        this.shoe = new Shoes();
    }

    @Override
    public ShoeBuilder buildShoeColor(){
        this.shoe.setShoeColor('B');
        return this;
    }

    @Override
    public ShoeBuilder buildShoeLaces(){
        this.shoe.setShoeLaces(false);
        return this;
    }

    @Override
    public ShoeBuilder buildShoeMaterial(){
        this.shoe.setShoeMaterial("Foam");
        return this;
    }

    @Override
    public Shoes getShoes(){
        return this.shoe;
    }
}