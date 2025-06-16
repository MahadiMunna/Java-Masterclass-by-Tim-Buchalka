public class Point {
    private int x;
    private int y;
    public Point(){

    }
    public Point(int x,int y){
        this.x=x;
        this.y=y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    public double distance(){
        Point p = new Point(0,0);
        int dx = this.x - p.x;
        int dy = this.y - p.y;
        return Math.sqrt(dx*dx + dy*dy);
    }
    public double distance(Point p){
        int dx = this.x - p.x;
        int dy = this.y - p.y;
        return Math.sqrt(dx*dx + dy*dy);
    }
    public double distance(int x, int y){
        int dx = this.x - x;
        int dy = this.y - y;
        return Math.sqrt(dx*dx + dy*dy);
    }
}
