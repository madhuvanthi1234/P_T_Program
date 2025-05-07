public class Exception {
    public static void main(String[]args){
        int a=5;
        int b=0;
        try{
            divide(a,b);
        }
        catch(ArithmeticException e){
            System.out.println(e.getMessage());
        }
        finally{
            System.out.println("it will always execute");

        }
    }
        static int divide(int a,int b)throws ArithmeticException{
            if(b==0){
                throw new ArithmeticException("cant divide by 0");
            }
            return a/b;
        }
    }

