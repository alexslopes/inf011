import decorator1.*;

public class Main {
    public static void main(String[] args){
     Component comp = new DecoratorEspada(new DecoratorEscudo(new DecoratorCapacete(new Player()))); 
     
     comp.desenhar();
    }
}
