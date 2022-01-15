package by.table.tableStructure.entity;

import liquibase.pro.packaged.S;
import lombok.Data;

import javax.persistence.*;
import java.util.Date;
import java.util.UUID;

@Data
@Entity
@Table(name = "tenant")
public class Tenant {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "tenant_id",nullable = false,unique = true)
    private UUID id;

    @Column(name = "name",length = 35,nullable = false,unique = true)
    private String name;

    @Column(name = "description",length = 150)
    private String description;

    @Column(name = "created_at", nullable = false)
    private Date createdAt;

    @Column(name = "updated_at", nullable = false)
    private Date updatedAt;

    public Tenant() {
    }

}
