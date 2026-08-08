public class dist_point {
     double distance(int x1 ,int x2 ,int y1, int y2)
     {
        double D = Math.pow((x2-x1),2) + Math.pow((y2 - y1),2);
        double dist = Math.sqrt(D);
        return dist;
     }
    public static void main(String[] args) {
        dist_point n = new dist_point();
        System.out.println(n.distance(2,4,5,6));
    }
}
