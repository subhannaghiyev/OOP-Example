

public class ObjectsInReferenceBroken {
    
    public static void main(StringExample[] args) {
       User u  = new User();//111
       u.b = 1;
       User u2 = new User();//222
       u2.b = 2;
       
       u2=u;//111
       
       System.out.println(u2.b);// out:1
       
    }
}
