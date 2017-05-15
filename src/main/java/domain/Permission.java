package domain;

import java.io.Serializable;

/**
 * Created by 王汗超 on 2017/4/30.
 */
public class Permission implements Serializable {

    private String id;

    private String name;

    private String message;


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
}
