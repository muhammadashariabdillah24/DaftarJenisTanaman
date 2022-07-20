package com.dicoding.daftarjenistanaman

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class DetailActivity : AppCompatActivity() {

    companion object {
        const val EXTRA_NAME_OF_PLANT = "extra_name_of_plant"
        const val EXTRA_NAME_SCIENTIFIC_OF_PLANT = "extra_name_scientific_of_plant"
        const val EXTRA_KINGDOM_OF_PLANT = "extra_kingdom_of_plant"
        const val EXTRA_COMEFROM_OF_PLANT = "extra_comefrom_of_plant"
        const val EXTRA_DETAIL_OF_PLANT = "extra_detail_of_plant"
        const val EXTRA_PHOTO_OF_PLANT = "extra_photo_of_plant"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)
        supportActionBar?.title = null

        val tvNamePlant: TextView = findViewById(R.id.tv_name_plant)
        tvNamePlant.text = intent.getStringExtra(EXTRA_NAME_OF_PLANT)

        val tvNameScientific: TextView = findViewById(R.id.tv_name_scientific_plant)
        tvNameScientific.text = intent.getStringExtra(EXTRA_NAME_SCIENTIFIC_OF_PLANT)

        val tvKingdomOfPlant: TextView = findViewById(R.id.tv_name_kingdom_plant)
        tvKingdomOfPlant.text = intent.getStringExtra(EXTRA_KINGDOM_OF_PLANT)

        val tvComefromPlant: TextView = findViewById(R.id.tv_plant_come_from)
        tvComefromPlant.text = intent.getStringExtra(EXTRA_COMEFROM_OF_PLANT)

        val tvDetailPlant: TextView = findViewById(R.id.tv_detail_plant)
        tvDetailPlant.text = intent.getStringExtra(EXTRA_DETAIL_OF_PLANT)

        val ivPhotoPlant: ImageView = findViewById(R.id.iv_photo_plant)
        ivPhotoPlant.setImageResource(intent.getIntExtra(EXTRA_PHOTO_OF_PLANT, 0))
    }
}