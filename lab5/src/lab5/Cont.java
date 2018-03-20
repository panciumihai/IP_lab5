package lab5;
import java.util.ArrayList;

public class Cont {

  public ArrayList<Poza> postari;
  public String nume;

  public ArrayList<Persoana> urmaritori;

  public int aprecieri;

  public ArrayList<Poveste> povesti;


  public void urmareste() {
      
  }

  public void adaugarePoza(Poza p) {
      postari.add(p);
  }

  public void aprecierePoza() {
      
  }

  public void stegePoveste(Poveste p) {
      povesti.remove(p);
  }

  public void adaugaPoveste(Poveste p) {
      povesti.add(p);
  }
  
    public String toString()
    {
        return "Cont";
    }
}