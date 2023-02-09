/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author subhan
 */
public class CompositionExample {
    public static void main(StringExample[] args) {  // Obyekt icinde obyekt anlayisi (Composition)
            User u = new User();//reference 111
     
            Student s = new Student();// reference 222
//            s.name1 = "Subhan";
            
             u.student= s;//reference 111 out:Subhan
             u.age++;//1
            System.out.println("Age:"+u.age);
//            System.out.println("Name:"+u.student.name1);
    }
    
}
