
package ejercicios;


public class estudiante {
    double Ncarnet;
    String Ncarrera;
    double codigoC;
    public estudiante() {
    }

    public estudiante(double Ncarnet, String Ncarrera, double codigoC) {
        this.Ncarnet = Ncarnet;
        this.Ncarrera = Ncarrera;
        this.codigoC = codigoC;
    }

    public double getNcarnet() {
        return Ncarnet;
    }

    public void setNcarnet(double Ncarnet) {
        this.Ncarnet = Ncarnet;
    }

    public String getNcarrera() {
        return Ncarrera;
    }

    public void setNcarrera(String Ncarrera) {
        this.Ncarrera = Ncarrera;
    }

    public double getCodigoC() {
        return codigoC;
    }

    public void setCodigoC(double codigoC) {
        this.codigoC = codigoC;
    }
    
        
    }
    

