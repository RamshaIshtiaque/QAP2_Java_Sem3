public class TestMyRectangle {
    public static void main(String[] args) {
        MyRectangle rectangle = new MyRectangle(0, 0, 3, 4);

        System.out.println(rectangle);
        System.out.println("Top-left corner: " + rectangle.getTopLeft());
        System.out.println("Bottom-right corner: " + rectangle.getBottomRight());
        System.out.println("Diagonal distance: " + rectangle.getDiagonalDistance());

    }
}

