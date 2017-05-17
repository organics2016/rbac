package entity;

import dto.UserDto;
import tools.CodeUtils;

import javax.persistence.*;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.UUID;

/**
 * Created by 王汗超 on 2017/4/30.
 */

@Entity
@Table(indexes = {
        @Index(name = "t_user_username", columnList = "username", unique = true)
})
public class User extends BaseEntity {

    @Id
    private String id;

    private String username;

    private String password;

    private String salt;

    @ManyToMany
    private Set<Role> roles = new LinkedHashSet<>();

    public User createUser(UserDto dto) {

        // 1、初始化用户ID
        String userId = UUID.randomUUID().toString();

        // 2、初始化salt
        String salt = CodeUtils.getRandomString(6);

        // 3、初始化password
        String encryptPassword = CodeUtils.encoderByMd5(dto.getPassword() + salt);

        this.id = userId;
        this.username = dto.getUsername();
        this.password = encryptPassword;
        this.salt = salt;

        return this;
    }

    public User modifyPassword(String newPwd) {
        // 2、初始化salt
        String salt = CodeUtils.getRandomString(6);

        // 3、初始化password
        String encryptPassword = CodeUtils.encoderByMd5(newPwd + salt);

        this.salt = salt;
        this.password = encryptPassword;

        return this;
    }


    public String getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getSalt() {
        return salt;
    }

    public Set<Role> getRoles() {
        return roles;
    }
}
