package co.edu.udec.act3.edwinmarrugo.gradescrud.repository.dao;

import co.edu.udec.act3.edwinmarrugo.gradescrud.model.Subject;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SubjectDao extends JpaRepository<Subject,Integer> {
}
