package cz.bernhard.playground.cv;

import org.apache.commons.lang.StringUtils;
import org.joda.time.Period;


public class JobSeeker {

	private static final Money CODING_FOR_BEER = Money.forCzech(35000); 

	private String firstName;
	private String lastname;
	private Contact contact;
	private Money requestedSalary;
	private Skill[] skills;

	private void requestedSalary(Money salary) {
		this.requestedSalary = salary;		
	}

	private void skills(Skill... skills) {
		this.skills = skills;		
	}

	private Contact contact() {
		if (contact == null) {
			contact = new Contact();
		}
		
		return contact;
	}


	private JobSeeker firstName(String firstName) {
		this.firstName = firstName;
		return this;
	}
	
	private JobSeeker lastname(String lastname) {
		this.lastname = lastname;
		return this;
	}
	
	@Override
	public String toString() {
		return firstName + " " + lastname + " wants " + requestedSalary + " " + 
			   "for \n" + StringUtils.join(skills, "\n") + "\n" + 
			   "If you are interested here is a contact:\n" + contact.toString();
	}
	
	public static void main(String[] args) {
		
		JobSeeker mb = new JobSeeker();
		
		mb.firstName("Michal").lastname("Bernhard");		
		mb.contact().email("michal@bernhard.cz")
					.icq("93392217")
					.blog("mbernhard.blogspot.com");
		
		mb.skills(
			Skill.of(Skill.JAVA, Level.INTERMEDIATE, Period.years(3)),
			Skill.of(Skill.JAVASCRIPT, Level.BEGINNER),
			Skill.of("C#", Level.BEGINNER, Period.months(6)) // TODO Nov 18, 2010 michal:  
		);
		
		mb.requestedSalary(CODING_FOR_BEER);
		
		System.out.println(mb);
	}

	
}
