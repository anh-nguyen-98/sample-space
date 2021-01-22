import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SampleSpace {
    private int n; // length of an outcome(str)
    private Set<String> space;
    private String pattern;

    public SampleSpace(int n, String pattern){
        this.n = n;
        this.pattern = pattern;
        this.space = new HashSet<>();
        this.space = getOutcomes("");
    }
    public Set<String> getSpace(){return this.space;}


    private Set<String> getOutcomes(String outcome){
        if (outcome.length() == this.pattern.length()){
            this.space.add(outcome);
            return this.space;
        }
        if (this.pattern.charAt(outcome.length()) == '0'){
            return getOutcomes(outcome + "0");
        }
        if (this.pattern.charAt(outcome.length()) == '1'){
            return getOutcomes(outcome + "1");
        }
        getOutcomes(outcome + "0");
        return getOutcomes(outcome + "1");

    }

}
