public class strCount {

    public static int count(String str, String sub){

        if (str == null){
            return 0;
        }

        if (sub == null){
            return 0;
        }
       
        if (str.length() < sub.length()){
            return 0;
        }

//----------------------------------------------------------------

        if (str.substring(0,sub.length()).equals(sub)){
            return 1 + count(str.substring(sub.length()), sub);
        }

        else{
            return 0 + count(str.substring(1), sub);
        }

    }
}
