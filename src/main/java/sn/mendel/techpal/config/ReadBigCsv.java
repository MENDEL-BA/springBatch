package sn.mendel.techpal.config;


import sn.mendel.techpal.entities.BusinessEmp;

import java.io.BufferedReader;
import java.io.IOException;

 class ReadBigCsv {

    private static boolean ifHasNext(BufferedReader bufferedReader) throws IOException {
        String currentLine;

        while((currentLine = bufferedReader.readLine()) != null){
            return true;
        }
        return false;
    }


}
