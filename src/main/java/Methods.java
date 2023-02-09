

public class Methods {
    public static void main(String[] args) {
//    Hesablama(10,6,2);
//    Soz("World");
//    foo();
//      System.out.println("End:"+dortcik(ikiletopla(ucilecarp(4))));
//      toplama(3,4,5);
//      toplama(3,4);
//      toplama(20,3,5,6);
//        SkorHesabla("John ",100);
//        SkorHesabla("John ");
        skorHesabla(85);
        
      
              
    }

     public static void Soz(StringExample s) {
         System.out.println("Hello "+s);
        
        
        }
    // void types
    public static void foo(){
        System.out.println("Foo is Methods types");
    }
    public static void hesablama(int a,int b,int c){
        System.out.println("Hesab:"+(a*b*c));
        System.out.println("Hesab:"+(a+b+c));
        System.out.println("Hesab:"+(a-b-c));
    }
    // return types
     public static int ucIleCarp(int a){
        return a*3;
    }
    public static int ikIleTopla(int a){
        return a+2;
    }
    public static int dortCik(int a){
        return a-4;
    }
  // Methods Overloading
    public static void toplama(int a,int b, int c){
        System.out.println("End 1:"+(a+b+c));
    }
    public static void toplama(int a,int b){
        System.out.println("End 2:"+(a-b));
    }
    public static void toplama(int a,int b, int c, int d){
        System.out.println("End 3:"+(a*b+c-d));
    }
    public static void skorHesabla(StringExample ad, int a){
        System.out.println(ad+" adli oyuncunun puani:"+a);
    }
    public static void skorHesabla(StringExample ad){
        System.out.println(ad+" adli oyuncunun puani:"+"Unknown");
    }
    public static void skorHesabla(int a){
        System.out.println("Nameless"+" adli oyuncunun puani:"+a);
    }
    
     
}
     

    

