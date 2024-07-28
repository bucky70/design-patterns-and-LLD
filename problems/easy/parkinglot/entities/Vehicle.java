package problems.easy.parkinglot.entities;

public abstract class Vehicle {
    private int vehicleNumber;
    private VehicleType vehicleType;
    public Vehicle(int vehicleNumber, VehicleType vehicleType){
        this.vehicleNumber=vehicleNumber;
        this.vehicleType=vehicleType;
    }
    public VehicleType getVehicleType(){
        return this.vehicleType;
    }

}
