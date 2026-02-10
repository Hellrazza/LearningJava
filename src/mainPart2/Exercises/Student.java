public class Student extends PersonIN {
    private int studyCredits;
    public Student(String name, String address) {
        super(name, address);
        studyCredits = 0;
    }

    public void study() {
        studyCredits++;
    }

    public int getStudyCredits()  {return studyCredits;}

    public String toString() {
        return super.toString() + "\n Study credits: " + studyCredits;
    }
}
