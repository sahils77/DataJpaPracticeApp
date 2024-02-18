package in.sahil.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import in.sahil.binding.Student;
import jakarta.transaction.Transactional;

public interface StudentRepository extends JpaRepository<Student, Integer>
{

	@Query("delete from Student where id=:sid")
	@Modifying
	@Transactional
	public void deleteStudent(Integer sid);
	
	@Query("update Student set ranks=:ranks where id=:sid")
	@Modifying
	@Transactional
	public void updateStudent(Long ranks, Integer sid);
	
	
	@Query("insert into Student(id,gender,name,ranks) values(:id,:gender,:name,:ranks)")
	@Modifying
	@Transactional
	public void insertStudent(Integer id, String gender, String name, Long ranks);
	
	
	
	
	
	
}
