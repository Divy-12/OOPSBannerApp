public class Computer1 {

    
    String color="Grey";
    int ram=16;
    double price=14500;


     void writecode()
    {
        System.out.println("I am learning coding ");
    }
    public static void main(String[] args){
        Computer1 ob= new Computer1();
        System.out.println(ob.color);
        System.out.println(ob.ram);
        System.out.println(ob.price);
        ob.writecode();
    }

    
}
