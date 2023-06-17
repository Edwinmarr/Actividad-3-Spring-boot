package co.edu.udec.act3.edwinmarrugo.gradescrud.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Table(name = "grades")
@Data
public class Grade {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;
    @Column(name = "university", nullable = false)
    private String university;
    @Column(name = "period", nullable = false)
    private int period;
    @ManyToOne
    @JoinColumn(name = "students_code")
    private Student student;
    @OneToMany(mappedBy = "masterGrade")
    private List<GradeDetail> gradesDetails;
}
