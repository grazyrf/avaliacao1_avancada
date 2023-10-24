public class Car {
    private String carID;
    private int currentRouteIndex;
    private double totalDistance;
    
    public Car(String carID) {
        this.carID = carID;
        this.currentRouteIndex = 0;
        this.totalDistance = 0.0;
    }

    public String getCarID() {
        return carID;
    }

    public int getCurrentRouteIndex() {
        return currentRouteIndex;
    }

    public void setCurrentRouteIndex(int index) {
        this.currentRouteIndex = index;
    }

    public double getTotalDistance() {
        return totalDistance;
    }

    public void addToTotalDistance(double distance) {
        this.totalDistance += distance;
    }
    
    // Outros métodos e lógica necessários para a classe Car.
}
