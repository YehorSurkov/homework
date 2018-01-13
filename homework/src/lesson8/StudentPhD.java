package lesson8;

public class StudentPhD extends Student {
    private String sciWork;

    StudentPhD(String fN, String lN, String g, double M) {
        super(fN, lN, g, M);
    }

    StudentPhD(String fN, String lN, String g, double M, String sci) {
        super(fN, lN, g, M);
        sciWork = sci;
    }

    public String getSciWork() {
        return sciWork;
    }

    public void setSciWork(String sciWork) {
        this.sciWork = sciWork;
    }

    public int getScholarship() {
        if (getAverageMark() == 5) {
            return 200;
        } else {
            return 160;
        }
    }
}
