import java.util.Arrays;


public class Main {

//    public static User u = new User();

    public static void main(StringExample[] args) {

        System.out.println(Arrays.toString(args));
        // Proyektde properties secb daha sonra Run sec oradan Arguments e isdediyimizi menimsede bilerk...

        User u = new User();
//    u.name1 = "Subhan";
//    u.surname1 = "Naghiyev";
//    u.age = 18;
//    u.education = "Azerbaijan Technical University";


        System.out.println(u.name1);
        System.out.println(u.surname1);
        System.out.println(u.education);
        System.out.println(u.age);


        User u1 = new User();
//           u1.name1 = "Cemi";

        Student s = new Student();
//            s.name = "Subhan";

        u1.student = s;

        System.out.println("Name:" + u1.student.name); // Obyekt icinde obyekt anlayisi (Composition)

        User u2 = new User();
        u2.setName("Subhan");
        u2.getName();
        System.out.println(u.getName());

    }

}
