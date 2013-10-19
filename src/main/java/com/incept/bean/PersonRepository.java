/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.incept.bean;

import java.util.ArrayList;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;

/**
 *
 * @author bhalepr
 */
@Named
@ApplicationScoped
public class PersonRepository {

  /**
   * Creates a new instance of PersonRepository
   */
  static ArrayList<Person> list = new ArrayList<>();
  
  public PersonRepository() {
  }
  
  public void add(Person p)  {
    list.add(p);
  }
}
