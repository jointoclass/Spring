package com.dw.dynamic.model;

import com.dw.dynamic.DTO.UserProductDTO;
import jakarta.persistence.*;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Entity
@Table(name = "user_product") // 현재 사용중인 제품
public class UserProduct {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name ="user_name")
    private User user;

    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;

    public UserProductDTO toDTO(){
        return new UserProductDTO(
          this.id,
          this.user.getUserName(),
          this.product.toDTO()
        );
    }
}
