import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        HashMap<Integer,LinkedList<Integer>> times = new HashMap<>();
        for(int i =0;i<n;i++){
            int key = sc.nextInt();
            if(!times.containsKey(key)){
                LinkedList<Integer> list = new LinkedList<>();
                list.add(i+1);
                times.put(key,list);
            }
            else times.get(key).add(i+1);
        }
        int q = sc.nextInt();
        for(int i = 0; i<q;i++){
            int l = sc.nextInt();
            int r = sc.nextInt();
            int k = sc.nextInt();
            int count = 0;
            LinkedList<Integer> list = new LinkedList<>();
            if(!times.containsKey(k)){
                System.out.println(0);
                continue;
            }
            else list = times.get(k);
            for(int j = 0;j<list.size();j++){
                if(list.get(j)>r) break;
                if(list.get(j)>=l) count++;
            }
            System.out.println(count);
        } 
    }
}