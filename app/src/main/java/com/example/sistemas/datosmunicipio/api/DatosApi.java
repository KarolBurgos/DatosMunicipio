package com.example.sistemas.datosmunicipio.api;



import com.example.sistemas.datosmunicipio.models.Municipio;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by sistemas on 9/10/17.
 */

public interface DatosApi {
    @GET("pfet-63uw.json")
    Call<List<Municipio>> obtenerListaMunicipios();
}
