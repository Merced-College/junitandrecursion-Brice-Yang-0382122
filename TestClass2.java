//Brice Yang 
//Testclass

public class TestClass2 {
    public static void main(String[] args) {
    
}

//Counts "hi" in string
public static int countHi(String str){

    if (str == null) {
        return 0;  
    }

    if(str.length() <= 1){
        return 0;
    }

    if(str.substring(0,2).equals("hi")){
        return 1 + countHi(str.substring(2));
    }

    else{
        return countHi(str.substring(1));
    }

}

//Counts the number of times 8 occurs in an integer. A 8 with another 8 to the left counts double.
public static int countEights(int n){

    if (n < 8){
        return 0;
    }
    
    if (n % 100 == 88) {
        return 2 + countEights(n/10);
    }

    if (n % 10 == 8){
        return 1 + countEights(n/10);
    }

    else{
        return 0 + countEights(n/10);
    }

}

}