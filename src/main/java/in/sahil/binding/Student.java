package in.sahil.binding;

import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table
public class Student 
{
	    @Id
		private Integer id;
	    
	    private String name;
	    
	    private Long ranks;
	    
	    private String gender;
	    
	    
	   
	    @UpdateTimestamp
	    private LocalDateTime updateDate;

	    @CreationTimestamp
	    private LocalDateTime createDate;
	    
	    @Column(name="ACTIVE_SW")
	    private String activeSw;
	    
	    
	    
	    
	    public Student(Integer id, String name, Long ranks, String gender,String activeSw) {
			super();
			this.id = id;
			this.name = name;
			this.ranks = ranks;
			this.gender = gender;
//			this.updateDate = updateDate;
//			this.createDate = createDate;
			this.activeSw = activeSw;
		}

		public String getActiveSw() {
			return activeSw;
		}

		public void setActiveSw(String activeSw) {
			this.activeSw = activeSw;
		}

		public LocalDateTime getCreateDate() {
			return createDate;
		}

		public void setCreateDate(LocalDateTime createDate) {
			this.createDate = createDate;
		}

		//Below code represents Getter Setter Methods
		public Integer getId() {
			return id;
		}

		public void setId(Integer id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public long getRanks() {
			return ranks;
		}

		public void setRanks(long ranks) {
			this.ranks = ranks;
		}

		public String getGender() {
			return gender;
		}

		public void setGender(String gender) {
			this.gender = gender;
		}

		@Override
		public String toString() {
			return "Student [id=" + id + ", name=" + name + ", ranks=" + ranks + ", gender=" + gender + "]";
		}

		public Student(Integer id, String name, long ranks, String gender) {
			super();
			this.id = id;
			this.name = name;
			this.ranks = ranks;
			this.gender = gender;
		}

		public Student() {
			super();
			// TODO Auto-generated constructor stub
		}
	    

}
