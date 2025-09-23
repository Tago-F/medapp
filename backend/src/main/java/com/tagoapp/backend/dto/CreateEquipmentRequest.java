package com.tagoapp.backend.dto;

import java.time.LocalDate;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

public class CreateEquipmentRequest {

    @Getter
    @Setter
    @NotBlank(message = "Name is mandatory")
    @Size(max = 100)
    private String name;

    @NotNull(message = "Category ID is mandatory")
    private Long categoryId;

    @NotBlank(message = "QR Identifier is mandatory")
    @Size(max = 50)
    private String qrIdentifier;

    @NotBlank(message = "Serial Number is mandatory")
    @Size(max = 50)
    private String serialNumber;

    @Size(max = 100)
    private String manufacturer;

    private LocalDate purchaseDate;

    @Size(max = 255)
    private String imageUrl;

    @Size(max = 500)
    private String notes;
}