package model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Transaction {
    //name of the card holder
    private String holder;
    private Integer sold;
    private String currency;

}
