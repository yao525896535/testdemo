

public class Test4 {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        Circle c2 = new Circle(100);
        c1.print();
        c2.print();
    }
}

class Circle{
        private double radius;
        private double area;
        private double length;

        public Circle(double radius) {
            this.radius = radius;
        }
        public Circle() {

        }

        public double getRadius() {
            return radius;
        }

        public void setRadius() {
            this.radius = radius;
        }

        public double getArea() {
            area = 3.14*radius*radius;
            return area;
        }


        public double getLength() {
            length = 2*3.14*radius;
            return length;
        }
        public void print(){
            System.out.println("圆的面积"+getArea());
            System.out.println("圆的周长"+getLength());
            System.out.println("圆的半径"+getRadius());
        }


//        public Circle(double radius, double area, double length) {
//            this.radius = radius;
//            this.area = area;
//            this.length = length;
//        }


    }
