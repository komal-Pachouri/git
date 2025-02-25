public class Nestedif {
    public static void main(String[] args) {
        int a,b,c,sum,mul,div;
        a=2;
        b=12;
        c=34;
        if(a>=5){
            if(a==5){
                sum=a+b;
                System.out.println("sum of a and b "+sum);

            }
            else{
                mul=b*c;
                System.out.println("Product of b and c"+mul);
            }
        }
        else{
             div=b/c;
             System.out.println("Divisor of b and c"+div);
        }
    }
}
