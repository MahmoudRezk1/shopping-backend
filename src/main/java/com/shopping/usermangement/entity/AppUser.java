package com.shopping.usermangement.entity;

import com.shopping.base.entity.BaseEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity(name = "sec_users")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class AppUser extends BaseEntity<Long> {
    private String firstName;
    private String lastName;
    private String userName;
    private String password;
    @ManyToMany
    @JoinTable(name = "sec_users_roles" ,joinColumns = @JoinColumn(name = "user_id")
                                        , inverseJoinColumns = @JoinColumn(name = "role_id"))
    private List<Role> roles = new ArrayList<>();
}
