public class string02 {
    public static void main(String args[]){
        StringBuilder sb = new StringBuilder("hello");
        System.out.println(sb);

        //sb.setCharAt(4, 'M'); // for change char

        //sb.insert(4,'p'); // for insert char

        //sb.delete(7,sb.length());
        //sb.reverse();
        //System.out.println(sb);

        for(int i=0; i<sb.length()/2; i++){
             int front = i;
             int back = sb.length()-1-i;

             char frontChar = sb.charAt(front);
             char backChar = sb.charAt(back);

             sb.setCharAt(front , backChar);
             sb.setCharAt(back,frontChar);
        }
        System.out.println(sb);
    }
}
