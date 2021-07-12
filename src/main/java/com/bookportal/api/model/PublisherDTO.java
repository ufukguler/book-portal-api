package com.bookportal.api.model;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotBlank;

@Data
public class PublisherDTO {
    @NotBlank
    @ApiModelProperty(example = "some publisher")
    private String name;
}
