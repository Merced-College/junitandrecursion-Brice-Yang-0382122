public class stringClean {

        public static String clean(String str){

        if (str == null){
            return "null";
        }

        if (str.length() <= 1){
            return str;
        }

//----------------------------------------------------------------

        if (str.substring(0,1).equals(str.substring(1,2))){
            return clean(str.substring(1));
        }

        else{
            return str.substring(0,1) + clean(str.substring(1));
        }

    }
}
