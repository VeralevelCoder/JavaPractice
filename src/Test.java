import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Test {
    public static void main(String[] args) {
        Subclass s1 = new Subclass();
        s1.foo();
        Super s = new Subclass();
        ((Subclass) s).foo();
//        Set set = new TreeSet();
//        set.add(1);
//        set.add("2");
//        set.add(3);
//        System.out.println(set);
        String a="abc";
        String b  ="abc";
        System.out.println(a.concat(b));
        Set<String> set = new HashSet<>();

    }

}
class Super{
    private void  foo(){
        System.out.println("Super");
    }
}
class Subclass extends Super{
    public void foo(){
        System.out.println("Subclass");
    }
}