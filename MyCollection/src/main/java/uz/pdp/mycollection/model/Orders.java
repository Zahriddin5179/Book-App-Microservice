package uz.pdp.mycollection.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import uz.pdp.mycollection.template.AbsEntity;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

import java.sql.Date;
import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Orders extends AbsEntity {
    @ManyToOne
    private User user;

    private UUID bookId;

    private Date date;
}
