package models;

import play.modules.ebean.Model;
import play.modules.ebean.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "categories")
public class Category extends Model {

    @Id
    @UUID
    public String id;

    @Column(columnDefinition = "TEXT")
    public String name;


}