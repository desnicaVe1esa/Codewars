public class Tortoise
{
	public static int[] Race(int v1, int v2, int g)
	{
        if (v1 > v2) {
        return null;
        }
        int closingTime =  (g * 3600) / (v2 - v1);
        return new int[]{closingTime / 3600, (closingTime % 3600) / 60, closingTime % 60};
	}
}