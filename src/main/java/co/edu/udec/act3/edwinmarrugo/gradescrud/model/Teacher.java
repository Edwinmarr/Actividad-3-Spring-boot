package co.edu.udec.act3.edwinmarrugo.gradescrud.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Table(name = "teachers")
@Data
public class Teacher {
    @Id
    @Column(name = "code")
    private String code;
    @Column(name = "salary", nullable = false)
    private float salary;
    @OneToOne
    @JoinColumn(name = "users_id")
    private User user;
    @OneToMany(mappedBy = "teacher")
    private List<GradeDetail> gradesDetail;

}
