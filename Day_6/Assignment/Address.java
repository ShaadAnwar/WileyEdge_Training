package Day_6.Assignment;

public class Address {
    private String flatNumber;
    private String flatName;
    private String roadName;
    private String cityName;

    Address(Address address){
        this.flatNumber = address.flatNumber;
        this.flatName = address.flatName;
        this.roadName = address.roadName;
        this.cityName = address.cityName;
    }

    @Override
    public String toString() {
        return "{" +
                "flatNumber='" + flatNumber + '\'' +
                ", flatName='" + flatName + '\'' +
                ", roadName='" + roadName + '\'' +
                ", cityName='" + cityName + '\'' +
                '}';
    }

        Address(String flatNumber,String flatName,String roadName,String cityName){
        this.flatNumber = flatNumber;
        this.flatName = flatName;
        this.roadName = roadName;
        this.cityName = cityName;
    }

}
