package app.hl7_types.segment;

import app.hl7_parser.Hl7Field;
import app.hl7_parser.Hl7Serializeable;
import app.parsing.EncodingCharacters;

/**
 * PD1
 */
@Hl7Serializeable(layer = 1)
public class PD1 {

    @Hl7Field
    private String line;

    public PD1(String line, EncodingCharacters encodingCharacters) {
        this.line = line;
    }

    @Override
    public String toString(){
        return this.line;
    }
}