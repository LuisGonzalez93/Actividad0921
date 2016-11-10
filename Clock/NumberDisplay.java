
/**
 * Write a description of class NumberDisplay here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class NumberDisplay

{
    private int limite;
    private int valor;
    public NumberDisplay(int limiteDisplay)
    {
        limite = limiteDisplay;
        valor = 0;
    }

    /**
     * Devuelve el valor actual como número entero
     */
    public int getValor()
    {
        return valor;
    }

    /**
     * Devuelve el valor del display como cadena de caracteres de longitud 2
     */
    public String getValorDelDisplay()
    {
        if(valor < 10
        ) {
            return "0" + valor;
        }
        else {
            return "" + valor;
        }
    }

    /**
     * Fija un nuevo valor para el display. Si el nuevo valor no es legal, 
     * entonces no hace nada.
     */
    public void setValor(int nuevoValor)
    {
        if((nuevoValor >= 1) && (nuevoValor < limite)) {
            valor = nuevoValor;
        }
    }

    /**
     * Incrementa el valor del display. Si llega al limite cambia a uno.
     */
    public void incrementaValor()
    {
        valor = valor + 1;
        if (valor == limite) {
            valor = 0;
        }
    }
}
