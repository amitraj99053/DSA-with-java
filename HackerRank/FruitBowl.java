package HackerRank;

import java.util.*;
import java.io.*;

public class FruitBowl {
    static class Point implements Comparable<Point> {
        int x, y;
        Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public int compareTo(Point other) {
            if (this.x != other.x) return this.x - other.x;
            return this.y - other.y;
        }
    }

    static long cross(Point o, Point a, Point b) {
        return (long)(a.x - o.x) * (b.y - o.y) - (long)(a.y - o.y) * (b.x - o.x);
    }

    static double distance(Point a, Point b) {
        return Math.hypot(a.x - b.x, a.y - b.y);
    }

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Point[] points = new Point[n];
        for (int i = 0; i < n; i++) {
            points[i] = new Point(sc.nextInt(), sc.nextInt());
        }
        sc.close();

        Arrays.sort(points);

        List<Point> lower = new ArrayList<>();
        for (Point p : points) {
            while (lower.size() >= 2 && cross(lower.get(lower.size()-2), lower.get(lower.size()-1), p) <= 0) {
                lower.remove(lower.size()-1);
            }
            lower.add(p);
        }

        List<Point> upper = new ArrayList<>();
        for (int i = n-1; i >= 0; i--) {
            Point p = points[i];
            while (upper.size() >= 2 && cross(upper.get(upper.size()-2), upper.get(upper.size()-1), p) <= 0) {
                upper.remove(upper.size()-1);
            }
            upper.add(p);
        }

        lower.remove(lower.size()-1);
        upper.remove(upper.size()-1);
        List<Point> hull = new ArrayList<>();
        hull.addAll(lower);
        hull.addAll(upper);

        double perimeter = 0.0;
        for (int i = 0; i < hull.size(); i++) {
            Point a = hull.get(i);
            Point b = hull.get((i + 1) % hull.size());
            perimeter += distance(a, b);
        }

        System.out.println(Math.round(perimeter));
    }
}
