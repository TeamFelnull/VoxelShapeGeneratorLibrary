package dev.felnull.vsgl.physics;

import java.util.Objects;

public class Vec3d {
    private final double x;
    private final double y;
    private final double z;

    public Vec3d(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getZ() {
        return z;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vec3d vec3d = (Vec3d) o;
        return Double.compare(vec3d.x, x) == 0 && Double.compare(vec3d.y, y) == 0 && Double.compare(vec3d.z, z) == 0;
    }

    public double getDistance(Vec3d vec) {
        return Math.abs(Math.sqrt(Math.pow(vec.x - x, 2) + Math.pow(vec.y - y, 2) + Math.pow(vec.z - z, 2)));
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y, z);
    }

    @Override
    public String toString() {
        return "Vec3d{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                '}';
    }
}
