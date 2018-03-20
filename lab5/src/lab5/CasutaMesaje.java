package lab5;

import java.util.ArrayList;

public class CasutaMesaje {

  public ArrayList<Mesaj> mesaje;


  public ArrayList<Mesaj> getConversatie() {
      return mesaje;
  }

  public void stergeConversatie() {
          mesaje.clear();
  }
  
  public String toString()
  {
      return "Casuta Mesaj";
  }

}