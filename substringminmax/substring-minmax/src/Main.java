public class Main {

    public static String getSmallestAndBiggestString(String s, int k){
        String smallest = s.substring(0, k);
        String largest = s.substring(0, k);

        for (int i=1; i<=s.length()-k; i++){
            String sub = s.substring(i, i+k);
            if (sub.compareTo(smallest)<0){
                smallest=sub;
            }
            if(sub.compareTo(largest)>0){
                largest=sub;
            }
        }
        return smallest + "\n" + largest;
    }

    public static void main(String[] args) {
        String result = getSmallestAndBiggestString("atalayberkcirak", 3);
        System.out.println(result);
    }
}