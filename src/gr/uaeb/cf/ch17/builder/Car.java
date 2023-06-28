package gr.uaeb.cf.ch17.builder;

public class Car {
    private final int serialNo ;
    private final String trademark ;
    private final String owner ;
     private final double horsePower ;

     public static class Builder {
         private final int serialNo ;
         private final String trademark ;
         private  String owner = "";
         private  double horsePower = 0.0 ;


         public Builder(int serialNo , String trademark){
             this.serialNo = serialNo ;
             this.trademark = trademark ;
         }

         public Builder owner(String owner){
             this.owner = owner ;
             return this ;
         }

         public Builder horsePower (double horsePower){
             this.horsePower = horsePower ;
             return  this ;
         }

         public Car build(){return  new Car(this);}

     }

     private Car(Builder builder){
         this.serialNo = builder.serialNo ;
         this.trademark = builder.trademark ;
         this.owner = builder.owner ;
         this. horsePower = builder.horsePower ;
     }


    public int getSerialNo() {
        return serialNo;
    }

    public String getTrademark() {
        return trademark;
    }

    public String getOwner() {
        return owner;
    }

    public double getHorsePower() {
        return horsePower;
    }
}
