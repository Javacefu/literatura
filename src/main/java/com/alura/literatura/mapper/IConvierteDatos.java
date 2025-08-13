package com.alura.literatura.mapper;

public interface IConvierteDatos {

    <T> T obtenerDatos(String json, Class<T> clase);

}