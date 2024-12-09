package com.lucasjose.api.shopping.shopping_api.model.DTO;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ItemDTO {
    private String productIdentifier;
    private Double price;
}
