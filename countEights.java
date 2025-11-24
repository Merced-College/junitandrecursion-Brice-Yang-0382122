public class countEights{

//Counts the number of times 8 occurs in an integer. A 8 with another 8 to the left counts double.
    public static int count(int n){

        if (n < 8){
            return 0;
        }
        
//---------------------------------

        if (n % 100 == 88){
            return 2 + count(n/10);
        }

        if (n % 10 == 8){
            return 1 + count(n/10);
        }

        else{
            return 0 + count(n/10);
        }

    }
}