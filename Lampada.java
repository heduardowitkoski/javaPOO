package exerciciosfacul;

public class Lampada
{
    private boolean energizado;
    
    public static void main(String[] args)
    {
        Lampada lampada1 = new Lampada();
   
        lampada1.displayLampada();
        
        lampada1.energizar();
        
        lampada1.displayLampada();

        lampada1.desenergizar();
        
        lampada1.displayLampada();
    }
    
    public Lampada()
    {
        this.energizado = false;
    }
    
    public void displayLampada()
    {
        System.out.printf("A lampada está ");
        if(this.mostrarEstado())
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
