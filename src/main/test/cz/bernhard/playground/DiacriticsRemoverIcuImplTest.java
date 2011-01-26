package cz.bernhard.playground;



public class DiacriticsRemoverIcuImplTest extends DiacriticsRemoverTest {

    @Override
    protected DiacriticsRemover getDiacriticsRemover() {
        return new DiacriticsRemoverIcuImpl();
    }
    
  
    
  
}
