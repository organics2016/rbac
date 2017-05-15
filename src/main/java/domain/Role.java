package domain;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by 王汗超 on 2017/4/30.
 */
public class Role implements Serializable {

    private String id;

    private String name;

    private String message;

    private Set<Permission> permissions = new HashSet<>();


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

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Set<Permission> getPermissions() {
        return permissions;
    }

    public void setPermissions(Set<Permission> permissions) {
        this.permissions = permissions;
    }
}
