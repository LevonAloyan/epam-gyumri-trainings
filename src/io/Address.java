package io;

import lombok.*;

import java.io.Serializable;

@Data
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Address implements Serializable {

    private String country;
    private String city;
    private String zipCode;
    private String street;
    private String line1;
}
