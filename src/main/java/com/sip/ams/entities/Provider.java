package com.sip.ams.entities;
//import static com.sip.ams.controllers.Stagiaire.*;

public class Provider extends Object{
private String name ;
private String email;
private String adresse;

public Provider() {
	super();
}
public Provider(String name, String email, String adresse) {
	super();
	//System.out.println(PI);
	//info();
	this.name = name;
	this.email = email;
	this.adresse = adresse;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getAdresse() {
	return adresse;
}
public void setAdresse(String adresse) {
	this.adresse = adresse;
}

@Override
public String toString() {
	return "Provider [name=" + name + ", email=" + email + ", adresse=" + adresse + "]";
}


}
