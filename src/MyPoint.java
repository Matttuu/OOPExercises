public class MyPoint {
    // private instance variable, not accessible from outside this class
    private int x;
    private int y;

    public MyPoint(){

    }

    public MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x){
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int[] getXY(){
        int[] xy= new int[2];
        xy[0] = getX();
        xy[1] = getY();
        return xy;
    }

    public void setXY (int x, int y){
        this.x = x;
        this.y = y;
    }

    public String toString() {
        return "(" + x + "," + y +")";
    }

    // Overloading method distance()
    // This version takes two ints as arguments
    public double distance(int x, int y) {
        int xD = this.x - x;
        int yD = this.y - y;
        return Math.sqrt(xD*xD + yD * yD);
    }
    // This version takes a MyPoint instance as argument
    public double distance (MyPoint another) {
        int xD = this.x - x;
        int yD = this.y - y;
        return Math.sqrt(xD*xD + yD * yD);
    }

    public double distance (){
        int xD = this.x - x;
        int yD = this.y - y;
        return Math.sqrt(xD*xD + yD * yD);
    }

}
