package com.organics.entity;

import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.io.Serializable;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 * Created by 王汗超 on 2017/4/30.
 */
public class Role implements Serializable {

    @Id
    private String id;

    private String name;

    @ManyToMany
    private Set<Permission> permissions = new LinkedHashSet<>();


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Permission> getPermissions() {
        return permissions;
    }

    public void setPermissions(Set<Permission> permissions) {
        this.permissions = permissions;
    }
}
