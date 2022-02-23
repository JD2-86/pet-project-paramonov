package by.paramonov.entity;

import by.paramonov.enums.Role;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "users")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class UserEntity extends BaseEntity {
    @Column(name = "email")
    @Getter
    @Setter
    private String email;
    @Column(name = "username")
    @Getter
    @Setter
    private String username;
    @Column(name = "password")
    @Getter
    @Setter
    private String password;
    @Column(name = "first_name")
    @Getter
    @Setter
    private String firstName;
    @Column(name = "second_name")
    @Getter
    @Setter
    private String secondName;
    @Column(name = "role")
    @Getter
    @Setter
    @Enumerated(EnumType.STRING)
    private Role role;

}
