package hello;

import java.util.List;
import java.util.ArrayList;

public class Persoana {
  private String name;
  private int id;

  public Persoana() {}

  public Persoana(int id, String name) {
      this.name = name;
      this.id = id;
  }

  public void setId(int id){
	this.id = id;
  }
  public void setName(String name){
	this.name = name;
  }
  public String getName() {
      return this.name;
  }

  public int getId() {
    return this.id;
  }
}