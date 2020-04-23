package Door;

/**
 * Created by 13120 on 2020/4/15.
 */
public class BulletProofDoor extends Door implements BulletSafe {
    @Override
    public void bulletProof() {
        System.out.println("防弹");
    }
}
