package Celebrities;

public class CheckIfSinger implements CheckTalent {
    public boolean test(Celebrity celebrity) {
        return celebrity.canSing();
    }
}
