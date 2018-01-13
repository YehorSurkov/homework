package lesson8;

/**
 * Created by student on 10.01.2018.
 */
public class StudentPhD extends Student {
    StudentPhD(String fN, String lN, String g, double M) {
        super(fN, lN, g, M);
    }

    private String sciWork;

    public StudentPhD(String fN, String lN, String g, double M, String sci) {
        super(fN, lN, g, M);
        sciWork = sci;
    }

    public String getSciWork() {
        return sciWork;
    }

    public void setSciWork(String sciWork) {
        this.sciWork = sciWork;
    }
}
