package co.edu.udec.act3.edwinmarrugo.gradescrud.repository.dao;

import co.edu.udec.act3.edwinmarrugo.gradescrud.model.GradeDetail;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GradeDetailDao extends JpaRepository<GradeDetail,Integer> {
}
