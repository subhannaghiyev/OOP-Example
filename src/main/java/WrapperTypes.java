
import java.util.Random;
import java.lang.String;
import java.util.Scanner;


public class WrapperTypes {
    public static void main(String[] args) {
        Integer i = 6;// Refernce 111 // Boxing
        int i2 = i;   // Unboxing
//       System.out.println("Ilk Cavab"+i);

        Integer i3 = 6;// Reference 111

        Integer i4 = new Integer(7); // Refernce 222
        Integer i5 = new Integer(7); // Reference 333
//        System.out.println("i==i3?"+(i==i3));
//        System.out.println("i4==i5?"+(i4==i5));
//        System.out.println("i==i5?"+(i==i5));
//        System.out.println("i==i3?"+(i==i3));

        String l = "Hello";
//        String a = l.replace("l", "S");
//        String a1 = l.replaceAll("Hello", "Subhan");
        char a2[] = l.toCharArray();
//        System.out.println("Cavab:"+a);
//        System.out.println("Cavab::"+a1);
        for (int j = 0; j < a2.length; j++) {
            System.out.println("Array:" + a2[j]);
        }
        StringBuffer r = new StringBuffer();
        r.append("Subhan");
        r.append("Naghiyev");
        System.out.println(r);
        StringBuilder t = new StringBuilder();
        t.append("Azerbaijan Technical University");
//          t.append(" Information Technology");
//          System.out.println(t);


        System.out.println(WrapperTypes.Random(1, 5));


        double a = Math.cbrt(27);
//        System.out.println(a);
        double x = 27;
//        System.out.println("Math.cbrt(" + x + ")=" + Math.cbrt(x));
        double max = Math.max(100, 45);
//        System.out.println("Max:"+max);
        double floor = Math.floor(4.5);
        double round = Math.round(4.5);
        double ceil = Math.ceil(4.4);
//        System.out.println("Floor:"+floor); // Hemise asagiya dogru yuvarlaqlasdirir.!
//        System.out.println("Round:"+round); // Normal yuvarlaqlasdirir.!
//        System.out.println("Ceil:"+ceil); // Hemise yuxariya yuvarlaqlasdirir.!
        double random = Math.random();
//        System.out.println("Random Numbers:"+random);
//        System.out.println("Random Numbers:"+ Random(1,100));
//        System.out.println("Random Numbers:"+ Random(1,100));
//        System.out.println("Random Numbers:"+ Random(1,100));
//        System.out.println("Random Numbers:"+ Random(1,100));
//        System.out.println("Random Numbers:"+ Random(1,100));
//        System.out.println("Random Numbers:"+ Random(1,100));
//        
    }

    public static int Random(int low, int high) {
        Random r = new Random();
        int Result = r.nextInt(high - low) + low;
        return Result;
    }

    public static void Integer() {
        int i = 5;
        Integer i2 = new Integer(100);
        int a = i2.compareTo(100);
        int m = Integer.compare(4, 5);
        System.out.println(m);
//        System.out.println(a);
        double b = 5.5;
        Double d = new Double(5.5);// Obyekt yaradiriq.
    }

}

    
    
    
    


