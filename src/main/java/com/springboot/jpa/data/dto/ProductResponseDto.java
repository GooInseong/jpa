package com.springboot.jpa.data.dto;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@Builder
@NoArgsConstructor
public class ProductResponseDto {

    private Long number;
    private String name;
    private Integer price;
    private Integer stock;
}
