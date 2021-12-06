package io;

import lombok.*;

import java.io.Serializable;

@Data
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class User implements Serializable {

    private long id;
    private String username;
    private String password;
    private transient String bankCardNumber;
    private transient String phoneNumber;
    private Address address;
}
