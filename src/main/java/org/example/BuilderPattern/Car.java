package org.example.BuilderPattern;

public class Car {

    // Static inner class
    public static class carBuilder{
        private String model;
        private String engine;
        private int wheels;
        private String color;
        private int seats;

        public carBuilder setModel(String model){
            this.model = model;
            return this;
        }
        public carBuilder setEngine(String engine){
            this.engine = engine;
            return this;
        }
        public carBuilder setWheels(int wheels){
            this.wheels = wheels;
            return this;
        }
        public carBuilder setColor(String color){
            this.color = color;
            return this;
        }
        public carBuilder setSeats(int seats){
            this.seats = seats;
            return this;
        }
        public Car build(){
            return new Car(this);
        }
    }

    private String model;
    private String engine;
    private int wheels;
    private String color;
    private int seats;


    private Car(carBuilder builder){

        this.color = builder.color;
        this.engine = builder.engine;
        this.model = builder.model;
        this.wheels = builder.wheels;
        this.seats = builder.seats;
    }

    public static void main(String[] args){
        Car vehicle = new carBuilder()
                .setColor("Yellow")
                .setEngine("Volvo")
                .setSeats(6)
                .build();
    }


}
