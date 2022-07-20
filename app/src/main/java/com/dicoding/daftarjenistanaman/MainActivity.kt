package com.dicoding.daftarjenistanaman

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private lateinit var rvPlants: RecyclerView
    private var list: ArrayList<Plant> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.title = null
        rvPlants = findViewById(R.id.rv_typeplant)
        rvPlants.setHasFixedSize(true)

        list.addAll(PlantsData.listData)
        showRecyclerList()
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {

        return when(item.itemId) {
            R.id.person -> {
                MoveActivityToAbout()
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }


    private fun MoveActivityToAbout() {
        val moveWithDataIntent = Intent(this@MainActivity, AboutActivity::class.java)
        moveWithDataIntent.putExtra(AboutActivity.EXTRA_NAME, "Muhammad Ashari Abdillah")
        moveWithDataIntent.putExtra(AboutActivity.EXTRA_EMAIL, "ashariabdillah5@gmail.com")
        startActivity(moveWithDataIntent)
    }


    private fun showRecyclerList() {
        rvPlants.layoutManager = LinearLayoutManager(this)
        val listPlantAdapter = ListPlantAdapter(list)
        rvPlants.adapter = listPlantAdapter

        listPlantAdapter.setOnItemClickCallback(object : ListPlantAdapter.OnItemClickCallback {
            override fun onItemClicked(data: Plant) {
                showSelectedPlant(data)
            }

        })

    }

    private fun showSelectedPlant(plant: Plant) {
        val intent = Intent(this@MainActivity, DetailActivity::class.java)
        intent.putExtra(DetailActivity.EXTRA_NAME_OF_PLANT, plant.name)
        intent.putExtra(DetailActivity.EXTRA_NAME_SCIENTIFIC_OF_PLANT, plant.nameScientific)
        intent.putExtra(DetailActivity.EXTRA_KINGDOM_OF_PLANT, plant.kingdom)
        intent.putExtra(DetailActivity.EXTRA_COMEFROM_OF_PLANT, plant.comeFrom)
        intent.putExtra(DetailActivity.EXTRA_DETAIL_OF_PLANT, plant.detail)
        intent.putExtra(DetailActivity.EXTRA_PHOTO_OF_PLANT, plant.photo)
        startActivity(intent)
    }
}
