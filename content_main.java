<?xml version="1.0" encoding="utf-8"?>
<RelativeLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    app:layout_behavior="@string/appbar_scrolling_view_behavior"
    tools:context=".MainActivity"
    android:layout_marginTop="6dp"
    tools:showIn="@layout/activity_main"
    android:background="#FFFFFF">
    <ImageView
        android:layout_width="140dp"
        android:layout_height="140dp"
        android:src="@drawable/logo"
        android:layout_marginTop="20dp"
        android:layout_centerHorizontal="true"
        android:id="@+id/mainlogo"
        />
    <TextView
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Add a Note!"
        android:textColor="#000"
        android:id="@+id/addanote"
        android:textSize="20dp"
        android:layout_centerHorizontal="true"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintLeft_toLeftOf="parent"
        app:layout_constraintRight_toRightOf="parent"
        android:fontFamily="@font/opensan"
        app:layout_constraintTop_toTopOf="@+id/mainlogo" />
    <ListView
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        android:id="@+id/listview"
        android:layout_marginLeft="12dp"
        android:layout_marginRight="12dp"
        android:dividerHeight="10.0sp"
        android:divider="@android:color/transparent"
        >
    </ListView>
    <com.google.android.gms.ads.AdView
        xmlns:ads="http://schemas.android.com/apk/res-auto"
        android:id="@+id/adView"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_centerHorizontal="true"
        android:layout_alignParentBottom="true"
        ads:adSize="BANNER"
        ads:adUnitId="ca-app-pub-3940256099942544/6300978111"
        >
    </com.google.android.gms.ads.AdView>
</RelativeLayout>
