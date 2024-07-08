public class Block
{
    private int width;
    private int length;
    private int height;

    public Block(int[] data)
     {
        width = data[0];
        length = data[1];
        height = data[2];
    }

    public int GetWidth()
    {
        return width;
    }

    public int GetLength()
    {
        return length;
    }

    public int GetHeight()
    {
        return height;
    }

    public int GetVolume()
    {
        return width * length * height;
    }

    public int GetSurfaceArea()
    {
        return 2 * length * width + 2 * length * height + 2 * width * height;
    }
}