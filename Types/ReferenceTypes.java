package Types;

import java.awt.Point;
import java.util.Date;

public class ReferenceTypes {
    public static void main(String[] args) {
        Date now = new Date();
        System.out.println(now);

        Point point1 = new Point(1, 1);
        Point point2 = point1;
        System.out.println(point2);
    }

}
