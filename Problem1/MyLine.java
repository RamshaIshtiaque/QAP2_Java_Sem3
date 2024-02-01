public class MyLine {
    private MyPoint begin;
    private MyPoint end;
    

    public MyLine(int x1, int y1, int x2, int y2){
      this.begin = new MyPoint(x1 , y1);
      this.end = new MyPoint(x2 , y2);
    }

    public MyLine(MyPoint begin, MyPoint end ){
        this.begin = begin;
        this.end = end;
    }

    public MyPoint getBegin() {
        return begin;
    }

    public void setBegin(MyPoint begin) {
        this.begin = begin;
    }

    public MyPoint getEnd() {
        return end;
    }

    public void setEnd(MyPoint end) {
        this.end = end;
    }

    public int getBeginX() {
        return begin.getX();
    }

    public int getBeginY() {
        return begin.getY();
    }

    public int getEndX() {
        return end.getX();
    }

    public int getEndY() {
        return end.getY();
    }

    public void setBeginX(int x) {
        begin.setX(x);
    }

    public void setBeginY(int y) {
        begin.setY(y);
    }

    public void setEndX(int x) {
        end.setX(x);
    }

    public void setEndY(int y) {
        end.setY(y);
    }

    public void setEndXY(int x, int y) {
        end.setXY(x, y);
    }

    public void setBeginXY(int x, int y) {
        begin.setXY(x, y);
    }

    public int[] getEndXY(){
        int x2 = this.end.getX();
        int y2 = this.end.getY();

        int[] x2y2 = {x2 , y2};

        return x2y2;
    }

    public int[] getBeginXY(){
        int x1 = this.begin.getX();
        int y1 = this.begin.getY();

        int[] x1y1 = {x1 , y1};

        return x1y1;
    }

    public int getLength() {
        int xDiff = getEndX() - getBeginX();
        int yDiff = getEndY() - getBeginY();
        return (int) Math.sqrt(xDiff*xDiff + yDiff*yDiff);
    }

    public double getGradient() {
        int xDiff = getEndX() - getBeginX();
        int yDiff = getEndY() - getBeginY();
        return Math.atan2(yDiff, xDiff);
    }

    public String toString() {
        return "My Line: [begin=" + begin + ",end= " + end + " ]";
    }
}
