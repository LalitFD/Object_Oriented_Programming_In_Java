//package OOPS_IN_JAVA;
//
//public class inherit_shape {
//    //SHAPE CLASS
//    public  class shape{
//        private String color;
//        private int border_width;
//
//        public String getColor() {
//            return color;
//        }
//
//        public void setColor(String color) {
//            this.color = color;
//        }
//
//        public int getBorder_width() {
//            return border_width;
//        }
//
//        public void setBorder_width(int border_width) {
//            this.border_width = border_width;
//        }
//    }
//
//    //CIRCLE CLASS
//    public static class circle extends shape{
//        private double radius;
//
//        public double getRadius() {
//            return radius;
//        }
//
//        public void setRadius(double radius) {
//            this.radius = radius;
//        }
//
//        public  void area (){
//            System.out.println("Circle Area ="+(Math.PI*radius*radius));
//        }
//    }
//    //RECTANGLE CLASS
//    public static class rectengle extends  shape{
//        private int length;
//        private  int breadth;
//
//        public int getLength() {
//            return length;
//        }
//
//        public void setLength(int length) {
//            this.length = length;
//        }
//
//        public int getBreadth() {
//            return breadth;
//        }
//
//        public void setBreadth(int breadth) {
//            this.breadth = breadth;
//        }
//        public void area (){
//            System.out.println("Rectangle Area = "+(length*breadth));
//        }
//    }
//
//    //TRIANGLE CLASS
//    public class triangle extends  shape{
//        private double height,base;
//
//        public double getHeight() {
//            return height;
//        }
//
//        public void setHeight(double height) {
//            this.height = height;
//        }
//
//        public double getBase() {
//            return base;
//        }
//
//        public void setBase(double base) {
//            this.base = base;
//        }
//        public  void area(){
//            System.out.println("triangle area ="+(0.5*base*height));
//        }
//    }
//
//
//}
//
