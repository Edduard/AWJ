package hello;

import java.util.List;
import java.util.ArrayList;

public class Masina {
  private int id; 
  private String marca;
  private String model;

  public Masina() {}

  public Masina(int id, String marca, String model) {
      this.id = id;
      this.marca = marca;
      this.model = model;
  }

  public void setId(int id){
	this.id = id;
  }
  public int getId() {
    return this.id;
  }
    
  public void setMarca(String Marca){
	this.marca = Marca;
  }
  public String getMarca() {
      return this.marca;
  }

  public void setModel(String Model){
	this.model = Model;
  }
  public String getModel() {
      return this.model;
  }


}