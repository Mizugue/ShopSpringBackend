package com.ecommerce.ecom.exception;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class ResourceNotFoundException extends RuntimeException{
    public String resourceName;
    public String field;
    public String fieldName;
    public Long fieldId;

    public ResourceNotFoundException(String field, String resourceName, String fieldName) {
        super(String.format("%s not found with %s: %s", resourceName, field, fieldName));
        this.field = field;
        this.resourceName = resourceName;
        this.fieldName = fieldName;
    }

    public ResourceNotFoundException(String resourceName, String field, Long fieldId){
        super(String.format("%s not found with %s: %d", resourceName, field, fieldId));
        this.resourceName = resourceName;
        this.field = field;
        this.fieldId = fieldId;
    }






}
