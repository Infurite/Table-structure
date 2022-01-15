package by.table.tableStructure.entity;

import lombok.Data;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;
import java.util.UUID;

@RequiredArgsConstructor
@Data
@Entity
@Table(name = "users")
public class Users {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "users_id",nullable = false,unique = true)
    private UUID id;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "tenant",nullable = false)
    private UUID tenant;

    @Column(name = "email",length = 35,nullable = false,unique = true)
    private String email;

    @Column(name = "password",length = 35,nullable = false)
    private String password;

    @Column(name = "is_locked" , nullable = false)
    private boolean isLocked;

    @Column(name = "is_deleted" , nullable = false)
    private boolean isDeleted;

    @Column(name = "is_activated",nullable = false)
    private boolean isActivated;

    public Users() {
    }
}
