public class countHi{

//Counts "hi" in string
    public static int count(String str){

        if (str == null){
            return 0;  
        }

        if (str.length() <= 1){
            return 0;
        }

//-------------------------------------------------------------------------

        if (str.substring(0,2).equals("hi")){
            return 1 + count(str.substring(2));
        }

        else{
            return count(str.substring(1));
        }

    }
}