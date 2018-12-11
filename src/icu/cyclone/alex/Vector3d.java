package icu.cyclone.alex;

public class Vector3d {

    private int vector[];

    public Vector3d() {
        this.vector = new int[] { 0, 0, 0 };
    }

    public Vector3d(int x, int y, int z) {
        this.vector = new int[] { x, y, z };
    }

    public void setX(int x) {
        this.vector[0] = x;
    }

    public void setY(int y) {
        this.vector[1] = y;
    }

    public void setZ(int z) {
        this.vector[2] = z;
    }

    public int getX() {
        return this.vector[0];
    }

    public int getY() {
        return this.vector[1];
    }

    public int getZ() {
        return this.vector[2];
    }

    public static Vector3d summ(Vector3d... vector) {
        Vector3d c = new Vector3d();
        for (Vector3d vectors : vector) {
            c.setX(c.getX() + vectors.getX());
            c.setY(c.getY() + vectors.getY());
            c.setZ(c.getZ() + vectors.getZ());
        }
        return c;
    }

    public static int productScalar(Vector3d a, Vector3d b) {
        return a.getX() * b.getX() + a.getY() * b.getY() + a.getZ() * b.getZ();
    }

    public static Vector3d productVector(Vector3d a, Vector3d b) {
        Vector3d c = new Vector3d();
        c.setX(a.getY() * b.getZ() - a.getZ() * b.getY());
        c.setY(a.getZ() * b.getX() - a.getX() * b.getZ());
        c.setZ(a.getX() * b.getY() - a.getY() * b.getX());
        return c;
    }

    @Override
    public String toString() {
        return "(" +  vector[0] + ", " +  vector[1] + ", " +  vector[2] + ')';
    }

}
