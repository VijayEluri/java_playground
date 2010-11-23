package cz.bernhard.playground.cv;

import org.apache.commons.lang.builder.StandardToStringStyle;
import org.apache.commons.lang.builder.ToStringBuilder;

public class Contact {

	private String email;
	private String icq;
	private String blogUrl;

	public Contact icq(String icq) {		
		this.icq = icq;
		return this;
	}
	
	public Contact blog(String blogUrl) {
		this.blogUrl = blogUrl;
		return this;		
	}
	
	public Contact email(String email) {
		this.email = email;
		return this;		
	}
	
	@Override
	public String toString() {
		ToStringBuilder tsb = new ToStringBuilder(this, toStringStyle());
		
		/* 
		 * I am not using chaining because of maintenance is more easier.
		 * Eg. When I want to rearrange order of fields I just move the
		 * appropriate line up or down and no other editing is needed.
		 * With chaining (tsb.append("email").append("icq")
		 * you would have to cut, paste and create/delete dots to change
		 * order of appending texts... It's just easier ALT + UP/DOWN (eclipse ide) 
		 * to move lines...
		 **/
		tsb.append("Email", email);
		tsb.append("Blog", blogUrl);
		tsb.append("ICQ", icq);
						
		return tsb.toString();
	}

	private StandardToStringStyle toStringStyle() {
		StandardToStringStyle toStringStyle = new StandardToStringStyle();
		toStringStyle.setFieldSeparator("\n");
		toStringStyle.setFieldNameValueSeparator(": ");
		toStringStyle.setContentStart("");
		toStringStyle.setContentEnd("");
		return toStringStyle;
	}
	
}