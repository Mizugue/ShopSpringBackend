package com.ecommerce.ecom.exception;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CategoryErrorResponse {
    private int status;
    private String message;
    private Long timeStamp;
}
