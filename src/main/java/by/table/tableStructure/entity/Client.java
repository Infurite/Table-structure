package by.table.tableStructure.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;
@Data
@Entity
@Table(name = "client")
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "client_id",length = 50,nullable = false,unique = true)
    private Long id;

    @Column(name = "client_secret",length = 60,nullable = false)
    private String clientSecret;

    @Column(name = "resource_ids",length = 255,nullable = false)
    private String resourceIds;

    @Column (name = "scope",length = 255,nullable = false)
    private String scope;

    @Column(name = "grant_types",length = 255,nullable = false)
    private String grantTypes;

    @Column(name = "authorities",length = 255,nullable = false)
    private String authorities;

    @Column(name = "access_token_expiration",nullable = false)
    private Integer accessTokenExpiration;

    @Column(name ="refresh_token_expiration",nullable = false)
    private Integer refreshTokenExpiration;

    @Column(name = "additional_information",length = 400)
    private String additionalInformation;

    @Column(name = "auto_approve",length = 255,nullable = false)
    private String autoApprove;

    @Column (name = "created_at",nullable = false)
    private Date createdAt;

    @Column(name = "updated_at",nullable = false)
    private Date updatedAt;

    public Client() {
    }
}
