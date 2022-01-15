package by.table.tableStructure.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.UUID;

@Data
@Entity
@Table(name = "privilege")
public class Privilege {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "privilege_id",unique = true)
    private UUID id;

    @Column(name = "resource",length = 15,nullable = false)
    private String resource;

    @Column(name = "action",length = 10,nullable = false)
    private String action;

    @Column(name = "description",length = 150)
    private String description;

    public Privilege() {
    }
}
