package com.filestorages.filestorage.repository.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
@Table(name = "files")
@Data
@NoArgsConstructor
public class FileEntity extends AbstractBaseEntity {
    private String name;
    private String contentType;
    private Long size;
    @Lob
    //The @Lob annotation is used to specify that the currently
    // annotated entity attribute represents a large object type.
    private byte[] data;


}



