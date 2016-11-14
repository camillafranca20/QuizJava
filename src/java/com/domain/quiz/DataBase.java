package com.domain.quiz;

import java.util.ArrayList;

/**
 *
 * @author Gustavo
 */
public class DataBase {
    private static ArrayList<Usuarios> usuarios = new ArrayList<>();
    public static ArrayList<Usuarios> getUsuarios(){
        return usuarios;
    }
}