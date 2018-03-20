package lab5;

import java.util.ArrayList;

public class Administrator extends Persoana {

       private static Administrator singleton = new Administrator();
       
  public java.util.Vector cont;
    public ArrayList<Cont> conturi;

   public static Administrator getInstance( ) {
      return singleton;
   }
   
    protected static void method( ) {
       
      System.out.println("demoMethod for singleton");
   }
    
    Administrator()
    {
    }

  public void adaugaCont(Cont contNou) {
      conturi.add(contNou);
  }

  public void stergeCont(Cont cont){
      conturi.remove(cont);
  }

  public void modificaCont(Cont c) {
      
  }
  
  public String toString()
  {
      return "Administrator";
      //return getNume();
  }

}