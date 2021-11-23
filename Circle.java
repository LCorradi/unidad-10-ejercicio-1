public class Circle {
   private double radius;
   private String color;
   private boolean border;
   private String borderColor;
   private boolean border;
   private String borderColor;

   public Circle() {
      radius = 1.0;
      color = "red";
      border = false;
      borderColor = "";
      border = false;
      borderColor = "";	  
   }
   
   public Circle(double r) {
      radius = r;
      color = "red";
      border = false;
      borderColor = "";    
	  border = false;
      borderColor = "";
   }
   
   public double getRadius() {
     return radius; 
   }
   
   public double getArea() {
      return radius*radius*Math.PI;
   }
}