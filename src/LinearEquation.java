public class LinearEquation {
    private int x1;//first pair coordinates
    private int x2;
    private int y1;//second pair coordinates
    private int y2;
    private int sx;//change in x
    private int sy;//change in y
    private int m;//change in y + "/" + change in x
    public LinearEquation(int x1, int y1, int x2, int y2)
    {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }
    public double calculateSlope()
    {
        int changeY = y2 - y1;
        int changeX = x2 - x1;
        sy = changeY;
        sx = changeX;
        return (double)changeY / (double)changeX;
    }
    public int intercept()
    {
        int px = x2 / sx;
        int py = y2 - (sy * px);
        return py;
    }
    public double distance()
    {
        double d = Math.pow((x2-x1), 2) + Math.pow((y2-y1), 2);
        d = Math.sqrt(d);
        return d;
    }
    public String yValue(int xVal)
    {
        double px = (double) xVal / sx; //this holds how many times the change in x was executed
        double yVal = sy * px; //this uses how many times the change in x was executed and applies it on y to get the y value
        return "Solved coordinate point is: (" + xVal + "," + yVal + ")";
    }
}
