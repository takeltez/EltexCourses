package eltex.tasks;

import lombok.*;;
import javax.persistence.*;

@NoArgsConstructor@Entity
public class User {

    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    @Getter @Setter private Integer id;
    @Getter @Setter private String fio;
    @Getter @Setter private String phone;

    User(Integer id, String fio, String phone) {
        this.id = id;
        this.fio = fio;
        this.phone = phone;

    }
}