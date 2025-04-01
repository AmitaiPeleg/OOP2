package HW2;

public class Program {
    public static void main(String[] args) {
        DrawingBoard board = new DrawingBoard(5);

        Circle circle = new Circle(5);
        Rectangle rectangle = new Rectangle(4, 6);
        Triangle triangle = new Triangle(3, 4);
        Ellipse ellipse = new Ellipse(3, 6);
        Cube cube = new Cube(3);
        Ball ball = new Ball(5);
       

        board.add(circle, rectangle, triangle, ellipse, cube, ball);

        System.out.println("All Shapes:");
        board.showAll();
        System.out.println("--------------------");

        System.out.println("Shape with Maximum Area:");
        System.out.println(board.getMax());
        System.out.println("--------------------");

        System.out.println("3D Shape with Maximum Volume (V1):");
        System.out.println(board.getMax3DV1());
        System.out.println("--------------------");

        System.out.println("Max Cube or Ball (V2):");
        System.out.println(board.getMax3DV2());
        System.out.println("--------------------");

        System.out.println("Unique Shape Types:");
        for (Class<?> type : board.getTypes()) {
            System.out.println(type.getSimpleName());
        }
        System.out.println("--------------------");

        System.out.println("Areas and Volumes:");
        System.out.println("Circle Area: " + circle.area());
        System.out.println("Rectangle Area: " + rectangle.area());
        System.out.println("Triangle Area: " + triangle.area());
        System.out.println("Ellipse Area: " + ellipse.area());
        System.out.println("Cube Area: " + cube.area() + ", Volume: " + cube.volume());
        System.out.println("Ball Area: " + ball.area() + ", Volume: " + ball.volume());
        System.out.println("--------------------");

        System.out.println("Equality Checks:");
        System.out.println("Is Cube equal to another Cube of same size? " + cube.equals(new Cube(3)));
        System.out.println("Is Ball equal to a different Ball? " + ball.equals(new Ball(4)));
        System.out.println("--------------------");

        System.out.println("Compare Example:");
        System.out.println("Comparison Result (Cube vs Ball): " + cube.compare());
    }
}
