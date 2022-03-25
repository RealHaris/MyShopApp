package com.nst.myshopapp.utils

import android.app.Activity
import android.content.Intent
import android.net.Uri
import android.provider.MediaStore
import android.webkit.MimeTypeMap
import java.net.URI

object Constants {
    const val USERS : String = "users"
    const val MYSHOPAPP_PREF : String = "MyShopAppPrefs"
    const val LOGGED_IN_USERNAME : String = "logged_in_username"
    const val EXTRA_USER_DETAILS : String = "extra_user_details"
    const val READ_STORAGE_PERMISSION_CODE = 2
    const val PICK_IMAGE_REQUEST_CODE = 1

    const val MALE : String = "Male"
    const val FEMALE : String = "Female"

    const val MOBILE : String = "mobile"
    const val GENDER : String = "gender"
    const val IMAGE : String = "image"

    const val USER_PROFILE_IMAGE : String = "User_Profile_Image"

    const val COMPLETE_PROFILE : String = "profileCompleted"


    fun showImageChooser(activity : Activity){
        val galleryIntent = Intent(
            Intent.ACTION_PICK,
            MediaStore.Images.Media.EXTERNAL_CONTENT_URI
        )
        //Launches the image selection of phone storage using the constant code
        activity.startActivityForResult(galleryIntent, PICK_IMAGE_REQUEST_CODE)
    }

    // c:/user/Muhammad Haris/download/homer.jpg
    fun getFileExtension(activity: Activity,uri :Uri?): String? {
        return  MimeTypeMap.getSingleton()
            .getExtensionFromMimeType(activity.contentResolver.getType(uri!!))
    }
}