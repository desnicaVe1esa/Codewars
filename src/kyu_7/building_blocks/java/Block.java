package kyu_7.building_blocks.java;

public class Block{
    private int width;
    private int length;
    private int height;

    public Block(int[] data) {
        this.width = data[0];
        this.length = data[1];
        this.height = data[2];
    }

    public int getWidth() {
        return width;
    }

    public int getLength() {
        return length;
    }

    public int getHeight() {
        return height;
    }

    public int getVolume() {
        return width * length * height;
    }

    public int getSurfaceArea() {
        return 2 * length * width + 2 * length * height + 2 * width * height;
    }
}