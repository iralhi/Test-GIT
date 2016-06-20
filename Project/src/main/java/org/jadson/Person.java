package org.jadson;

import org.apache.commons.collections.list.GrowthList;

/**
 * A person of my test system
 * 
 * @author jadson santos
 *
 * <p><i>This program is distributed without any warranty and it
 * can be freely redistributed for research, classes or private studies, 
 * since the copyright notices are not removed.</i></p>
 * 
 * git status
 *
 */
public class Person {
	
    /** O nome da pessoa*/
    private String name = "Teste 2.1";
    
    /* cpf da pessoa conflito aqui !!! */
    private String cpf;

    public Person(String name) {
        this.name = name;
        new GrowthList();
    }

    public String getName() {
        return name;
    }
}
