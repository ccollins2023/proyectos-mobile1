package com.example.tp1;


import androidx.lifecycle.ViewModel;

public class IncrementarViewModel extends ViewModel {
    private Integer resultado;
    public int getResultado(){
        if (resultado ==null){
           resultado=0;
        }
        return resultado;
    }
    public void setResultado(int resultado){
        this.resultado=resultado;
    }
}


