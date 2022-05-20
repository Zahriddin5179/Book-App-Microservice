package uz.pdp.mycollection.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import uz.pdp.mycollection.template.AbsEntity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class User extends AbsEntity {
    private String fullName;
    private String username;
    private String email;
    private String password;
    private String phoneNumber;
    @OneToMany(cascade = CascadeType.ALL)
    List<Role> roleList;
}
