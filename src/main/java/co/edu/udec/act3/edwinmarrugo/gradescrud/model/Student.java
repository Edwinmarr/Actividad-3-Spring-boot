package co.edu.udec.act3.edwinmarrugo.gradescrud.model;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.Hibernate;

import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "students")
@Builder
@Getter
@Setter
@ToString
@RequiredArgsConstructor
@AllArgsConstructor
public class Student {
    @Id
    @Column(name = "code")
    private String code;
    @OneToOne
    @JoinColumn(name = "users_id")
    private User user;
    @OneToMany(mappedBy = "student")
    @ToString.Exclude
    private List<Grade> grades;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        Student student = (Student) o;
        return getCode() != null && Objects.equals(getCode(), student.getCode());
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}
