public class MoveablePoint extends Point {
    public float xSpeed = 0.0f;
    public  float ySpeed = 0.0f;
    public MoveablePoint(){

    }
    public  MoveablePoint(float a,float b){
        this.xSpeed = a;
        this.ySpeed = b;
    }
    public MoveablePoint(float x,float y,float a,float b){
        super(x,y);
        this.xSpeed = a;
        this.ySpeed = b;
    }
    public void setxSpeed(float c){
        this.xSpeed = c;
    }
    public float getxSpeed(){
        return this.xSpeed;
    }
    public void setySpeed(float d){
        this.ySpeed = d;
    }
    public float getySpeed(){
        return  ySpeed;
    }
    public void setXYSpeed(float xSpeed,float ySpeed){
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public float []getXYSpeed(){
        float []arr = new float[2];
        arr[0] = xSpeed;
        arr[1] = ySpeed;
        return arr;
    }
    public void show(float []array){
        for (float x:array){
            System.out.println(x);
        }
    }
    public MoveablePoint move(){
        float x = getX();
        float y = getY();
        x +=xSpeed;
        y +=ySpeed;
        setXY(x,y);

        return this;
    }

    @Override
    public String toString(){
        String print = "(" + getX() + "," + getY() + ")";
        return print;
    }

}
