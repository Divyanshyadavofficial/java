import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;

public class large_num {
    public static void main(String[] args) {

        BI();
        BD();


    }
     static void BD() {
      double x = 0.03;
      double y = 0.04;
      double ans = y-x;
      System.out.println(ans);

      BigDecimal X = new BigDecimal("0.03");
      BigDecimal Y = new BigDecimal("0.04");
      BigDecimal ans2 = Y.subtract(X);
      System.out.println(ans2);

      BigDecimal a = new BigDecimal("28288.9393898283");
      BigDecimal b = new BigDecimal("38939.2838929832");
      
      //operations

      System.out.println(b.add(a));
      System.out.println(b.subtract(a));
      System.out.println(b.multiply(a));
      System.out.println(b.divide(a,10,RoundingMode.HALF_UP));
      System.out.println(b.pow(2));

    }
    static void BI(){
        int a = 30;
        int b = 67;
        BigInteger A = BigInteger.valueOf(33);
        BigInteger B = BigInteger.valueOf(333212132);
        BigInteger C = new BigInteger("1233421");

        // constants 
        BigInteger D = BigInteger.ONE;
        

        //addition
        BigInteger s = A.add(B);

        //multiplication
        BigInteger m = C.multiply(A);

        //subtract
        BigInteger sub = C.subtract(A);

        //divide
        BigInteger div = C.divide(A);

        //remainder
        BigInteger rem = C.remainder(A);

        if(C.compareTo(A)<0){
            System.out.println("yes");
        }


        //printing
        System.out.println(a);
        System.out.println(b);
        System.out.println(A);
        System.out.println(B);
        System.out.println(C);
        System.out.println(D);
        System.out.println(s);
        System.out.println(m);
        System.out.println(sub);
        System.out.println(div);
        System.out.println(rem);

    }
}
