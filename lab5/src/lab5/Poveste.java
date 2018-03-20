package lab5;

import java.util.Vector;

public class Poveste extends Cont {

  public Vector<Poza> poze;

  public String tag;

  public Vector<Comentariu> comentarii;

  public Poveste(Vector p, String t, Comentariu c) {
      poze=p;
      tag=t;
      comentarii=c;
  }

    public Vector getPoze() {
        return poze;
    }

    public void setPoze(Vector poze) {
        this.poze = poze;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public Comentariu getComentarii() {
        return comentarii;
    }

    public void setComentarii(Comentariu comentarii) {
        this.comentarii = comentarii;
    }
  public void editareTag() {
  }
  
  public void afiseazaPoveste(){
      
  }
}