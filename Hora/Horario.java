package Hora;

public class Horario {

  private int hora;
  private int minuto;
  private int segundo;

  public int getHour(){
    return hora;
  }

  public void setHour(int hora){
    if(hora <= 23 && hora >= 0){
      this.hora = hora;
    } else{
      System.out.println("Hora invalida");
    }
  }



  public int getMinut(){
    return minuto;
  }

  public void setMinut(int minuto){
    if(minuto <= 59 && minuto >= 0){
      this.minuto = minuto;
    } else{
      System.out.println("minuto invalida");
    }
  }



  public int getSecond(){
    return segundo;
  }

  public void setSecond(int segundo){
    if(segundo <= 59 && segundo >= 0){
      this.segundo = segundo;
    } else{
      System.out.println("segundo invalida");
    }
  }

  public void info(){
    System.out.println(hora + ":" + minuto +","+ segundo);
  }
}
