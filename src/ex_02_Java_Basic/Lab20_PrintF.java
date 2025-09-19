package ex_02_Java_Basic;

public class Lab20_PrintF {
    public static void main(String[] args) {

        int a= 10;
        int b= 20;
        //System.out.println(a);
       //System.out.println(b);
          System.out.printf("value of a=%d",a);
          System.out.println();
          System.out.printf("Value of b=%d",b);

        //%d -> int,byte,long,short, -datatype - it will replace the value
        // %s -> string
        //%f -> float,double,
        // %b -> bollean
        System.out.println();
        int table = 9;
        System.out.printf("%d * 1= %d",table,table*1);

    }
}
