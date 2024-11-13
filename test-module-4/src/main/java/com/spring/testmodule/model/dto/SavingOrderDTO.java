package com.spring.testmodule.model.dto;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PastOrPresent;
import lombok.Data;

import java.time.LocalDate;

@Data
public class SavingOrderDTO {
    @NotNull(message = "Trường sản phẩm trống")
    private Long itemId;

    @PastOrPresent(message = "Ngày phải từ ngày hôm nay chở lại")
    @NotNull(message = "Trường ngày mua trống")
    private LocalDate orderDate;

    @NotNull(message = "Trường số lượng trống")
    @Min(value = 1, message = "Số lượng phải > 0")
    private int itemCount;
}
