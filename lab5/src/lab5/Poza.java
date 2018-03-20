package lab5;
<<<<<<< HEAD

import java.util.Vector;
=======
import java.util.ArrayList;
>>>>>>> 4069c3370c89683cb3726dbebfbb67cdd5bc88ac

public class Poza extends Cont {

  public String continut;

  public Integer numarComentarii;

  public Integer numarAprecieri;

  public ArrayList<Comentariu> comentarii;

  
  public void setContinut(String continut) {
      this.continut = continut;
  }
  public String getContinut() {
      return continut;
  }
  public void setNumarComentarii(int numarComentarii) {
      this.numarComentarii = numarComentarii;
  }
  public int getNumarComentarii() {
      return numarComentarii;
  }
  
  public void setNumarAprecieri(int numarAprecieri) {
      this.numarAprecieri = numarAprecieri;
  }
  public int getNumarAprecieri() {
      return numarAprecieri;
  }
  public void apreciereComentariu() {
      System.out.println("Comentariul a fost apreciat!");
  }

  public void editareComentariu() {
      System.out.println("Comentariul a fost editat!");
  }

  public void comentarePoza() {
      System.out.println("Comentariul a fost postat!");
  }

    String getContinut() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    String getNumarAprecieri() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
  
  

}