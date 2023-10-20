package com.gl4.tp_2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Spinner
import androidx.recyclerview.widget.RecyclerView
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    val spinner : Spinner by lazy { findViewById(R.id.spinner) }
    val filterEditText : EditText by lazy { findViewById(R.id.filterEditText) }
    val recycler : RecyclerView by lazy { findViewById(R.id.recycler) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var matieres = listOf<String>("Cours","TP")
        var studentsCours1 = arrayListOf<Student>(
            Student("Soumaya", "Aloui", "F"),
            Student("Khaled Saadouni", "Unknown", "M"),
            Student("Amin", "Romdhanh", "M"),
        )

        var studentsCours2 = arrayListOf<Student>(
            Student("sana", "hamdi", "F"),
            Student("Ahmed", "Amri", "M"),
            Student("Chaima", "Amri", "F"),
        )

        var students = arrayListOf<Student>()
        spinner.adapter = ArrayAdapter<String>(this,android.R.layout.simple_dropdown_item_1line, matieres)

        spinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(adapterView: AdapterView<*>?, view: View?, position: Int, id: Long) {
                var toast = Toast.makeText(applicationContext,"Vous avez selectionné : "+ matieres[position], Toast.LENGTH_SHORT)
                toast.show()
            }
            override fun onNothingSelected(adapterView: AdapterView<*>?) {
            }
        }
    }

}