
/**
 * Write a description of class ClockDisplay here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ClockDisplay
{
    // instance variables - replace the example below with your own
    private NumberDisplay hora;
    private NumberDisplay minuto;
    private String mostrarHora;
    
    /**
     * Constructor for objects of class ClockDisplay
     */
    public ClockDisplay()
    {
        // initialise instance variables
        hora = new NumberDisplay(24);
        minuto = new NumberDisplay(60);
          
    }
    
    public void avanzarTiempo()
    {
       minuto.incrementaValor();
        if(minuto.getValor() == 0) {
            hora.incrementaValor();}
    }

    public void setValorDisplay()
    {
        hora.setValorDisplay();
        minuto.setValorDisplay();
        
    } 
    
    public String mostrarHora()
    {
        String mostrarHora;
        mostrarHora = hora.getValorDelDisplay() + ":" + minuto.getValorDeldisplay();
        return mostrarHora;
    }    
    
    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
   
}
