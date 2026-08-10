public class Overriding{
    public static void main(String[] args){
        Mother2 m1 = new Mother2();
        m1.show();
        Mother2 m2 = new Child2();
        m2.show();
        Child2 m3 = new Child2();
        m3.show();
        
    }
}