public class StringOps {
    ////////////////////////////////////////////////////////////
    //////                                               ///////
    //////              Reminder:                        ///////
    //////        allowed methods                        ///////
    //////                                               ///////
    //////        1.charAt(int index)                    ///////
    //////        2.length()                             ///////
    //////        3.substring(int start)                 ///////
    //////        4.substring(int start,int ends)        ///////
    //////        5.indexOf(String str)                  ///////
    //////                                               ///////
    //////        The rest are not allowed !             ///////
    //////        if you want to use a different         ///////
    //////        method, and you can implement          ///////
    //////        it using material from the course      ///////
    //////        you need to implement a version of     ///////
    //////        the function by yourself.              ///////
    //////                                               ///////
    //////        see example for substring              ///////
    //////        in Recitation 3 question 5             ///////
    //////                                               ///////
    ////////////////////////////////////////////////////////////
    public static void main(String[] args) 
    {
     System.out.println(capVowelsLowRest("onE twO thrEE wOrld"));   
    }

    public static String capVowelsLowRest (String s) {
        String newone="";
        char newchar ='a';
        String forcheck = "AEIOUaeiou";
        for(int i = 0;i<s.length(); i++)
        {   
            int valueofchar=s.charAt(i);//getting the value of the char
            if(forcheck.indexOf(s.charAt(i))>-1)//check if the letter is one of the chosen one
            {
                if(64<valueofchar&&valueofchar<91)//check if the letter is Capital
                    newchar = (char)(valueofchar);
                else newchar = (char)(valueofchar-32);//the letter his small one so i will make it capital
            }
            else 
            {
                if(64<valueofchar&&valueofchar<91)//check if the letter is Capital
                    newchar = (char)(valueofchar+32 );
                else newchar = (char)(valueofchar);//the letter his small one so i will make it capital
            }
            newone += newchar;//adding the char

        }

        return newone;
    }

    public static String camelCase (String s) 
    {
        
        String newone = "";
        char newchar = s.charAt(0) ;
        int valueofchar = s.charAt(0);
        int indexfirst = 0; 
        for(int i=0;i<s.length();i++) //checking what is the first letter
        {
            if(s.charAt(i) != ' ')
            {
                valueofchar = s.charAt(i); 
                newchar = s.charAt(i) ;
                if(64<valueofchar&&valueofchar<91)//check if the letter is Capital
                newchar = (char)(valueofchar+32 );
                newone +=newchar;
                indexfirst = i;//saving the first index of letter
                break;
            }
        }
         for(int i=indexfirst+1;i<s.length();i++)
         {
            valueofchar = s.charAt(i);
            if(s.charAt(i) != ' ')//check if this is not space
            {
                if(s.charAt(i-1) == ' ')//check if previous char was space
                {

                    if(valueofchar>91)//check if it is small letter
                        newchar = (char)(valueofchar -32 ); //making the letter to be capital
                        else newchar = (char)(valueofchar);
                        newone +=newchar;//adding the char
                }
            
                else 
                {
                    if(64<valueofchar&&valueofchar<91)//check if the letter is Capital
                        newchar = (char)(valueofchar+32 );
                    else newchar = (char)(valueofchar);//if itsnot capital letter
                    newone +=newchar;//adding the char
                }

            }
         }
        return newone;
    }

    public static int[] allIndexOf (String s, char chr) {
        int count = 0;//counting how many time the letter exsist
        for(int i=0;i<s.length();i++)
            if(s.charAt(i)==chr)//counting it
                count++;
        int[] allindex = new int [count];
        int indexofarrry = 0;//checking the index of the arry
        for(int i=0;i<s.length();i++)//put the exsist index on the arry
            if(s.charAt(i)==chr)
            {
                allindex[indexofarrry]=i;
                indexofarrry++;
            }
            return allindex;
    }
}
