import java.util.List;

public class Person {
    String name;
    String birth;
    String role;
    List<String> award;

    public Person(String name, String birth, String role, List<String> award) {
        this.name = name;
        this.birth = birth;
        this.role = role;
        this.award = award;
    }

    void addAward(String awardName) {
        this.award.add(awardName);
    }

    void removeAward(String awardName) {
        this.award.remove(awardName);
    }
}
