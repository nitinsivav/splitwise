package model;

/**
 * Stores The Members And The Amount
 * @param payerName Name Of The Payer
 * @param totalAmount Amount Thats Been Paid
 */
public record ExpenseLine(String payerName, double totalAmount){

}