package Celebrities;

public class CheckifActor implements CheckTalent {
    @Override
    public boolean test(Celebrity celebrity) {
        return celebrity.canAct();
    }
}
