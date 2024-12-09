package com.lucasjose.api.shopping.shopping_api.model;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Item {
    private String productIdentifier;
    private Double price;
}
