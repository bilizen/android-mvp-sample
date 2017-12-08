package com.billflores.android_mvp_sample.data.mapper;

import com.billflores.android_mvp_sample.data.entity.RutasEntity;
import com.billflores.android_mvp_sample.data.entity.response.AllDataResponse;
import com.billflores.android_mvp_sample.domain.entity.Rutas;

import java.util.ArrayList;

/**
 * Created by bill on 7/12/17.
 */

public class RutasMapper {

    private Rutas transform(RutasEntity rutasEntity){
        Rutas rutas= new Rutas();
        if(rutasEntity==null){
            return rutas;
        }else{
            rutas.setName(rutasEntity.getA());
            rutas.setId(rutasEntity.getB());
            rutas.setIdProcess(rutasEntity.getC());
            rutas.setDateStart(rutasEntity.getD());
            rutas.setDateEnd(rutasEntity.getE());

            return rutas;
        }
    }

    public ArrayList<Rutas> transformResponse(AllDataResponse allDataResponse){
        ArrayList<Rutas> rutasArrayList = new ArrayList<>();
        if(allDataResponse==null){
            return rutasArrayList;
        }else{
            for(int i=0;i<allDataResponse.getRutas().size();i++){
                rutasArrayList.add(transform(allDataResponse.getRutas().get(i)));
            }
            return rutasArrayList;
        }

    }


}
