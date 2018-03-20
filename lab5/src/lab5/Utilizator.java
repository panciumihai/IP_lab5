package lab5;
import java.util.ArrayList;

public class Utilizator extends Persoana {

  public Integer numarUrmaritori;

    public ArrayList<Persoana>  myPersoana;
    public Cont  myCont;
    public ArrayList<Mesaj>  myCasutaMesaje;
    
  public int getNumarUrmaritori() {
      return numarUrmaritori;
  }
  public void setNumarUrmaritori(int numarUrmaritori) {
      this.numarUrmaritori = numarUrmaritori;
  }

  public void urmareste(Persoana p) {
      System.out.println("Ai inceput sa urmaresti utilizatorul p!");
      
  }

  public void modificareDate() {
       System.out.println("Ai modificat datele!");
  }

  public void stergeComentariu() {
      System.out.println("Ai sters comentariul!");
  }

  public void acceptareUrmarire() {
      System.out.println("Ai acceptat cererea de urmarire!");
  }

  public void respingeUrmarire() {
      System.out.println("Ai respins cererea de urmarire!");
  }

}