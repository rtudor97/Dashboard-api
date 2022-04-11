package tudor.ryan.domain.weather.models;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.List;

public class WeatherAPIResponse {
    @JsonIgnore
    private Long id;

    private Coordinate coordinate;
    private List<Weather> weather;
    private String base;
    private WeatherMain weatherMain;
    private Integer visibility;
    private Wind wind;
    private Cloud cloud;
    private Long dt;
    private WeatherSys weatherSys;
    private Long timezone;
    private String name;
    private Integer cod;

    public Coordinate getCoordinate() {
        return coordinate;
    }

    public void setCoordinate(Coordinate coordinate) {
        this.coordinate = coordinate;
    }

    public List<Weather> getWeather() {
        return weather;
    }

    public void setWeather(List<Weather> weather) {
        this.weather = weather;
    }

    public String getBase() {
        return base;
    }

    public void setBase(String base) {
        this.base = base;
    }

    public WeatherMain getWeatherMain() {
        return weatherMain;
    }

    public void setWeatherMain(WeatherMain weatherMain) {
        this.weatherMain = weatherMain;
    }

    public Integer getVisibility() {
        return visibility;
    }

    public void setVisibility(Integer visibility) {
        this.visibility = visibility;
    }

    public Wind getWind() {
        return wind;
    }

    public void setWind(Wind wind) {
        this.wind = wind;
    }

    public Cloud getCloud() {
        return cloud;
    }

    public void setCloud(Cloud cloud) {
        this.cloud = cloud;
    }

    public Long getDt() {
        return dt;
    }

    public void setDt(Long dt) {
        this.dt = dt;
    }

    public WeatherSys getWeatherSys() {
        return weatherSys;
    }

    public void setWeatherSys(WeatherSys weatherSys) {
        this.weatherSys = weatherSys;
    }

    public Long getTimezone() {
        return timezone;
    }

    public void setTimezone(Long timezone) {
        this.timezone = timezone;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getCod() {
        return cod;
    }

    public void setCod(Integer cod) {
        this.cod = cod;
    }

    @Override
    public String toString() {
        return "WeatherAPIResponse{" +
                "id=" + id +
                ", coordinate=" + coordinate +
                ", weather=" + weather +
                ", base='" + base + '\'' +
                ", weatherMain=" + weatherMain +
                ", visibility=" + visibility +
                ", wind=" + wind +
                ", cloud=" + cloud +
                ", dt=" + dt +
                ", weatherSys=" + weatherSys +
                ", timezone=" + timezone +
                ", name='" + name + '\'' +
                ", cod=" + cod +
                '}';
    }
}
