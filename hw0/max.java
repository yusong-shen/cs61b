public class Max {
   public static int max(int[] m) {
   	 int idx = 0 ;
   	 int temp = 0;
   	 while(idx < m.length ){
       if (m[idx] >= temp){
       	temp = m[idx];
       }
   	 }
       return temp;
   }
   public static void main(String[] args) {
      int[] numbers = new int[]{9, 2, 15, 2, 22, 10, 6};      
   }
}