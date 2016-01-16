package hello;

import java.util.List;
import java.util.ArrayList;

public class Sofer {
  private int id; 
  private String nume;
  private String prenume;
  private String categoriePermis;

  public Sofer() {}

  public Sofer(int id, String nume, String prenume, String categoriePermis) {
      this.id = id;
      this.nume = nume;
      this.prenume = prenume;
      this.categoriePermis = categoriePermis;
  }

  public void setId(int id){
	this.id = id;
  }
  public int getId() {
    return this.id;
  }
    
  public void setNume(String nume){
	this.nume = nume;
  }
  public String getNume() {
      return this.nume;
  }
    
  public void setPrenume(String prenume){
	this.prenume = prenume;
  }
  public String getPrenume() {
      return this.prenume;
  }

  public void setCategoriePermis(String CategoriePermis){
	this.categoriePermis = categoriePermis;
  }
  public String getCategoriePermis() {
      return this.categoriePermis;
  }


}