package flavia.dev.backend_criptografia.controller.DTO;

public record CreateTransactionRequest(String userDocument,
        String creditCardToken,
        Long value) {

}
