abstract class parent{
    abstract void career();
    void makesound(){
        System.out.println("sleeping");
    }
}
class son extends parent{
      void career(int age){
        System.out.println("age"+age);
      }
}
class daughter extends parent{
    void career(){
        System.out.println("engineer");
    }
}


public class Main{
    public static void main(String[]args){
        parent p=new son();
        p.career();
        daughter d=new daughter();
        d.career();
    }
}