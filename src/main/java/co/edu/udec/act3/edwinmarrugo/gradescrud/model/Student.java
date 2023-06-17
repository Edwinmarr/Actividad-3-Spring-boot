package co.edu.udec.act3.edwinmarrugo.gradescrud.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "students")
@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {
    @Id
    @Column(name = "code")
    private String code;
    @OneToOne
    @JoinColumn(name = "users_id")
    private User user;
    @OneToMany(mappedBy = "student")
    private List<Grade> grades;

}
