package com.billflores.android_mvp_sample.domain.entity;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by bill on 7/12/17.
 */

public class Rutas implements Parcelable {

    private String name;
    private int id;
    private String idProcess;
    private String dateStart;
    private String dateEnd;

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.name);
        parcel.writeInt(this.id);
        parcel.writeString(this.idProcess);
        parcel.writeString(this.dateStart);
        parcel.writeString(this.dateEnd);
    }

    public Rutas() {
    }

    protected Rutas(Parcel in){
        this.name=in.readString();
        this.id=in.readInt();
        this.idProcess=in.readString();
        this.dateStart=in.readString();
        this.dateEnd=in.readString();
    }

    public static final Parcelable.Creator<Rutas> CREATOR = new Parcelable.Creator<Rutas>(){

        @Override
        public Rutas createFromParcel(Parcel parcel) {
            return new Rutas(parcel);
        }

        @Override
        public Rutas[] newArray(int i) {
            return new Rutas[i];
        }
    };

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIdProcess() {
        return idProcess;
    }

    public void setIdProcess(String idProcess) {
        this.idProcess = idProcess;
    }

    public String getDateStart() {
        return dateStart;
    }

    public void setDateStart(String dateStart) {
        this.dateStart = dateStart;
    }

    public String getDateEnd() {
        return dateEnd;
    }

    public void setDateEnd(String dateEnd) {
        this.dateEnd = dateEnd;
    }
}
