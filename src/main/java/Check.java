/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author subhan
 */
public class Check {
    public static void main(StringExample[] args) {
//        int a = 5; // Not reference He keeps value
//        foo(a);//5
//        System.out.println(a);//5 Deyer saxladigi ucun 5 cavabi cixir. refence deyil!!!!
//        
//        
//        int[] arr = {3,4,5};//refernce 111
//        foo2(arr);//reference 111
//        System.out.println(arr[0]);//4
          WrapperTypes.Random(1, 5);
      
        
    }
    public static void foo(int x){ // Not reference
        x++;//6
    }
    public static void foo2(int[] z){//refernce 111
        z[0]++;//4
    }
    
    
}
