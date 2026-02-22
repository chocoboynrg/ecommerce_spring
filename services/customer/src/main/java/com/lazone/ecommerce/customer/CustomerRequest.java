package com.lazone.ecommerce.customer;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;

public record CustomerRequest(
         String id,
         @NotNull(message = "Customer firstname is required")
         String firstname,
         @NotNull(message = "Customer lastname is required")
         String lastname,
         @NotNull(message = "Customer email is required")
         @Email(message = "customer email is not valid email adress")
         String email,
         Address address
) {
}
