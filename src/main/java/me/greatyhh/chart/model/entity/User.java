package me.greatyhh.chart.model.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author greatyhh
 * @since 2019-01-17
 */
public class User extends Model<User> {

    private static final long serialVersionUID = 1L;

    /**
     * ??
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * ??
     */
    private String name;

    /**
     * ??
     */
    private Integer age;

    /**
     * ?? 0-? 1-?
     */
    private Integer sex;

    /**
     * ??
     */
    private String nickname;

    /**
     * ??
     */
    private LocalDateTime birthday;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public LocalDateTime getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDateTime birthday) {
        this.birthday = birthday;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "User{" +
        "id=" + id +
        ", name=" + name +
        ", age=" + age +
        ", sex=" + sex +
        ", nickname=" + nickname +
        ", birthday=" + birthday +
        "}";
    }
}
