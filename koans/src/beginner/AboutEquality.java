package beginner;

import com.sandwich.koan.Koan;

import static com.sandwich.util.Assert.assertEquals;

public class AboutEquality {

	@Koan
	public void doubleEqualsTestsIfTwoObjectsAreTheSame(){
		Object object = new Object();
		Object sameObject = object;
		assertEquals(object == sameObject, true);
		assertEquals(object == new Object(), false);
	}

	@Koan
	public void equalsMethodByDefaultTestsIfTwoObjectsAreTheSame(){
		Object object = new Object();
		assertEquals(object.equals(object), true);
		assertEquals(object.equals(new Object()), false);
	}

	@Koan
	public void equalsMethodCanBeChangedBySubclassesToTestIfTwoObjectsAreEqual(){
		Object object = new Integer(1);
		assertEquals(object.equals(object), true);
		assertEquals(object.equals(new Integer(1)), true);
		// Note: This means that for the class 'Object' there is no difference between 'equal' and 'same'
	}

	@Koan
	public void objectsNeverEqualNull(){
		assertEquals(new Object().equals(null), false);
	}

	@Koan
	public void objectsEqualThemselves(){
		Object obj = new Object();
		assertEquals(obj.equals(obj), true);
	}
}