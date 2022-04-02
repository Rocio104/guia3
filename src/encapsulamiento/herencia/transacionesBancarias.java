
package encapsulamiento.herencia;


public class transacionesBancarias {
    public static void main(String[] args) {
        cuentaBancaria c= new cuentaBancaria();
        BufferedReader leer= new BufferedReader(new InputStreamReader(System.in));
        double abonoCuenta, cargoCuenta;
        try{
            System.out.println("Dui del cliente: ");
            long numDui =Long.parseLong(leer.readLine());
            System.out.println("Nombre del cliente:");
            String nombres=leer.readLine();
             System.out.println("Telefono del cliente:");
            String telefono=leer.readLine();
            
            System.out.println("Ingresar el abono a la cuenta:");
            abonoCuenta= Double.parseDouble(leer.readLine());
            System.out.println("Ingresar el cargo a la cuenta:");
            cargoCuenta=Double.parseDouble(leer.readLine());
            
            c.setAbonoCuenta(abonoCuenta);
            c.setCargoCuenta(cargoCuenta);
            c.setSaldoCuenta(cargoCuenta);
            
            System.out.println("Abono: "+c.getAbonoCuenta());
            System.out.println("Cargo: "+c.getCargoCuenta());
            System.out.println("Saldo: "+c.getSaldoCuenta());
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    
}

