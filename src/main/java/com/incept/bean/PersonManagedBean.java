package com.incept.bean;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.Serializable;
import javax.faces.view.ViewScoped;
import javax.inject.Named;
import javax.inject.Inject;

/**
 *
 * @author bhalepr
 */
@Named(value = "personManagedBean")
@ViewScoped
public class PersonManagedBean  implements Serializable{

  /**
   * Creates a new instance of PersonManagedBean
   */
  public PersonManagedBean() {
  }
  
  String name;
  Integer age;
  
  @Inject
  PersonRepository rep;

  public void createPerson() {
    Person p = new Person(name, age);
    rep.add(p);
  }

  public String getName() {
    return name;
  }

  public void setName(String _name) {
    this.name = _name;
  }

  public Integer getAge() {
    return age;
  }

  public void setAge(Integer _age) {
    this.age = _age;
  }
}
