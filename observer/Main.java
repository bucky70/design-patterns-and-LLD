package observer;

public interface Subject {
    void registerObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers();
}

public class WeatherStation implements Subject {
    private List<Observer> observers;
    private double temperature;
    private double humidity;

    public WeatherStation() {
        observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(temperature, humidity);
        }
    }

    public void setMeasurements(double temperature, double humidity) {
        this.temperature = temperature;
        this.humidity = humidity;
        notifyObservers();
    }
}

public interface Observer {
    void update(double temperature, double humidity);
}

public class WeatherApp implements Observer {
    @Override
    public void update(double temperature, double humidity) {
        System.out.println("Temperature: " + temperature + ", Humidity: " + humidity);
    }
}

public class Main {
    public static void main(String[] args) {
        WeatherStation weatherStation = new WeatherStation();
        WeatherApp weatherApp = new WeatherApp();

        weatherStation.registerObserver(weatherApp);
        weatherStation.setMeasurements(25.0, 60.0);
    }
}