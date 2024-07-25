package flavia.dev.backend_criptografia.controller.DTO;

import flavia.dev.backend_criptografia.entiry.Transaction;

public record TransactionResponse(Long id,
        String userDocument,
        String creditCardToken,
        Long value) {

public static TransactionResponse fromEntity(Transaction entity) {
return new TransactionResponse(
entity.getTransactionId(),
entity.getRawUserDocument(),
entity.getRawCreditCardToken(),
entity.getTransactionValue()
);}

}
