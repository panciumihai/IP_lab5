package lab5;

import java.util.ArrayList;

public class Administrator extends Persoana {

  public java.util.Vector cont;

    public ArrayList<Cont> conturi;
    
    Administrator()
    {
    }

  public void adaugaCont(Cont contNou) {
      conturi.add(contNou);
  }

  public void stergeCont(Cont cont){
      conturi.remove(cont);
  }

  public void modificaCont(Cont cont) {
      cont.setName = "Nume modificat";
  }
  
  public String toString()
  {
      return "Administrator";
      //return getNume();
  }

}