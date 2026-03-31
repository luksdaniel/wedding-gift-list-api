package com.lucasbatista.projects.entity;

import lombok.*;
import org.springframework.data.annotation.Id;

import java.util.Objects;
import java.util.UUID;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Suggestion {

    @Id
    private UUID id;

    private String name;

    private String description;

    private String marketPlaceURL;

    private Double amount;

    private boolean chosen;

    private String buyersPhone;

    private String imageURL;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Suggestion that = (Suggestion) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
