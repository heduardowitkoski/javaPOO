package exerciciosfacul;

public class Lampada
{
    private boolean energizado;
    
    
    public static void main(String[] args)
    {
        Lampada lampada1 = new Lampada();
        
        displayLampada(lampada1);
        
        lampada1.energizar();
        
        displayLampada(lampada1);

        lampada1.desenergizar();
        
        displayLampada(lampada1);
    }
    
    public Lampada()
    {
        this.energizado = false;
    }
    
    public static void displayLampada(Lampada lampada)
    {
        System.out.printf("A lampada está ");
        if(lampada.mostrarEstado())
            System.out.println("energizada");
        else
            System.out.println("desenergizada");
    } 
   
    public void energizar()
    {
        this.energizado = true;
    }
    
    public void desenergizar()
    {
        this.energizado = false;
    }
    
    public boolean mostrarEstado()
    {
        return this.energizado;
    }
}
