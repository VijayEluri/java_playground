import cz.bernhard.playground.DiacriticsRemover;
import cz.bernhard.playground.DiacriticsRemoverIcuImpl;

public class DiacriticsRemoverJdkImpl extends DiacriticsRemoverTest {

    @Override
    protected DiacriticsRemover getDiacriticsRemover() {
        return new DiacriticsRemoverIcuImpl();
    }

}
