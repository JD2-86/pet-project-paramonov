package by.paramonov.entity;

import by.paramonov.enums.Role;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "users")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@Getter
@Setter
public class UserEntity extends BaseEntity {
    @Column(name = "email")
    private String email;
    @Column(name = "username")
    private String username;
    @Column(name = "password")
    private String password;
    @Column(name = "first_name")
    private String firstname;
    @Column(name = "second_name")
    private String lastname;
    @Column(name = "role")
    @Enumerated(EnumType.STRING)
    private Role role;

}
