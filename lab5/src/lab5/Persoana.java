package lab5;

public class Persoana {

  public String nume;

  public String prenume;

  public String email;

  public String parola;

  public String detalii;

  
  public Persoana()
  {
      
  }
  
  public String getNume() {
      return nume;
  }

  public String getPrenume() {
      return prenume;
  }

  public void setNume(String s) {
      nume=s;
  }

  public void setPrenume(String s) {
      prenume=s;
  }

  public String getEmail() {
      return email;
  }

  public String getParola() {
      return parola;
  }

  public void setEmail(String s) {
      email=s;
  }

  public void logare() {
      System.out.println("Utlizatorul, "+ nume +" "+ prenume +" este conectat!");
  }

  public void delogare() {
      System.out.println("Utlizatorul, "+ nume +" "+ prenume +" este deconectat!");
  }

  public void inregistrare(String username, String p, String el) {
      nume=username;
      parola=p;
      email=el;
  }

}