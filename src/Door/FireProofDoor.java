package Door;

/**
 * Created by 13120 on 2020/4/15.
 */
public class FireProofDoor extends Door implements FireSafe {
    @Override
    public void fireProof() {
        System.out.println("防火");
    }
}
