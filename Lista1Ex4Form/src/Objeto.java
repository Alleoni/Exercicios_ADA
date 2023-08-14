public class Objeto {

    private double massa;
    private double forca;


    public Objeto(){

    }

    public Objeto(double massa, double forca){
        this.massa = massa;
        this.forca = forca;
    }

    public double aceleracaoAdquirida(){

        return forca/massa;

    }

}
