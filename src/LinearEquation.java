public class LinearEquation {
    private int x1;//first pair coordinates
    private int y1;
    private int x2;//second pair coordinates
    private int y2;
    private int sx;//change in x
    private int sy;//change in y
    public LinearEquation(int x1, int y1, int x2, int y2)//constructor
    {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }
    public double calculateSlope()//returns the slope of the object as a double
    {
        int changeY = y2 - y1;
        int changeX = x2 - x1;
        sy = changeY;
        sx = changeX;
        return (double)changeY / (double)changeX;
    }
    public String slopeInterceptForm()//returns the slope and the Y intercept of the object in slope intercept form
    {
        calculateSlope();
        return "Slope intercept form: y = (" + sy + "/" + sx + ") + (" + intercept() + ")";
    }
    public int intercept()//finds and returns the Y intercept of the object
    {
        calculateSlope();
        int cx = x2 / sx;//cx for change in x
        return y2 - (sy * cx);
    }
    public double distance()//finds and returns the distance between (x1,y1) and (x2,y2)
    {
        double d = Math.pow((x2-x1), 2) + Math.pow((y2-y1), 2);
        d = Math.sqrt(d);
        d = Math.round(d * 100.00) / 100.00;
        return d;
    }
    public String yValue(double xVal)//returns Y value of a point on a point on the object given an X value
    {
        calculateSlope();
        double px = xVal / sx; //this holds how many times the change in x was executed
        double yVal = (sy * px) + intercept(); //this uses how many times the change in x was executed and applies it on y to get the y value
        return "Solved coordinate point is: (" + xVal + "," + yVal + ")";
    }
    public String toString() //prints the data of the object instead of the memory location
    {
        String result = "First Pair: (" + x1 + "," + y1 + ")\nSecond Pair: (" + x2 + "," + y2 + ")";
        result += "\nSlope of line: " + calculateSlope();
        result += "\nY intercept: " + intercept();
        result += "\n" + slopeInterceptForm();
        result += "\nDistance between points: " + distance();
        return result;
    }
}
