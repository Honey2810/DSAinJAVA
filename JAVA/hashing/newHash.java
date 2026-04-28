import java.util.HashSet;
public class newHash {
    public static void Basic(String[] args){
        HashSet<Integer> set = new HashSet<>();
        set.add(5);
        set.add(7);
        set.add(2);
        set.add(9);
        set.add(5);
        System.out.println(set);
    }
    public boolean containsDuplicate(int[] nums){
        HashSet<Integer> set = new HashSet<>();
        for(int num : nums){
            if(set.contains(num)){
                return true;
            }
            set.add(num);
        }
        return false;
    }
    public static void main(String[] args) {
        Basic(args);
        newHash nh = new newHash();
        System.out.println(nh.containsDuplicate(new int[]{1,2,3,4,5}));
    }
}