package Hora;

public class Main {
  public static void main(String[] args){
    Horario a = new Horario();

    a.setHour(23);
    a.setMinut(3);
    a.setSecond(45);

    a.info();
  }
}
