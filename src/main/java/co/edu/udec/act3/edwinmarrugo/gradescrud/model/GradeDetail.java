package co.edu.udec.act3.edwinmarrugo.gradescrud.model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Entity
@Data
@Table(name = "grades_detail")
public class GradeDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;
    @Column(name = "activity_name", nullable = false)
    private String activityName;
    @Column(name = "percentage", nullable = false)
    private float percentage;
    @Column(name = "grade", nullable = false)
    private float grade;
    @Column(name = "date", nullable = false)
    private LocalDateTime date;
    @ManyToOne
    @JoinColumn(name = "id",insertable=false, updatable=false)
    private Grade masterGrade;
    @ManyToOne
    @JoinColumn(name = "id",insertable=false, updatable=false)
    private Subject subject;
    @ManyToOne
    @JoinColumn(name = "teachers_code")
    private Teacher teacher;

}
