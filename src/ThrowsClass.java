public class ThrowsClass {

    public static void main(String[] args) {
        A obj= new A();
        try{
            obj.print1();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

}
class A{
    public   void print1() throws Exception{
       print3();

    }
    public void print2() throws  Exception{
        System.out.println("AAAAA");

    }
    public void print3() throws  Exception{

        int a=10;
        int b=1;
        int c=a/b;
        print2();
    }
}
