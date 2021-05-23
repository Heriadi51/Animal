package com.erick.animal

import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private lateinit var rvAnimals: RecyclerView
    private var list: ArrayList<Animal> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rvAnimals = findViewById(R.id.rv_animal)
        rvAnimals.setHasFixedSize(true)
        list.addAll(AnimalData.listData)
        showRecyclerList()
    }

    private fun showRecyclerList() {
        rvAnimals.layoutManager = LinearLayoutManager(this)
        val animalAdapter = AnimalAdapter(list)
        rvAnimals.adapter = animalAdapter
        animalAdapter.setOnItemClickCallback(object : AnimalAdapter.OnItemClickCallback {
            override fun onItemClicked(data: Animal) {
                showSelectedAnimal(data)
            }
        })
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        startActivity(Intent(this, About::class.java))
        return super.onOptionsItemSelected(item)
    }

    private fun showSelectedAnimal(animals: Animal) {
        Toast.makeText(this, "Kamu memilih " + animals.name, Toast.LENGTH_SHORT).show()
        val intent = Intent(this, AnimalDetail::class.java)
        intent.putExtra("NAME", animals.name)
        intent.putExtra("ICON", animals.photo)
        intent.putExtra("DESC", animals.detail)
        startActivity(intent)
    }
}