package com.productblog.dtos;

import com.productblog.models.Product;
import lombok.*;


@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@Builder
public class CommentDto {
    private Long id;
    private String content;
    private Boolean status;

    private Product product;
}