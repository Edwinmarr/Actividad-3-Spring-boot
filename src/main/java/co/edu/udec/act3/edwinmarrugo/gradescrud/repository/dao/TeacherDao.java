package co.edu.udec.act3.edwinmarrugo.gradescrud.repository.dao;

import co.edu.udec.act3.edwinmarrugo.gradescrud.model.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeacherDao extends JpaRepository<Teacher,String> {
}
