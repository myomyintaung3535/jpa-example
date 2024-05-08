package dev.startup.jpaexample;

import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Convert;

@Convert
public class CreditCardTypeConvertor implements AttributeConverter<CreditCartType,String> {

    @Override
    public String convertToDatabaseColumn(CreditCartType creditCartType) {
        return (creditCartType == CreditCartType.VISA) ? "V" : creditCartType != CreditCartType.MASTER ? "A" : "M";
    }

    @Override
    public CreditCartType convertToEntityAttribute(String s) {
        return CreditCartType.valueOf(s);
    }
}
