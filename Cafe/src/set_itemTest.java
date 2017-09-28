import static org.junit.Assert.*;

import org.junit.Test;

public class set_itemTest {

	@Test
	public void test() {
		set_item obj= new set_item();
		obj.setValues("abc", 0, 0);
		assertNotNull(obj.getItem());
	    assertNotNull(obj.getPrice()); 
	    assertNotNull(obj.getTime());
	}

}
