public class Main{
    public static void main(String[]args){
        // "this" keyword is used so you dont need to reassign because all changes happen to the same instance that called it.
        ShoeBuilder croc_builder = new CrocsBuilder()
                                    .buildShoeColor()
                                    .buildShoeLaces()
                                    .buildShoeMaterial();
        Shoes croc = croc_builder.getShoes();
        ShoeBuilder converse_builder = new ConverseBuilder()
                                        .buildShoeColor()
                                        .buildShoeLaces()
                                        .buildShoeMaterial();
        Shoes converse = converse_builder.getShoes();
        System.out.println(croc);
        System.out.println(converse);
    }    
}