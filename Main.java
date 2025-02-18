public class Main{
    public static void main(String[]args){
        ShoeBuilder croc_builder = new CrocsBuilder();
        croc_builder.buildShoeColor();
        croc_builder.buildShoeLaces();
        croc_builder.buildShoeMaterial();
        Shoes croc = croc_builder.getShoes();
        ShoeBuilder converse_builder = new ConverseBuilder();
        converse_builder.buildShoeColor();
        converse_builder.buildShoeLaces();
        converse_builder.buildShoeMaterial();
        Shoes converse = converse_builder.getShoes();
        System.out.println(croc);
        System.out.println(converse);
    }    
}