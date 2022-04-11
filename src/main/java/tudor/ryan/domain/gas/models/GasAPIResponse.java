package tudor.ryan.domain.gas.models;

public class GasAPIResponse {
    String currency;
    String name;
    String unleadedPrice;
    String midGradePrice;
    String dieselPrice;

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUnleadedPrice() {
        return unleadedPrice;
    }

    public void setUnleadedPrice(String unleadedPrice) {
        this.unleadedPrice = unleadedPrice;
    }

    public String getMidGradePrice() {
        return midGradePrice;
    }

    public void setMidGradePrice(String midGradePrice) {
        this.midGradePrice = midGradePrice;
    }

    public String getDieselPrice() {
        return dieselPrice;
    }

    public void setDieselPrice(String dieselPrice) {
        this.dieselPrice = dieselPrice;
    }

    @Override
    public String toString() {
        return "GasAPIResponse{" +
                "currency='" + currency + '\'' +
                ", name='" + name + '\'' +
                ", unleadedPrice='" + unleadedPrice + '\'' +
                ", midGradePrice='" + midGradePrice + '\'' +
                ", dieselPrice='" + dieselPrice + '\'' +
                '}';
    }
}
