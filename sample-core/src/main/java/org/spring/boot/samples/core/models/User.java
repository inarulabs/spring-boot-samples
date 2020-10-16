package org.spring.boot.samples.core.models;

import org.springframework.security.core.GrantedAuthority;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = User.TABLE_NAME)
public class User {

    public static final String TABLE_NAME = "user";

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false, unique = true)
    private String email;

    @Column(nullable = false)
    private String password;

    @ElementCollection
    @CollectionTable(name = "user_role")
    @Column(name = "role", length = 16)
    @Enumerated(EnumType.STRING)
    private Set<Role> roles = new HashSet<>();

    public enum Role implements GrantedAuthority {
        ADMIN, OPERATOR, MANAGER, MEMBER;

        @Override
        public String getAuthority() {
            return this.name();
        }
    }
}
