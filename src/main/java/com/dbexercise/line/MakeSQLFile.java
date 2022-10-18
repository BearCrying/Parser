package com.dbexercise.line;

import com.dbexercise.line.domain.Hospital;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class MakeSQLFile {

    public void createFile(String fileName, StringBuffer sb) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(fileName));

        bw.write(sb.toString());
        bw.close();
    }

    public StringBuffer createSQL(List<Hospital> list){
        StringBuffer sb = new StringBuffer("INSERT INTO `likelion-db`.`seoul_hospital`\n" +
                "(`id`,`address`,`district`,`category`,`emergency_room`,`name`,`subdivision`)\n" +
                "VALUES\n");

        for (int i = 0; i < list.size() - 1; i++) {
            sb.append(list.get(i) +",\n");
        }
        sb.append(list.get(list.size() - 1) + ";");

        return sb;
    }
}