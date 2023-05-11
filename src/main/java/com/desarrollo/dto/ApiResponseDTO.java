package com.desarrollo.dto;

import com.desarrollo.util.Meta;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@NoArgsConstructor
@AllArgsConstructor
@Data public class ApiResponseDTO<T> {
    private Meta meta;
    public T data;
}
