package kodlamaio.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="job_titles")
public class JobTitles {
	
	@Id
	@GeneratedValue
	@Column(name="id")
	private int id;
	
	@Column(name="title")
	private String jobTitle;
	
	public JobTitles() {}
	
	public JobTitles(int id, String jobTitle) {
		super();
		this.id = id;
		this.jobTitle = jobTitle;
	}

}
