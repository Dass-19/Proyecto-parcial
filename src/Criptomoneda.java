import com.fasterxml.jackson.annotation.JsonProperty;

public class Criptomoneda {
    private String name;
    private String abbr;
    private String crypturl;
    private double price;
    private double volume24hrs;
    private double marketcap;
    private double circulatingsupply;
    private double maxsupply;
    private double totalsupply;
    private String date_taken;

    public Criptomoneda() {}

    public Criptomoneda(String name, String abbr, String crypturl, double price, double volume24hrs, double marketcap, double circulatingsupply, double maxsupply, double totalsupply, String date_taken) {
        this.name = name;
        this.abbr = abbr;
        this.crypturl = crypturl;
        this.price = price;
        this.volume24hrs = volume24hrs;
        this.marketcap = marketcap;
        this.circulatingsupply = circulatingsupply;
        this.maxsupply = maxsupply;
        this.totalsupply = totalsupply;
        this.date_taken = date_taken;
    }
    @JsonProperty("name")
    public String getName() {
        return name;
    }
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }
    @JsonProperty("abbr")
    public String getAbbr() {
        return abbr;
    }
    @JsonProperty("abbr")
    public void setAbbr(String abbr) {
        this.abbr = abbr;
    }
    @JsonProperty("crypturl")
    public String getCrypturl() {
        return crypturl;
    }
    @JsonProperty("crypturl")
    public void setCrypturl(String crypturl) {
        this.crypturl = crypturl;
    }
    @JsonProperty("price")
    public double getPrice() {
        return price;
    }
    @JsonProperty("price")
    public void setPrice(double price) {
        this.price = price;
    }
    @JsonProperty("volume24hrs")
    public double getVolume24hrs() {
        return volume24hrs;
    }
    @JsonProperty("volume24hrs")
    public void setVolume24hrs(double volume24hrs) {
        this.volume24hrs = volume24hrs;
    }
    @JsonProperty("marketcap")
    public double getMarketcap() {
        return marketcap;
    }
    @JsonProperty("marketcap")
    public void setMarketcap(double marketcap) {
        this.marketcap = marketcap;
    }
    @JsonProperty("circulatingsupply")
    public double getCirculatingsupply() {
        return circulatingsupply;
    }
    @JsonProperty("circulatingsupply")
    public void setCirculatingsupply(double circulatingsupply) {
        this.circulatingsupply = circulatingsupply;
    }
    @JsonProperty("maxsupply")
    public double getMaxsupply() {
        return maxsupply;
    }
    @JsonProperty("maxsupply")
    public void setMaxsupply(double maxsupply) {
        this.maxsupply = maxsupply;
    }
    @JsonProperty("totalsupply")
    public double getTotalsupply() {
        return totalsupply;
    }
    @JsonProperty("totalsupply")
    public void setTotalsupply(double totalsupply) {
        this.totalsupply = totalsupply;
    }
    @JsonProperty("date_taken")
    public String getDate_taken() {
        return date_taken;
    }
    @JsonProperty("date_taken")
    public void setDate_taken(String date_taken) {
        this.date_taken = date_taken;
    }

    @Override
    public String toString() {
        return "Criptomoneda{" +
                "name='" + name + '\'' +
                ", abbr='" + abbr + '\'' +
                ", crypturl='" + crypturl + '\'' +
                ", price=" + price +
                ", volume24hrs=" + volume24hrs +
                ", marketcap=" + marketcap +
                ", circulatingsupply=" + circulatingsupply +
                ", maxsupply=" + maxsupply +
                ", totalsupply=" + totalsupply +
                ", date_taken='" + date_taken + '\'' +
                '}';
    }
}
