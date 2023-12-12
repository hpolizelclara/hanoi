import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TorreHanoiTest {
    @Test
    public void testResolverHanoiComTresDiscos() {
        TorreHanoi torreHanoi = new TorreHanoi();
        torreHanoi.resolverHanoi(3, "A", "C", "B");
        assertEquals(7, torreHanoi.getMovimentos());
    }

    @Test
    public void testResolverHanoiComCincoDiscos() {
        TorreHanoi torreHanoi = new TorreHanoi();
        torreHanoi.resolverHanoi(5, "A", "C", "B");
        assertEquals(31, torreHanoi.getMovimentos());
    }

    @Test
    public void testResolverHanoiComSeteDiscos() {
        TorreHanoi torreHanoi = new TorreHanoi();
        torreHanoi.resolverHanoi(7, "A", "C", "B");
        assertEquals(127, torreHanoi.getMovimentos());
    }
}

