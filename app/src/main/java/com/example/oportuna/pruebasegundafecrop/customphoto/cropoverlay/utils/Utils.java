package com.example.oportuna.pruebasegundafecrop.customphoto.cropoverlay.utils;

import android.net.Uri;

import java.io.File;

public class Utils {

    public static Uri getImageUri(String path) {
        return Uri.fromFile(new File(path));
    }
}
