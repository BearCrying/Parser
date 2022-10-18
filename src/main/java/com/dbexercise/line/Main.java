package com.dbexercise.line;

import com.dbexercise.line.domain.Hospital;
import com.dbexercise.line.parser.HospitalParser;
import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        LineReader<Hospital> hospitalLineReader = new LineReader<>(new HospitalParser());
        String filename = "C:\\Users\\taege\\Desktop\\멋쟁이사자처럼\\Daily\\Lion1012\\SeoulHospital.csv";
        List<Hospital> hospitals = hospitalLineReader.readLines(filename);

        MakeSQLFile makeSQLFile = new MakeSQLFile();

        String fileName = "seoulHospital.sql";
        makeSQLFile.createFile(fileName,makeSQLFile.createSQL(hospitals));
    }
}