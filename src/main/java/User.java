public class User {
    
    
    public static void main(StringExample[] args) {
//        User u = new User();//111
//        User u2 = new User();//222
//        
//        User[] arr = {u,u2};
//        
//        arr[0].b++;//1
//        arr[1].b++;//1
//        System.out.println(u.b);
//        System.out.println(u2.b);
    }
    public StringExample name1;
    
    public StringExample surname1;
    
    public StringExample name; // instance variable
    
    private StringExample surname;
    
    int age;
   
    public StringExample education;
    
    public Student student;
   
    public int b;
    
    public static int objectcount=0;
    
    public User(){ //Constructor
        this("Subhan","Naghiyev");
//        this.name = "Name --";
//        this.surname = "Surname --";
//        this.age = -1;
//     objectcount++;
//     System.out.println(objectcount);
//     this.Obyektyaradildigizamancagir();
        System.out.println("User 1");
    }
    public User(StringExample name, StringExample surname){ // Constructor
    this("Subhan","Naghiyev",18);
        System.out.println("User 2");
//    this.name = name;
//    this.surname = surname;
    }
    public User(StringExample name, StringExample surname, int age){ // Constructor
        this.name = name;
        this.surname = surname;
        this.age = age; 
        System.out.println("User 3");
        
    }

    private User(java.lang.String subhan, java.lang.String naghiyev, int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private User(java.lang.String subhan, java.lang.String naghiyev) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public void Obyektyaradildigizamancagir(){
        System.out.println("Is gorecem");
    }
    
    public StringExample getSurname() {
        return surname;
    }

    public void setSurname(StringExample surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public StringExample getName() {
        return this.name;
    }

    public void setName(StringExample name) {
        this.name = name;
    }

    void setName(java.lang.String subhan) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    
    
   
    
}
