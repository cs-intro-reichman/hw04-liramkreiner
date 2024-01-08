public class ArrayOps {
    public static void main(String[] args)
    {
        
         System.out.println(findMissingInt(args[0]));
         System.out.println(secondMaxValue(args[0]));
         System.out.println(containsTheSameElements(args[0],args[1]));
         System.out.println(isSorted(args[0]));

    }
    
    public static int findMissingInt (int [] array) {
        for (int i=0;i<array.length+1;i++)//checking all the number from 0 to lengrh
        {
            boolean ifexsist=true;//assume that the number is not exsist
            for(int j=0;j<array.length;j++)
            {
                if(i==array[j])//check if the number exsist
                {
                    ifexsist=false;
                    break;//braeking from the loop beacuse the number exsist
                }
            }
           if(ifexsist)//check if the number exsist
                return i;     
        }
        return -1;
    }

    public static int secondMaxValue(int [] array)
    {
        int maxarry = array[0];//detrer the max
        int secondmax = array[0];//deter the second max
        for (int i=0;i<array.length;i++)
        {
            maxarry = Math.max(array[i],maxarry);//checking what is the max
            secondmax = Math.min(array[i],secondmax);//checking what is the min to be the second max
        }
        for (int i=0;i<array.length-1;i++)
        {
            if(maxarry>array[i]&&array[i]>secondmax)//check if the number is grater than the second max but smaller then max
                secondmax = Math.max(array[i],secondmax);
        }
        return secondmax;



    }

    public static boolean containsTheSameElements(int [] array1,int [] array2)
    {
        for(int i = 0;i<array1.length;i++)//checking if all first arry elments exsist in the second
        {
            boolean isexsist = true;//assume that the elment doesnt exsist
            for (int j=0;j<array2.length;j++)
            {
                if(array1[i]==array2[j])//cheking if the elment exsist
                {
                    isexsist=false;
                    break;//braking from the loop cause the elment exsist
                }

            }
            if(isexsist)
                return false;
        }

         for(int i = 0;i<array2.length;i++)//checking the oppoist direction
        {
             boolean isexsist = true;//assume that the elment doesnt exsist
            for (int j=0;j<array1.length;j++)
            {
                if(array2[i]==array1[j])//cheking if the elment exsist
                {
                    isexsist=false;
                    break;//braking from the loop cause the elment exsist
                }

            }
            if(isexsist)
                return false;
        }
        return true;
    }

    public static boolean isSorted(int [] array)
    {
        if(array[0]<array[1])//cheking if is increasing
        {
            for(int i=1;i<array.length;i++)
                if(array[i]<array[i-1])//if the arry isnot increasig then returning false
                    return false;
            return true;    
        }
         if(array[0]>array[1])//checking if the function decreasing
        {
            for(int i=1;i<array.length;i++)
                if(array[i]>array[i-1])//if one time the function is not decrease return false
                    return false;
            return true;    
        }
        return false;
    }

}
