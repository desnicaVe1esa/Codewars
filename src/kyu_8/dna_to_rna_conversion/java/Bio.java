package kyu_8.dna_to_rna_conversion.java;

public class Bio {
    public String dnaToRna(String dna) {
        return dna.replaceAll("T", "U");
    }
}