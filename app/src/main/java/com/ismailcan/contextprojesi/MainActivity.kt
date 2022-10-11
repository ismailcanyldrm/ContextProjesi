package com.ismailcan.contextprojesi

import android.content.DialogInterface
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    lateinit var sharedPreferences: SharedPreferences
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
       /* Toast.makeText(this@MainActivity ,"hoşgeldin!", Toast.LENGTH_LONG).show()*/
        var sharedPreferences = this.getSharedPreferences("com.ismailcan.contextprojesi", MODE_PRIVATE)
    }

    fun kaydet(view: View) {
        val kullaniciAdi = editText.text.toString()
        sharedPreferences.edit().putString("kullanici",kullaniciAdi).apply()
        
    }
/*
    fun mesajGoster(view: View){
        val uyariMesaji = AlertDialog.Builder(this)
        uyariMesaji.setTitle("Hatalı Şifre")
        uyariMesaji.setMessage("Şifreyi Yanlış Girdiniz. Tekrar Denemek İstermisiniz?")
        uyariMesaji.setPositiveButton("evet", DialogInterface.OnClickListener { dialogInterface, i ->
            Toast.makeText(this ,"Evet e basıldı." , Toast.LENGTH_LONG).show()
        })

        uyariMesaji.setNegativeButton("Hayır"){dialogInterface , i ->
            Toast.makeText(this,"Hayır seçildi. Çıkış yapılıyor.",Toast.LENGTH_LONG).show()
        }

        uyariMesaji.setNeutralButton("Karasızım"){dialogInterface , i ->
            Toast.makeText(this,"kazarsızım seçildi. En kötü karar kararsızlıktan iyidir.",Toast.LENGTH_LONG).show()
            
        }
        uyariMesaji.show()


    }
*/

}