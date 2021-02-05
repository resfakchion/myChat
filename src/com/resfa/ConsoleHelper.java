package com.resfa;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConsoleHelper {
    static private BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    static public void writeMessage(String message) {
        System.out.println(message);
    }
    static public String readString() {
        while (true) {
            try {
                return reader.readLine();
            } catch (IOException e) {
                writeMessage("Произошла ошибка при попытке ввода текста. Попробуйте еще раз");
            }
        }
    }
    static public int  readInt() {
        while (true) {
            try {
                return Integer.parseInt(readString());
            } catch (NumberFormatException e) {
                writeMessage("Произошла ошибка при попытке ввода числа. Попробуйте еще раз.");
                readInt();
            }
        }
    }
}