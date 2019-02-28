package com.swoosh.brian.swooshclone.Model

import android.os.Parcel
import android.os.Parcelable


class Players constructor(var league: String, var skill:String) : Parcelable{
    constructor(parcel: Parcel) : this(
        parcel.readString(),
        parcel.readString()
    ) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(league)
        parcel.writeString(skill)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<Players> {
        override fun createFromParcel(parcel: Parcel): Players {
            return Players(parcel)
        }

        override fun newArray(size: Int): Array<Players?> {
            return arrayOfNulls(size)
        }
    }


}