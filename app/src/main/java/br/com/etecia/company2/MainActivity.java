<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
        xmlns:app="http://schemas.android.com/apk/res-auto"
        xmlns:tools="http://schemas.android.com/tools"
        android:background="#6237A8"
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        android:orientation="vertical"
        tools:context=".MainActivity">

<ImageView
        android:id="@+id/imgLogin"
                android:layout_width="100dp"
                android:layout_height="100dp"
                android:layout_gravity="center_horizontal"
                android:layout_marginTop="100dp"
                android:scaleType="centerCrop"
                android:src="@drawable/citroen" />

<EditText
        android:id="@+id/edUsername"
                android:layout_width="match_parent"
                android:layout_height="wrap_content"
                android:layout_margin="10sp"
                android:drawableEnd="@drawable/baseline_person"
                android:text="Username"
                android:textColor="@color/white"
                android:inputType="textEmailAddress"
                android:maxLength="80"
                android:padding="20sp" />

<EditText
        android:id="@+id/edtUserPassword"
                android:layout_width="match_parent"
                android:layout_height="wrap_content"
                android:layout_margin="10sp"
                android:drawableEnd="@drawable/baseline_key"
                android:text="Password"
                android:textColor="@color/white"
                android:inputType="textEmailAddress"
                android:maxLength="80"
                android:padding="20sp" />
<EditText
        android:id="@+id/edtEmail"
                android:layout_width="match_parent"
                android:layout_height="wrap_content"
                android:layout_margin="10sp"
                android:drawableEnd="@drawable/baseline_email"
                android:text="E-mail"
                android:textColor="@color/white"
                android:inputType="textEmailAddress"
                android:maxLength="80"
                android:padding="20sp" />
<EditText
        android:id="@+id/edtPhone"
                android:layout_width="match_parent"
                android:layout_height="wrap_content"
                android:layout_margin="10sp"
                android:drawableEnd="@drawable/baseline_smartphone"
                android:text="Phone"
                android:textColor="@color/white"
                android:inputType="text"
                android:maxLength="80"
                android:padding="20sp"
                />





<LinearLayout
        android:layout_width="match_parent"
                android:layout_height="wrap_content"
                android:layout_margin="20dp"
                android:orientation="vertical">
<TextView
            android:layout_width="wrap_content"
                    android:layout_height="wrap_content"
                    android:text="Aceitar termos e condições"
                    android:textColor="@color/white"
                    android:layout_marginLeft="90sp"
                    android:layout_marginBottom="15sp"/>





<Button
            android:id="@+id/btnSair"
                    android:layout_width="wrap_content"
                    android:layout_height="wrap_content"
                    android:padding="10dp"
                    android:text="SIGN UP"
                    android:layout_gravity="center"

                    android:textAllCaps="true" />



</LinearLayout>


</LinearLayout>tLayout>