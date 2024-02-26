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