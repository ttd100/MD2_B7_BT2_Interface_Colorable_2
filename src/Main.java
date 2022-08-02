public class Main {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[100];

        for (int i = 0; i < shapes.length; i++) {
            int random = (int) (Math.random() * 3);
            switch (random) {
                case 0:
                    shapes[i] = new Rectangle((int) (Math.random() * 100) + 1, (int) (Math.random() * 100) + 1);
                    break;
                case 1:
                    shapes[i] = new Square((int) (Math.random() * 100) + 1);
                    break;
                case 2:
                    shapes[i] = new Circle((int) (Math.random() * 100) + 1);
            }
        }

        for (Shape shape : shapes) {

            System.out.println(shape.getClass().getSimpleName() + ": " + shape.getArea());

            if (shape instanceof IColorable) {

                ((IColorable) shape).howToColor();
            }
            System.out.println();
        }
    }

}