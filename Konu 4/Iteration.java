public class Iteration {
    public static void main(String[] args) {
        int a = 0;
        for(int i=0; i<10; i++) {
            for(int j = 0; j<10; j++) {
                if(j==5){
                    continue;
                }
                System.out.println(i+""+j);

            }
        }
}
}
