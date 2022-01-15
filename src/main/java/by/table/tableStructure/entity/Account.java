package by.table.tableStructure.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;
import java.util.UUID;

@Data
@Entity
@Table(name = "account")
public class Account  {

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinColumn(name = "users_id",nullable = false)
    private UUID users;

    @Column(name = "first_name",length = 35,nullable = false)
    private String firstName;

    @Column(name = "last_name",length = 35,nullable = false)
    private String lastName;

    @Column(name = "gender",length = 1,nullable = false)
    private String gender;

    @Column(name = "date_of_birth",nullable = false)
    private Date dateOfBirth;

    @Column (name = "created_at",nullable = false)
    private Date createdAt;

    @Column(name = "updated_at",nullable = false)
    private Date updatedAt;

    public Account() {
    }
}
