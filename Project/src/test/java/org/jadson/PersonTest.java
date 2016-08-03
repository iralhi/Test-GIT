package org.jadson;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * A test for person of my system
 * 
 * @author jadson
 *
 * <p><i>This program is distributed without any warranty and it
 * can be freely redistributed for research, classes or private studies, 
 * since the copyright notices are not removed.</i></p>
 *
 */
public class PersonTest {
	
	/**
	 * Test is a person was created with correctly name
	 */
    @Test
    public void canConstructAPersonWithAName() {
        Person person = new Person("Larrya");
        assertEquals("Larrya", person.getName());
    }
}
