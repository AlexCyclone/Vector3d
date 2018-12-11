package icu.cyclone.alex;

public class Main {
    public static void main(String[] args) {

        Vector3d[] v = new Vector3d[4];

        for (int i = 0; i < v.length; i++) {
            v[i] = new Vector3d((int) (Math.random() * 10), (int) (Math.random() * 10), (int) (Math.random() * 10));
            System.out.println("" + (char) ('a' + i) + " = " + v[i]);
        }

        System.out.println("a + b = " + Vector3d.summ(v[0], v[1]));
        System.out.println("c + d = " + Vector3d.summ(v[2], v[3]));
        System.out.println("a + b + c + d = " + Vector3d.summ(v));

        for (int i = 1; i < v.length; i++) {
            System.out.println("a · " + (char) ('a' + i) + " = " + Vector3d.productScalar(v[0], v[i]));
            System.out.println("a x " + (char) ('a' + i) + " = " + Vector3d.productVector(v[0], v[i]));
        }
    }
}
