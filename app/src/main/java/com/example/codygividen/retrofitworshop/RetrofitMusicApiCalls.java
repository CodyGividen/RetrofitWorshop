package com.example.codygividen.retrofitworshop;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface RetrofitMusicApiCalls {
    @GET("{artist}/{title}")
    Call<SongLyrics> getSongLyrics(@Path("artist") String artist, @Path("title") String title);


    class SongLyrics{
        @SerializedName("lyrics")
        private String lyrics;

        public String getLyrics() {
            return lyrics;
        }
    }
}
