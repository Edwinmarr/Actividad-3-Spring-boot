package co.edu.udec.act3.edwinmarrugo.gradescrud.repository.dao;

import co.edu.udec.act3.edwinmarrugo.gradescrud.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentDao extends JpaRepository<Student,String> {
}
