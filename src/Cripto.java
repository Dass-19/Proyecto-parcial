/**
 * Clase llamada Cripto, contiene los atributos,
 * constructores, accesores y toString del archivo json
 * que se nos dió para el programa, los cuales serán usados
 * para los reportes.
 *
 * @author Daniel Alfonso Suárez Solis
 * @author Ricardo Jared Cedeño Villota
 * @version POO - 2024-2025 C1
 * @since Desde 31-jul-2024, 16:00 horas
 */
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

// Se ignoran los campos sin nombre
@JsonIgnoreProperties(ignoreUnknown = true)

public class Cripto {
    private String nombre;
    private String simbolo;
    private String url;
    private double precio;
    private double volTrans24hrs;
    private String capitalizacion;
    private double cantCriptoCirculando;
    private double cantMax;
    private double cantTotal;
    private String fecha;

    public Cripto() {}

    public Cripto(String nombre, String simbolo, String url, double precio, double volTrans24hrs, String capitalizacion, double cantCriptoCirculando, double cantMax, double cantTotal, String fecha) {
        this.nombre = nombre;
        this.simbolo = simbolo;
        this.url = url;
        this.precio = precio;
        this.volTrans24hrs = volTrans24hrs;
        this.capitalizacion = capitalizacion;
        this.cantCriptoCirculando = cantCriptoCirculando;
        this.cantMax = cantMax;
        this.cantTotal = cantTotal;
        this.fecha = fecha;
    }
    @JsonProperty("name")
    public String getNombre() {
        return nombre;
    }
    @JsonProperty("name")
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    @JsonProperty("abbr")
    public String getSimbolo() {
        return simbolo;
    }
    @JsonProperty("abbr")
    public void setAbbr(String simbolo) {
        this.simbolo = simbolo;
    }
    @JsonProperty("crypturl")
    public String getUrl() {
        return url;
    }
    @JsonProperty("crypturl")
    public void setCrypturl(String url) {
        this.url = url;
    }
    @JsonProperty("price")
    public double getPrecio() {
        return precio;
    }
    @JsonProperty("price")
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    @JsonProperty("volume24hrs")
    public double getVolTrans24hrs() {
        return volTrans24hrs;
    }
    @JsonProperty("volume24hrs")
    public void setVolTrans24hrs(double volTrans24hrs) {
        this.volTrans24hrs = volTrans24hrs;
    }
    @JsonProperty("marketcap")
    public String getCapitalizacion() {
        return capitalizacion;
    }
    @JsonProperty("marketcap")
    public void setCapitalizacion(String capitalizacion) {
        this.capitalizacion = capitalizacion;
    }
    @JsonProperty("circulatingsupply")
    public double getCantCriptoCirculando() {
        return cantCriptoCirculando;
    }
    @JsonProperty("circulatingsupply")
    public void setCantCriptoCirculando(double cantCriptoCirculando) {
        this.cantCriptoCirculando = cantCriptoCirculando;
    }
    @JsonProperty("maxsupply")
    public double getCantMax() {
        return cantMax;
    }
    @JsonProperty("maxsupply")
    public void setCantMax(double cantMax) {
        this.cantMax = cantMax;
    }
    @JsonProperty("totalsupply")
    public double getCantTotal() {
        return cantTotal;
    }
    @JsonProperty("totalsupply")
    public void setCantTotal(double cantTotal) {
        this.cantTotal = cantTotal;
    }
    @JsonProperty("date_taken")
    public String getFecha() {
        return fecha;
    }
    @JsonProperty("date_taken")
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "Cripto{" +
                "nombre='" + nombre + '\'' +
                ", simbolo='" + simbolo + '\'' +
                ", url='" + url + '\'' +
                ", precio=" + precio +
                ", volTrans24hrs=" + volTrans24hrs +
                ", capitalizacion=" + capitalizacion +
                ", cantCriptoCirculando=" + cantCriptoCirculando +
                ", cantMax =" + cantMax +
                ", cantTotal=" + cantTotal +
                ", fecha='" + fecha + '\'' +
                '}';
    }
}
