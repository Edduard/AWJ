package hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.ArrayList;


@RestController
public class SoferController {
  private List<Sofer> soferi = new ArrayList<Sofer>();

  SoferController() {
    Sofer s1 = new Sofer(1, "Ciobanu", "Ilie", "B+D");
    Sofer s2 = new Sofer(2, "Ciobanu", "Marian", "B+D+C+E");
    Sofer s3 = new Sofer(3, "Eusebiu", "Antonescu", "A");

    soferi.add(s1);
    soferi.add(s2);
    soferi.add(s3);
  }

  @RequestMapping(value="/sofer", method = RequestMethod.GET)
  public List<Sofer> index() {
    return this.soferi;
  }

@RequestMapping(value="/sofer", method = RequestMethod.POST)
  public ResponseEntity create(@RequestBody Sofer s) {
	soferi.add(s);
	
    return new ResponseEntity<Sofer>(s, new HttpHeaders(), HttpStatus.OK);
  }


  @RequestMapping(value="/sofer/{id}", method = RequestMethod.GET)
  public ResponseEntity get(@PathVariable("id") int id) {
    for(Sofer s : this.soferi) {
      if(s.getId() == id) {
        return new ResponseEntity<Sofer>(s, new HttpHeaders(), HttpStatus.OK);
      }
    }
    return new ResponseEntity<String>(null, new HttpHeaders(), HttpStatus.NOT_FOUND);
  }


  @RequestMapping(value="/sofer/{id}/{nume}/{prenume}/{categoriePermis}", method = RequestMethod.PUT)
  public ResponseEntity put(@PathVariable("id") int id, @PathVariable("nume") String nume, @PathVariable("prenume") String prenume, @PathVariable("categoriePermis") String categoriePermis) {
  	for(Sofer s : this.soferi) {
      		if(s.getId() == id) {
			s.setId(id);
			s.setNume(nume);
            s.setPrenume(prenume);
            s.setCategoriePermis(categoriePermis);
			return new ResponseEntity<Sofer>(s, new HttpHeaders(), HttpStatus.OK);	
                }
  	}
	return new ResponseEntity<String>(null, new HttpHeaders(), HttpStatus.NOT_FOUND);
  }
    
    
  @RequestMapping(value="/sofer/{id}", method = RequestMethod.DELETE)
  public ResponseEntity remove(@PathVariable("id") int id) {
    for(Sofer s : this.soferi) {
      if(s.getId() == id) {
        this.soferi.remove(s);
        return new ResponseEntity<String>(null, new HttpHeaders(), HttpStatus.NO_CONTENT);
      }
    }
    return new ResponseEntity<String>(null, new HttpHeaders(), HttpStatus.NOT_FOUND);
  }
}

