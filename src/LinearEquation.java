public class LinearEquation {
    private int x1;//first pair coordinates
    private int x2;
    private int y1;//second pair coordinates
    private int y2;
    private int px;//placeholder x
    private int py;//placeholder y
    private int sx;//change in x
    private int sy;//change in y
    private double d;//distance between 2 points
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
        px = x2 / sx;
        py = y2 - (sy * px);
        return py;
    }
    public double distance()
    {
        d = Math.pow((x2-x1), 2) + Math.pow((y2-y1), 2);
        d = Math.sqrt(d);
        return d;
    }
}
