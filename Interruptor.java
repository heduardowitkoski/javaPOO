package exerciciosfacul;

public class Interruptor
{
    private Lampada lampada;

    public static void main(String[] args)
    {
        Interruptor interruptor1 = new Interruptor();
        
        interruptor1.lampada.displayLampada(); 
        
        interruptor1.fecharCircuito();
        
        interruptor1.lampada.displayLampada();
        
        interruptor1.abrirCircuito();
        
        interruptor1.lampada.displayLampada();
    }
    
    public Interruptor()
    {
        this.lampada = new Lampada();
    }
    
    public void fecharCircuito()
    {
        this.lampada.energizar();
    }
    
    public void abrirCircuito()
    {
        this.lampada.desenergizar();
    }

}
