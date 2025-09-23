package com.tagoapp.backend.dto;

import com.tagoapp.backend.entity.Equipment;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class EquipmentDto {
    private Long id;
    private String name;
    private CategoryDto category;
    private String status;
    private String qrIdentifier;
    private String serialNumber;
    private String manufacturer;
    private LocalDate purchaseDate;
    private String imageUrl;
    private String notes;

    // EntityからDTOへの変換ロジック
    public static EquipmentDto fromEntity(Equipment equipment) {
        EquipmentDto dto = new EquipmentDto();
        dto.setId(equipment.getId());
        dto.setName(equipment.getName());
        if (equipment.getCategory() != null) {
            dto.setCategory(CategoryDto.fromEntity(equipment.getCategory()));
        }
        dto.setStatus(equipment.getStatus());
        dto.setQrIdentifier(equipment.getQrIdentifier());
        dto.setSerialNumber(equipment.getSerialNumber());
        dto.setManufacturer(equipment.getManufacturer());
        dto.setPurchaseDate(equipment.getPurchaseDate());
        dto.setImageUrl(equipment.getImageUrl());
        dto.setNotes(equipment.getNotes());
        return dto;
    }
}