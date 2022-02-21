package com.filestorages.filestorage.repository.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity//@Entity annotation defines that a class can be mapped to a table
@Data
//@Data is a convenient shortcut annotation that bundles the features of
// @ToString, @EqualsAndHashCode, @Getter / @Setter and @RequiredArgsConstructor together: In other words, @Data generates all the boilerplate that is normally
// associated with simple POJOs (Plain Old Java Objects) and beans:
@NoArgsConstructor
@Table(name="users")//sets tables name to users
public class UserEntity {
    @Id//Each JPA entity must have a primary key which uniquely identifies it
    @GeneratedValue(strategy = GenerationType.AUTO)
    //We can choose from four id generation strategies with the strategy element.
    //The value can be AUTO, TABLE, SEQUENCE, or IDENTITY.
    //auto will create the next incremented id in database
    private long id;
    private String name;
    private String username;
    private String password;
    private boolean isAdmin;


}
