package jm.task.core.jdbc.model;

import javax.persistence.*;
import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "users") // Имя таблицы
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Генерация идентификатора
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "lastName")
    private String lastName;

    @Column(name = "age")
    private Byte age;

    // Конструктор без параметров
    public User() {
    }

    // Конструктор для создания пользователя со всеми полями

    public User(Long id, String name, String lastname, Byte age) {
        this.id = id;
        this.name = name;
        this.lastName = lastname;
        this.age = age;
    }

    // Конструктор для создания пользователя без ID (для сохранения)

    public User(String name, String lastName, Byte age) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
    }

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

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Byte getAge() {
        return age;
    }

    public void setAge(Byte age) {
        this.age = age;
    }
}
