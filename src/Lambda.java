public class Lambda
{
    public static void main(String[] args) {

MathOperation mathOperation=(int a,int b)-> System.out.println(a+b);
MathOperation.operate(6,4,mathOperation);
    }
    interface MathOperation{
        void operation(int a ,int b) ;
       static void operate(int a, int b, MathOperation mathOperation){
            mathOperation.operation(a,b);
        }
    }
}
