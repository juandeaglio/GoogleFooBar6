public class Solution
{
    public static int CountLuckyTriples(int[] accessCodes)
    {
        int luckyTriples = 0;
        for(int i = 0; i < accessCodes.length-2; i++)
        {
            for(int j = i+1; j < accessCodes.length-1; j++)
            {
                for(int k = j+1; k < accessCodes.length; k++)
                {
                    if(accessCodes[j] %accessCodes[i] == 0 && accessCodes[k] %accessCodes[j]  == 0)
                        luckyTriples++;
                }
            }

        }
        return luckyTriples;
    }

}
