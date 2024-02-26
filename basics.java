//boilerplate code
//typed language

import java.util.*;

public class basics {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        
        // long l = 23;
        // int num = l;

        //type conversion - implicit conversion - widening
        // destination type > source type

        int num = 1;
        long l = num, jam;
        jam = s.nextInt();

        //type casting - explicit converion - narrowing
        float f = 25.12f;
        int abc = (int)f;

        //type promotion
        //byte, short , char converted to int in expression
        byte n1 = 1;
        char n2 = 'c';
        short n3 = 12;
        short n4 = (short) (n1+n2+n3);

        //long, float, double converted long, float, double
        float f1 = 12.12f;
        double f2 = 12.21223;
        long d1 = 1212;
        double d2 = f1+f2+d1;

        int a = s.nextInt();
        float r = s.nextFloat();
        float ar = 3.14f * r * r; // by default its double
        System.out.print(ar);

        System.out.println("Hello World new!");
        System.out.print("\n1 2 3\n");

        Scanner sc = new Scanner(System.in);
        String  ip = sc.next(); // until space 
        String n = sc.nextLine();
        System.out.println(ip);
        System.out.println(n);
        //next nextLine
        //nextByte nextBoolean
        //nextShort
        //nextInt nextLong
        //nextFloat nextDouble
    }

    public class another {
         
    }
}