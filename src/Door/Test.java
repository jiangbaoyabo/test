package Door;

/**
 * Created by 13120 on 2020/4/15.
 */
public class Test {
    public static void main(String[] args) {
        FireProofDoor fireProofDoor = new FireProofDoor();
        BulletProofDoor bulletProofDoor =new BulletProofDoor();
        fireProofDoor.close();
        fireProofDoor.open();
        fireProofDoor.fireProof();
        bulletProofDoor.close();
        bulletProofDoor.open();
        bulletProofDoor.bulletProof();
    }
}
