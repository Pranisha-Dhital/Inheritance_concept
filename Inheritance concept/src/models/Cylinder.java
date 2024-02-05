package models;

public class Cylinder extends Circle {
     int height;

     public double getCylinderArea() {
          double a= this.getHeight()*super.getRadius()*super.getPI();
          System.out.println(a);
          return cylinderArea;
     }

     public void setCylinderArea(double cylinderArea) {
          this.cylinderArea = cylinderArea;
     }

     double cylinderArea;

      public Cylinder (int height ,int radius ){
           super(radius);
           height=this.height;

      }

     public int getHeight() {
          return height;
     }

     public void setHeight(int height) {
          this.height = height;
     }


}

