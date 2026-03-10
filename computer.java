class computer{
    String color="Grey";
    int ram=16;
    double price=14500;


     void writecode()
    {
        System.out.println("I am learning coding ");
    }
    public static void main(String[]args){
        computer ob= new computer();
        System.out.println(ob.color);
        System.out.println(ob.ram);
        System.out.println(ob.price);
        ob.writecode();
    }
}