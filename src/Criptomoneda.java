import com.fasterxml.jackson.annotation.JsonProperty;

public class Criptomoneda {
    private String name;
    private String abbr;
    private String crypturl;
    private String price;
    private String volume24hrs;
    private String marketcap;
    private String circulatingsupply;
    private String maxsupply;
    private String totalsupply;
    private String date_taken;

    public Criptomoneda() {}

    public Criptomoneda(String name, String abbr, String crypturl, String price, String volume24hrs, String marketcap, String circulatingsupply, String maxsupply, String totalsupply, String date_taken) {
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
    public String getPrice() {
        return price;
    }
    @JsonProperty("price")
    public void setPrice(String price) {
        this.price = price;
    }
    @JsonProperty("volume24hrs")
    public String getVolume24hrs() {
        return volume24hrs;
    }
    @JsonProperty("volume24hrs")
    public void setVolume24hrs(String volume24hrs) {
        this.volume24hrs = volume24hrs;
    }
    @JsonProperty("marketcap")
    public String getMarketcap() {
        return marketcap;
    }
    @JsonProperty("marketcap")
    public void setMarketcap(String marketcap) {
        this.marketcap = marketcap;
    }
    @JsonProperty("circulatingsupply")
    public String getCirculatingsupply() {
        return circulatingsupply;
    }
    @JsonProperty("circulatingsupply")
    public void setCirculatingsupply(String circulatingsupply) {
        this.circulatingsupply = circulatingsupply;
    }
    @JsonProperty("maxsupply")
    public String getMaxsupply() {
        return maxsupply;
    }
    @JsonProperty("maxsupply")
    public void setMaxsupply(String maxsupply) {
        this.maxsupply = maxsupply;
    }
    @JsonProperty("totalsupply")
    public String getTotalsupply() {
        return totalsupply;
    }
    @JsonProperty("totalsupply")
    public void setTotalsupply(String totalsupply) {
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
