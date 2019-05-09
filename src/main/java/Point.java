public class Point {
    public float x = 0.0f;
    public  float y = 0.0f;
    public Point(){
    }
    public Point(float x,float y){
        this.x = x;
        this.y = y;
    }
    public void setX(float x){
        this.x = x;
    }
    public float getX(){
        return  x;
    }
    public void setY(float y){
        this.y = y;
    }
    public float getY(){
        return y;
    }
    public void setXY(float a,float b){
        this.x =a;
        this.y = b;
    }
    public float []getXY(){
        float []arr = new float[] {this.x, this.y};
        return arr;
    }
    public void show(float []arr){
        for (float x:arr){
            System.out.println(x);
        }
    }
    @Override
    public String toString(){
        return "x " +  getX() + " y " +  getY();

    }

}
