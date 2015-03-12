package org.author.model;

import java.io.Serializable;
import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Author implements Serializable {

    private Long id;

    private String firstname;

    private String lastname;

    private Date DOB;

    private String about;

    public Long getId() {
	return this.id;
    }

    public void setId(final Long id) {
	this.id = id;
    }

    public String getFirstname() {
	return firstname;
    }

    public void setFirstname(String firstname) {
	this.firstname = firstname;
    }

    public String getLastname() {
	return lastname;
    }

    public void setLastname(String lastname) {
	this.lastname = lastname;
    }

    public Date getDOB() {
	return DOB;
    }

    public void setDOB(Date DOB) {
	this.DOB = DOB;
    }

    public String getAbout() {
	return about;
    }

    public void setAbout(String about) {
	this.about = about;
    }

    @Override
    public boolean equals(Object obj) {
	if (this == obj)
	    return true;
	if (obj == null)
	    return false;
	if (getClass() != obj.getClass())
	    return false;
	Author other = (Author) obj;
	if (DOB == null) {
	    if (other.DOB != null)
		return false;
	} else if (!DOB.equals(other.DOB))
	    return false;
	if (about == null) {
	    if (other.about != null)
		return false;
	} else if (!about.equals(other.about))
	    return false;
	if (firstname == null) {
	    if (other.firstname != null)
		return false;
	} else if (!firstname.equals(other.firstname))
	    return false;
	if (lastname == null) {
	    if (other.lastname != null)
		return false;
	} else if (!lastname.equals(other.lastname))
	    return false;
	return true;
    }

    @Override
    public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((DOB == null) ? 0 : DOB.hashCode());
	result = prime * result + ((about == null) ? 0 : about.hashCode());
	result = prime * result
		+ ((firstname == null) ? 0 : firstname.hashCode());
	result = prime * result
		+ ((lastname == null) ? 0 : lastname.hashCode());
	return result;
    }

    @Override
    public String toString() {
	String result = getClass().getSimpleName() + " ";
	if (firstname != null && !firstname.trim().isEmpty())
	    result += "firstname: " + firstname;
	if (lastname != null && !lastname.trim().isEmpty())
	    result += ", lastname: " + lastname;
	if (about != null && !about.trim().isEmpty())
	    result += ", about: " + about;
	return result;
    }
}