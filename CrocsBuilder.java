public class CrocsBuilder implements ShoeBuilder{
    private Shoes shoe;
    public CrocsBuilder(){
        this.shoe = new Shoes();
    }

    @Override
    public void buildShoeColor(){
        this.shoe.setShoeColor('B');
    }

    @Override
    public void buildShoeLaces(){
        this.shoe.setShoeLaces(false);
    }

    @Override
    public void buildShoeMaterial(){
        this.shoe.setShoeMaterial("Foam");
    }

    @Override
    public Shoes getShoes(){
        return this.shoe;
    }
}