package stringPractice1068;

import static org.junit.Assert.*;

import org.junit.Test;

public class SomePracticeStringMethodsTest {

	@Test
	public void testIsPunct() {
		assertTrue(SomePracticeStringMethods.isPunct(';'));
		assertTrue(SomePracticeStringMethods.isPunct(','));
		assertTrue(SomePracticeStringMethods.isPunct('.'));
		assertTrue(SomePracticeStringMethods.isPunct(':'));
		assertTrue(SomePracticeStringMethods.isPunct('\''));
		assertFalse(SomePracticeStringMethods.isPunct('a'));
		assertFalse(SomePracticeStringMethods.isPunct('K'));
		assertFalse(SomePracticeStringMethods.isPunct('0'));
	}

	@Test
	public void testIndexOfFirstPunctString() {
		assertEquals(-1, SomePracticeStringMethods.indexOfFirstPunct("Hi"));
		assertEquals(0, SomePracticeStringMethods.indexOfFirstPunct(", abcd."));
		assertEquals(4, SomePracticeStringMethods.indexOfFirstPunct("abcd."));
		assertEquals(2, SomePracticeStringMethods.indexOfFirstPunct("ab;cd."));
	}

	@Test
	public void testIndexOfFirstPunctStringInt() {
		assertEquals(-1, SomePracticeStringMethods.indexOfFirstPunct("Hi", 5));
		assertEquals(6, SomePracticeStringMethods.indexOfFirstPunct(", abcd.", 1));
		assertEquals(4, SomePracticeStringMethods.indexOfFirstPunct("abcd.", 4));
		assertEquals(2, SomePracticeStringMethods.indexOfFirstPunct("ab;cd.", 1));
	}

	@Test
	public void testIndexOfLastPunct() {
		assertEquals(-1, SomePracticeStringMethods.indexOfLastPunct("Hi"));
		assertEquals(6, SomePracticeStringMethods.indexOfLastPunct(", abcd."));
		assertEquals(4, SomePracticeStringMethods.indexOfLastPunct("abcd."));
		assertEquals(5, SomePracticeStringMethods.indexOfLastPunct("ab;cd."));
	}

	@Test
	public void testReversed() {
		assertEquals("cba", SomePracticeStringMethods.reversed("abc"));
		assertEquals("a", SomePracticeStringMethods.reversed("a"));
	}

	@Test
	public void testNumOccurrences() {
		assertEquals(2, SomePracticeStringMethods.numOccurrences("banana", "na"));
		assertEquals(2, SomePracticeStringMethods.numOccurrences("mississippi", "ss"));
		assertEquals(0, SomePracticeStringMethods.numOccurrences("undertow", "sushi"));
	}

	@Test
	public void testSameInReverse() {
		assertTrue(SomePracticeStringMethods.sameInReverse("peep"));
		assertTrue(SomePracticeStringMethods.sameInReverse("madam"));
		assertTrue(SomePracticeStringMethods.sameInReverse("rotator"));
		assertFalse(SomePracticeStringMethods.sameInReverse("blue"));
		assertFalse(SomePracticeStringMethods.sameInReverse("aspirin"));
		assertFalse(SomePracticeStringMethods.sameInReverse("ab"));
		assertTrue(SomePracticeStringMethods.sameInReverse("a"));
	}

	@Test
	public void testWithoutPunct() {
		assertEquals("a", 
				SomePracticeStringMethods.withoutPunct("a"));		
		assertEquals("", 
				SomePracticeStringMethods.withoutPunct(","));		
		assertEquals("hithere", 
				SomePracticeStringMethods.withoutPunct(",hi,there,"));		
		assertEquals("stuff", 
				SomePracticeStringMethods.withoutPunct(".stuff"));		
		assertEquals("stuff", 
				SomePracticeStringMethods.withoutPunct("stuff."));	
	}

	@Test
	public void testAppendIfMissing() {
		assertEquals("lightningbug", SomePracticeStringMethods.appendIfMissing("lightning", "bug"));
		assertEquals("lightningbug", SomePracticeStringMethods.appendIfMissing("lightningbug", "bug"));
		assertEquals("Spongebob", SomePracticeStringMethods.appendIfMissing("Sponge", "bob"));
	}

	@Test
	public void testContainsNone() {
		assertFalse(SomePracticeStringMethods.containsNone("you're", "going"));
		assertTrue(SomePracticeStringMethods.containsNone("to", "need"));
		assertTrue(SomePracticeStringMethods.containsNone("a", "bigger"));
		assertTrue(SomePracticeStringMethods.containsNone("boat", "."));
	}

	@Test
	public void testAllUpperCase() {
		assertTrue(SomePracticeStringMethods.allUpperCase("A"));
		assertTrue(SomePracticeStringMethods.allUpperCase("APPLE"));
		assertFalse(SomePracticeStringMethods.allUpperCase("ArdvarK"));
		assertFalse(SomePracticeStringMethods.allUpperCase("ArdvarK."));
		assertFalse(SomePracticeStringMethods.allUpperCase("; .*"));
	}

	@Test
	public void testAllLowerCase() {
		assertTrue(SomePracticeStringMethods.allLowerCase("a"));
		assertTrue(SomePracticeStringMethods.allLowerCase("apple"));
		assertFalse(SomePracticeStringMethods.allLowerCase("aRDVARk"));
		assertFalse(SomePracticeStringMethods.allLowerCase("aRDVARk."));
		assertFalse(SomePracticeStringMethods.allLowerCase("; .*"));
	}
}
