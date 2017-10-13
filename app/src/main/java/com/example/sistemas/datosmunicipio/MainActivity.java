package com.example.sistemas.datosmunicipio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.example.sistemas.datosmunicipio.api.DatosApi;
import com.example.sistemas.datosmunicipio.models.Municipio;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

    public final static String TAG ="DATOS COLOMBIA";
    private Retrofit retrofit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        retrofit=new Retrofit.Builder().baseUrl("https://www.datos.gov.co/resource/")
                .addConverterFactory(GsonConverterFactory.create()).build();
        obtenerDatos();
    }

    public void obtenerDatos(){

        DatosApi service=retrofit.create(DatosApi.class);
        Call<List<Municipio>>municipioCall=service.obtenerListaMunicipios();

        municipioCall.enqueue(new Callback<List<Municipio>>() {
            @Override
            public void onResponse(Call<List<Municipio>> call, Response<List<Municipio>> response) {

                if(response.isSuccessful()){
                    List lista=response.body();
                    for(int i=0;i<lista.size();i++){
                        Municipio m=(Municipio) lista.get(i);
                        Log.i(TAG,"Nombre: "+m.getNombreMunicipio()+" Alcalde: "+m.getNombreAlcalde());

                    }
                }
                else {
                    Log.e(TAG,"onResponse"+response.errorBody());
                }
            }

            @Override
            public void onFailure(Call<List<Municipio>> call, Throwable t) {

                Log.e(TAG,"onFailure"+t.getMessage());
            }
        });
    }
}
