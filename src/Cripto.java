import com.fasterxml.jackson.annotation.JsonProperty;

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
        return "Criptomoneda{" +
                "nombre='" + nombre + '\'' +
                ", abbr='" + simbolo + '\'' +
                ", crypturl='" + url + '\'' +
                ", price=" + precio +
                ", volume24hrs=" + volTrans24hrs +
                ", marketcap=" + capitalizacion +
                ", circulatingsupply=" + cantCriptoCirculando +
                ", maxsupply=" + cantMax +
                ", totalsupply=" + cantTotal +
                ", date_taken='" + fecha + '\'' +
                '}';
    }
}
