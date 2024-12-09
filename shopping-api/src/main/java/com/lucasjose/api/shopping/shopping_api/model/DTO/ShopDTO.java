package com.lucasjose.api.shopping.shopping_api.model.DTO;

import com.lucasjose.api.shopping.shopping_api.model.Item;
import lombok.*;

import java.util.Date;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ShopDTO {
    private String id;
    private String userIdentifier;
    private Date date;
    private List<Item> items;
    private Double total;
}
