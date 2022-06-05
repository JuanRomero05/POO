
public class Camioneta {

	private String Marca;
    private String Modelo;
    private String Traccion;
    private int Anio_Fabricacion;
    private String Climatizador;
    private String Asientos_cuero;
    private int Ancho_chasis;
    private int Largo_chasis;
    private int Peso;
    private int Ruedas;
    private int Numero_asientos;
    
    public Camioneta() {
        Ancho_chasis = 100;
        Largo_chasis = 2;
        Peso = 800;
        Ruedas = 4;
        Numero_asientos = 6;
    }
    
    //Métodos Setters
    public void Pedir_Marca(String marca){
        this.Marca = marca;
    }
    
    public void Pedir_Modelo(String modelo){
        this.Modelo = modelo;
    }    
       
    public void Pedir_Traccion(String traccion){
        this.Traccion = traccion;
    }
    
    public void Pedir_AnioFabricacion(int anioFabricacion){
        this.Anio_Fabricacion = anioFabricacion;
    }
    
    public void Pedir_Climatizador(String climatizador){
        this.Climatizador = climatizador;
    }
    
    public void Pedir_AsientosCuero(String asientosCuero){
        this.Asientos_cuero = asientosCuero;
    }
    
    
    //Métodos Getters
    public String Mostrar_Marca(){
        return "\nLa camioneta fué fabricada por " + Marca +"\n";
    }
    
    public String Mostrar_Modelo(){
        return "\nEl modelo de su camioneta perteneciente a la marca " + Marca +" es: " + Modelo + "\n";
    }
    
    public String Mostrar_Traccion(){
        return "\nEl tipo de tracción de su camioneta es: " + Traccion +"\n";
    }
    
    public String Mostrar_AnioFabricacion(){
        return "\nEsta camioneta " + Modelo + " fué fabricada en el año " + Anio_Fabricacion +"\n";
    }
    
    public String Mostrar_Climatizador(){
        return "\nLa camioneta " + Climatizador + " cuenta con climatizador" +"\n";
    }
    
    public String Mostrar_AsientosCuero(){
        return "\nSu camioneta " + Asientos_cuero + " cuenta con asientos de cuero" +"\n";
    }
    
    public String Mostrar_AnchoChasis(){
        return "\nEl ancho del chasis de su camioneta " + Modelo + " es de " + Ancho_chasis +" cm \n";
    }
    
    public String Mostrar_LargoChasis(){
        return "\nEl largo del chasis de su camioneta " + Modelo + " es " + Largo_chasis +" m \n";
    }
    
    public String Mostrar_Peso(){
        return "\nEl peso de la " + Modelo + " es de " + Peso +" kg \n";
    }
    
    public String Mostrar_Ruedas(){
        return "\nSu camioneta " + Modelo  +" tiene " + Ruedas + " ruedas" +"\n";
    }
    
    public String Mostrar_NumeroAsientos(){
        return "\nSu camioneta " + Modelo + " tiene " + Numero_asientos + " asientos" +"\n";
    }
    
    
    
    public String MostrarCaracteristicasGenerales(){
        return Mostrar_Marca() + Mostrar_Modelo() + Mostrar_Traccion() + Mostrar_AnioFabricacion() + Mostrar_Climatizador() + 
        		Mostrar_AsientosCuero() + Mostrar_AnchoChasis() + Mostrar_LargoChasis() + Mostrar_Peso() +
                Mostrar_Ruedas() + Mostrar_NumeroAsientos();  
    }
	
}
