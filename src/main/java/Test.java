public class Test {
    public static void main(String[] args) {
        MoveablePoint moveablePoint = new MoveablePoint(2.3f,3.0f,1.0f,1.0f);

        System.out.println(moveablePoint.toString());
        moveablePoint.move();
        System.out.println(moveablePoint.toString());
        moveablePoint.move();
        System.out.println(moveablePoint.toString());
    }

}
