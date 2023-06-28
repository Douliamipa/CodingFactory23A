package gr.uaeb.cf.ch17.cloneable;

import java.util.Objects;

public class Trainee implements Cloneable{
    private String name;
    private City city;

    public Trainee() {
    }

    public Trainee(String name, City city) {
        this.name = name;
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    @Override
    protected Trainee clone() throws CloneNotSupportedException {
        Trainee trainee = (Trainee) super.clone();
        City city = new City(this.getCity().getCityName());
        trainee.setCity(city);
        return trainee;
    }

    @Override
    public String toString() {
        return "Trainee{" +
                "name='" + name + '\'' +
                ", city=" + city +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if ((obj == null) || this.getClass() != obj.getClass()) return false;
        Trainee trainee = (Trainee) obj;
        return Objects.equals(name, trainee.name) && Objects.equals(city, trainee.city);
    }

    @Override
    public int hashCode() {
        int prime = 47;
        int result = 1;
        result = prime * result + ((city == null) ? 0 : city.hashCode());
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        return result;
    }


}
