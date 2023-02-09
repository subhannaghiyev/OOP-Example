

public class StringExample {
    public static void main(String[] args) {

        StringExample s1 = new StringExample();
        StringExample s2 = new StringExample();
        String s3 = "Salam";
        String s4 = "Salam";
        System.out.println(s1 == s2);
        System.out.println(s3 == s4);
        IntegerEquals(128, 128);
        StringEquals("Subhan", "Subhan");


    }

    public static void IntegerEquals(Integer i, Integer i2) {
        System.out.println(i.equals(i2));
    }

    public static void StringEquals(String i3, String i4) {
        System.out.println(i3.equals(i4));
    }
}
        
        
    

