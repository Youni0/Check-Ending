public class Main {
    public static void main(String[] args) {

    }
    public static boolean check(String x,String y){
        boolean check=false;
        if(y.equals(x.substring((x.length() - y.length())))){
            check=true;
        }
        return check;
    }
}