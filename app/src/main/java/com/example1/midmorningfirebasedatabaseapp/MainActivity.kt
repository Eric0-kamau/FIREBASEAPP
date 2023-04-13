package com.example1.midmorningfirebasedatabaseapp

import android.app.ProgressDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AlertDialog

class MainActivity : AppCompatActivity() {
    lateinit var mEdtName:EditText
    lateinit var mEdtEmail:EditText
    lateinit var mEdtIdNumber:EditText
    lateinit var mBtnSave:Button
    lateinit var mBtnView:Button
    lateinit var progressDialog: ProgressDialog
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mEdtName = findViewById(R.id.mEdtName)
        mEdtEmail = findViewById(R.id.mEdtEmail)
        mEdtIdNumber = findViewById(R.id.mEdtIdNumber)
        mBtnSave = findViewById(R.id.mBtnSave)
        mBtnView = findViewById(R.id.mBtnView)
        progressDialog = ProgressDialog(this)
        progressDialog.setTitle("Saving")
        progressDialog.setMessage("Please wait...")
        mBtnSave.setOnClickListener {

        }
        mBtnView.setOnClickListener {

        }
    }
}