import java.util.HashSet;
import java.util.Set;

public class SampleSpaceClient {
    public static void main (String[] args){
        int n = 5;
        SampleSpace space3 = new SampleSpace(n, "12121");
        SampleSpace space2 = new SampleSpace(n, "22112");
        SampleSpace space1 = new SampleSpace(n, "11222");
        space1.getSpace().addAll(space2.getSpace());
        space1.getSpace().addAll(space3.getSpace());

        SampleSpace A = new SampleSpace(n, "22200");
        space1.getSpace().retainAll(A.getSpace());
        Set<String> s = space1.getSpace();
        System.out.println("\nTotal outcomes: ");
        System.out.println(s.size());
        System.out.println("\nSample space:");
        for (String o: s){
            System.out.println (o);
        }




    }
}
