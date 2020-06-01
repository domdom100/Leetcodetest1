import java.util.HashMap;

public class HuaDongChuangKou {

    public int test1(String s){
        int n = s.length(), ans =0;

        HashMap<Character, Integer> map = new HashMap<>();

        for (int start=0,end=0;end<n;end++){
            char c = s.charAt(end);
            if (map.containsKey(c)){
                start = Math.max(start, map.get(c));

            }
            map.put(s.charAt(end), end+1);
            ans = Math.max(ans,end-start+1 );
        }
        return ans;
    }
}
