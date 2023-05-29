package gr.uaeb.cf.ch5;

public class FloatDoubleExpressions {
    public static void main(String[] args) {
        double num1 = 12.5;
        double num2 = 2.0;
        double result =0.0 ;
        double mod = 0.0 ;

        result = num1/num2;
        mod = num1%num2;
        System.out.printf("%.2f  kai %.2f ", result,mod); //.2f gia 2 dekadika psifia
    }
}
