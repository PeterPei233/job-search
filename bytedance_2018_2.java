import java.util.*;

class node{
    int[] color;
    int num;
    node(int n){
        num = n;
        color = new int[n];
    }
    node next;
}
public class Main{
    static public void main(String[] args){
        Scanner sc = new Scanner(System.in);
        LinkedList<Integer> current = new LinkedList<>();
        int n = sc.nextInt();
        int m =sc.nextInt();
        int c = sc.nextInt();
        boolean[] res = new boolean[c];
        int num = sc.nextInt();
        node first = new node(num);
        for(int i =0;i<num;i++){
            first.color[i] = sc.nextInt();
        }
        node pre = first;
        while(sc.hasNext()){
            num = sc.nextInt();
            node cur = new node(num);
            for(int i =0;i<num;i++) cur.color[i] = sc.nextInt();
            pre.next = cur;
            pre = cur;
        }
        pre.next = first;
        pre = first;
        for(int i =0;i<m-1;i++){
            for(int j =0;j<pre.num;j++) current.add(pre.color[j]);
            pre = pre.next;
        }
        for(int i = 0;i<n;i++){
            for(int j = 0;j<pre.num;j++){
                int k = pre.color[j];
                if(!res[k-1]&&current.contains(pre.color[j])) res[k-1] = true;
                current.add(k);
            }
            for(int j = 0; j<first.num;j++){
                current.pop();
            }
            first =first.next;
            pre = pre.next;
        }
        int count=0;
        for(int i = 0;i<c;i++){
            if(res[i]) count ++;
        }
        System.out.println(count);
    }
}