package dataCodeController.Model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "DataFirst")
public class DataFirst   {

	
	    public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

		@Id
	    @GeneratedValue(strategy=GenerationType.AUTO)
	  //  @SequenceGenerator(name = "player_Sequence", sequenceName = "PLAYER_SEQ")
	   // @GeneratedValue
	    @Column(name = "survey_id", unique = true, nullable = false)
	    private Long id;
	    
	    @Column(name = "name")	    
	    private String name;
	    
	    @Column(name = "num")
	    private int num;
	    
	
}
