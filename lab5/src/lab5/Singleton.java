/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5;

/**
 *
 * @author Mihai
 */
class Singleton extends Administrator{
   private static Singleton singleton = new Singleton( );

   private Singleton() { }

   public static Singleton getInstance( ) {
      return singleton;
   }

   protected static void method( ) {
      System.out.println("demoMethod for singleton");
   } 
}
