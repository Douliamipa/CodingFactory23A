package gr.uaeb.cf.ch17.cloneable;

import java.util.Objects;

public class City implements Cloneable{
    private String cityName;

    public City(){}

    public City(String cityName) {
        this.cityName = cityName;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    @Override
    protected City clone() throws CloneNotSupportedException {
        return (City) super.clone(); //Object.clone()
    }

    @Override
    public String toString() {
        return "City{" +
                "cityName='" + cityName + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if ((this == null) || (this.getClass()) != obj.getClass()) return false;
        City city = (City) obj;
        return Objects.equals(cityName, this.cityName);
    }

    @Override
    public int hashCode() {
        int prime = 47;
        int result = 1;
        result = prime * result + (((cityName == null) ? 0 : cityName.hashCode()));
        return result;
    }
}
