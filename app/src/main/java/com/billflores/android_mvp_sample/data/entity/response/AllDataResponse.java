package com.billflores.android_mvp_sample.data.entity.response;

import com.billflores.android_mvp_sample.data.entity.ProcesosEntity;
import com.billflores.android_mvp_sample.data.entity.RutasEntity;

import java.util.ArrayList;

/**
 * Created by Bill on 7/12/2017.
 */

public class AllDataResponse {
    private ArrayList<RutasEntity> Rutas;
    private ArrayList<ProcesosEntity> Procesos;

    public ArrayList<RutasEntity> getRutas() {
        return Rutas;
    }

    public void setRutas(ArrayList<RutasEntity> rutas) {
        Rutas = rutas;
    }

    public ArrayList<ProcesosEntity> getProcesos() {
        return Procesos;
    }

    public void setProcesos(ArrayList<ProcesosEntity> procesos) {
        Procesos = procesos;
    }
}
